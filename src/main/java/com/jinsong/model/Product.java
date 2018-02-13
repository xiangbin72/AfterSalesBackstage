package com.jinsong.model;

import java.util.Date;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.gmt_create
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.gmt_modified
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.serial_number
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String serialNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_name
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_model
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String productModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_type
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String productType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hospital_name
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String hospitalName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hospital_address
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String hospitalAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hospital_department
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String hospitalDepartment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hospital_contact
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String hospitalContact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hospital_tel
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String hospitalTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.status
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.status_change_time
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Date statusChangeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.status_operator
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String statusOperator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.repair_times
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Integer repairTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.maintenance_times
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Integer maintenanceTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.month_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Integer monthSampleCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.day_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Integer daySampleCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.current_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Integer currentSampleCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.region
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String region;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.province
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.city
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.district
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String district;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.ship_date
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private Date shipDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.remarks
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.gmt_create
     *
     * @return the value of product.gmt_create
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.gmt_create
     *
     * @param gmtCreate the value for product.gmt_create
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.gmt_modified
     *
     * @return the value of product.gmt_modified
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.gmt_modified
     *
     * @param gmtModified the value for product.gmt_modified
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.serial_number
     *
     * @return the value of product.serial_number
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.serial_number
     *
     * @param serialNumber the value for product.serial_number
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_name
     *
     * @return the value of product.product_name
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_name
     *
     * @param productName the value for product.product_name
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_model
     *
     * @return the value of product.product_model
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getProductModel() {
        return productModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_model
     *
     * @param productModel the value for product.product_model
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_type
     *
     * @return the value of product.product_type
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_type
     *
     * @param productType the value for product.product_type
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hospital_name
     *
     * @return the value of product.hospital_name
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hospital_name
     *
     * @param hospitalName the value for product.hospital_name
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hospital_address
     *
     * @return the value of product.hospital_address
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getHospitalAddress() {
        return hospitalAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hospital_address
     *
     * @param hospitalAddress the value for product.hospital_address
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hospital_department
     *
     * @return the value of product.hospital_department
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getHospitalDepartment() {
        return hospitalDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hospital_department
     *
     * @param hospitalDepartment the value for product.hospital_department
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setHospitalDepartment(String hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hospital_contact
     *
     * @return the value of product.hospital_contact
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getHospitalContact() {
        return hospitalContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hospital_contact
     *
     * @param hospitalContact the value for product.hospital_contact
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setHospitalContact(String hospitalContact) {
        this.hospitalContact = hospitalContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hospital_tel
     *
     * @return the value of product.hospital_tel
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getHospitalTel() {
        return hospitalTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hospital_tel
     *
     * @param hospitalTel the value for product.hospital_tel
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.status
     *
     * @return the value of product.status
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.status
     *
     * @param status the value for product.status
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.status_change_time
     *
     * @return the value of product.status_change_time
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Date getStatusChangeTime() {
        return statusChangeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.status_change_time
     *
     * @param statusChangeTime the value for product.status_change_time
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setStatusChangeTime(Date statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.status_operator
     *
     * @return the value of product.status_operator
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getStatusOperator() {
        return statusOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.status_operator
     *
     * @param statusOperator the value for product.status_operator
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setStatusOperator(String statusOperator) {
        this.statusOperator = statusOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.repair_times
     *
     * @return the value of product.repair_times
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Integer getRepairTimes() {
        return repairTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.repair_times
     *
     * @param repairTimes the value for product.repair_times
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setRepairTimes(Integer repairTimes) {
        this.repairTimes = repairTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.maintenance_times
     *
     * @return the value of product.maintenance_times
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Integer getMaintenanceTimes() {
        return maintenanceTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.maintenance_times
     *
     * @param maintenanceTimes the value for product.maintenance_times
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setMaintenanceTimes(Integer maintenanceTimes) {
        this.maintenanceTimes = maintenanceTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.month_sample_count
     *
     * @return the value of product.month_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Integer getMonthSampleCount() {
        return monthSampleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.month_sample_count
     *
     * @param monthSampleCount the value for product.month_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setMonthSampleCount(Integer monthSampleCount) {
        this.monthSampleCount = monthSampleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.day_sample_count
     *
     * @return the value of product.day_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Integer getDaySampleCount() {
        return daySampleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.day_sample_count
     *
     * @param daySampleCount the value for product.day_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setDaySampleCount(Integer daySampleCount) {
        this.daySampleCount = daySampleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.current_sample_count
     *
     * @return the value of product.current_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Integer getCurrentSampleCount() {
        return currentSampleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.current_sample_count
     *
     * @param currentSampleCount the value for product.current_sample_count
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setCurrentSampleCount(Integer currentSampleCount) {
        this.currentSampleCount = currentSampleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.region
     *
     * @return the value of product.region
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.region
     *
     * @param region the value for product.region
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.province
     *
     * @return the value of product.province
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.province
     *
     * @param province the value for product.province
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.city
     *
     * @return the value of product.city
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.city
     *
     * @param city the value for product.city
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.district
     *
     * @return the value of product.district
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.district
     *
     * @param district the value for product.district
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.ship_date
     *
     * @return the value of product.ship_date
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public Date getShipDate() {
        return shipDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.ship_date
     *
     * @param shipDate the value for product.ship_date
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.remarks
     *
     * @return the value of product.remarks
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.remarks
     *
     * @param remarks the value for product.remarks
     *
     * @mbg.generated Thu Feb 08 10:37:57 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}