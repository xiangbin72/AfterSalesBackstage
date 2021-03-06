package com.jinsong.mapper;

import com.jinsong.model.Install;
import com.jinsong.model.Repair;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InstallMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install
     *
     * @mbg.generated Wed Feb 28 14:56:06 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install
     *
     * @mbg.generated Wed Feb 28 14:56:06 CST 2018
     */
    int insert(Install record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install
     *
     * @mbg.generated Wed Feb 28 14:56:06 CST 2018
     */
    Install selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install
     *
     * @mbg.generated Wed Feb 28 14:56:06 CST 2018
     */
    List<Install> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install
     *
     * @mbg.generated Wed Feb 28 14:56:06 CST 2018
     */
    int updateByPrimaryKey(Install record);
    
    /**
     * 通过hospital_name或者engineer来搜索repair工单
     */
    List<Install> selectBySearch(String searchInfo);
    
    /**
     * 通过工程师account来搜索未完成的Install工单
     */
	List<Install> selectUnfinishedInstallByEngineer(String account);
	
	/**
     * 通过工程师account来搜索已经完成的Install工单
     */
	List<Install> selectFinishedInstallByEngineer(String account);
}