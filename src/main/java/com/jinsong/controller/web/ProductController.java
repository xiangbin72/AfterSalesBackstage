package com.jinsong.controller.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jinsong.model.Product;
import com.jinsong.service.CompanyService;
import com.jinsong.util.JsUtil;

/**
 * @author Jinsong
 * @email 188949420@qq.com
 * @date 2018年2月25日
 */
@RestController
@RequestMapping("/web")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    CompanyService companyService;

    /**
     * 跳转到登记设备信息页面
     */
    @GetMapping("/product")
    public ModelAndView insertProductView() {

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 注意 !!!!!!!!!!!!!!!!!!!!!!!!
        // ModelAndView配置子路径，如下这样写就行了，开头不用加斜杠////////////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ModelAndView model = new ModelAndView("product/product_insert");

        return model;
    }

    /**
     * insert新的设备信息
     */
    @PostMapping("/product")
    public ModelAndView insertProductAction(@ModelAttribute Product product,
                                            BindingResult bindingResult) {
        //表单提交失败，报错Validation failed for object，因此添加BindingResult bindingResult
        //听说是因为使用了java.util.Date，应该使用java.sql.Date


        try {
            // 服务返回>0成功，否则失败
            // 但是返回给前端的code=0表示成功
            if (companyService.insertProduct(product) > 0) {
                return new ModelAndView("product/product_insert_success");
            }
        } catch (Exception e) {
            logger.error("提交设备信息失败" + e.getMessage());
        }
        return new ModelAndView("product/product_insert_fail");
    }

    /**
     * 获得所有售后部门设备信息product
     */
    @GetMapping("/product/list")
    public ModelAndView selectAllProduct(@RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {

        ModelAndView model = new ModelAndView("product/product_all");

        PageHelper.startPage(pn, 8);
        List<Product> list = companyService.selectAllProduct();

        PageInfo<Product> pageInfo = new PageInfo<Product>(list);

        model.addObject("pageInfo", pageInfo);
        return model;

    }

    /**
     * 根据id获得单个product
     */
    @GetMapping("/product/{id}")
    public ModelAndView selectProductById(@PathVariable("id") long id) {
        ModelAndView model = new ModelAndView("product/product_detail");
        Product product = companyService.selectProductById(id);
        model.addObject("model", product);
        return model;
    }

    /**
     * 根据id删除售后部门设备信息product
     */
    @DeleteMapping("/product/{id}")
    public String deleteProductById(@PathVariable("id") long id) {
        try {
            if (companyService.deleteProductById(id) > 0) {
                return JsUtil.getJSONString(0, "设备信息删除成功");

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return JsUtil.getJSONString(1, "删除失败");
    }

    /**
     * 根据id修改售后部门设备信息product
     * <p>
     * form表单只能用GET和POST方式
     * <p>
     * 但如果我们在表单内添加一个隐藏的input标签如下 <input type="hidden" name="_method" value="put" />
     * 并且表单提交仍然写POST
     * <p>
     * Springboot会自动识别这个隐藏input，并调用PUT方式的Controller方法来接受
     * <p>
     * 具体可以看factory_detail.html页面是怎么写的
     */
    @PutMapping("/product")
    public ModelAndView updateProduct(@ModelAttribute Product product, BindingResult bindingResult) {

        System.out.println("Put方式表单提交生效");
        try {
            if (companyService.updateProduct(product) > 0) {
                return new ModelAndView("product/product_update_success");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return new ModelAndView("product/product_update_fail");
    }

    /**
     * 跳转到product搜索页面
     */
    @GetMapping("/product/search")
    public ModelAndView productSearchView() {
        ModelAndView model = new ModelAndView("product/product_search");
        return model;
    }

    /**
     * 搜索动作
     */
    @PostMapping("/product/search")
    public ModelAndView productSearchAction(@RequestParam("searchInfo") String searchInfo) {
        ModelAndView model = new ModelAndView("product/product_search_result");
        List<Product> productList = companyService.selectProductBySearch(searchInfo);

        if (productList.size() != 0) {
            model.addObject("productList", productList);
        }

        return model;
    }
}
