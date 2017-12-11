package com.fang.cloud.entity;

import org.bouncycastle.asn1.cms.TimeStampAndCRL;

import java.sql.Timestamp;
import java.util.Date;

public class Customization {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.UserID
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.BusinessID
     *
     * @mbg.generated
     */
    private Integer businessid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.LocationID
     *
     * @mbg.generated
     */
    private Integer locationid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.MinPrice
     *
     * @mbg.generated
     */
    private Integer minprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.MaxPrice
     *
     * @mbg.generated
     */
    private Integer maxprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.MinArea
     *
     * @mbg.generated
     */
    private Integer minarea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.MaxArea
     *
     * @mbg.generated
     */
    private Integer maxarea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.Remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.CreateTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.UpdateTime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customization.IsActive
     *
     * @mbg.generated
     */
    private Short isactive;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.ID
     *
     * @return the value of Customization.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.ID
     *
     * @param id the value for Customization.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.UserID
     *
     * @return the value of Customization.UserID
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.UserID
     *
     * @param userid the value for Customization.UserID
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.BusinessID
     *
     * @return the value of Customization.BusinessID
     *
     * @mbg.generated
     */
    public Integer getBusinessid() {
        return businessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.BusinessID
     *
     * @param businessid the value for Customization.BusinessID
     *
     * @mbg.generated
     */
    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.LocationID
     *
     * @return the value of Customization.LocationID
     *
     * @mbg.generated
     */
    public Integer getLocationid() {
        return locationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.LocationID
     *
     * @param locationid the value for Customization.LocationID
     *
     * @mbg.generated
     */
    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.MinPrice
     *
     * @return the value of Customization.MinPrice
     *
     * @mbg.generated
     */
    public Integer getMinprice() {
        return minprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.MinPrice
     *
     * @param minprice the value for Customization.MinPrice
     *
     * @mbg.generated
     */
    public void setMinprice(Integer minprice) {
        this.minprice = minprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.MaxPrice
     *
     * @return the value of Customization.MaxPrice
     *
     * @mbg.generated
     */
    public Integer getMaxprice() {
        return maxprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.MaxPrice
     *
     * @param maxprice the value for Customization.MaxPrice
     *
     * @mbg.generated
     */
    public void setMaxprice(Integer maxprice) {
        this.maxprice = maxprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.MinArea
     *
     * @return the value of Customization.MinArea
     *
     * @mbg.generated
     */
    public Integer getMinarea() {
        return minarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.MinArea
     *
     * @param minarea the value for Customization.MinArea
     *
     * @mbg.generated
     */
    public void setMinarea(Integer minarea) {
        this.minarea = minarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.MaxArea
     *
     * @return the value of Customization.MaxArea
     *
     * @mbg.generated
     */
    public Integer getMaxarea() {
        return maxarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.MaxArea
     *
     * @param maxarea the value for Customization.MaxArea
     *
     * @mbg.generated
     */
    public void setMaxarea(Integer maxarea) {
        this.maxarea = maxarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.Remark
     *
     * @return the value of Customization.Remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.Remark
     *
     * @param remark the value for Customization.Remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.CreateTime
     *
     * @return the value of Customization.CreateTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.CreateTime
     *
     * @param createtime the value for Customization.CreateTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.UpdateTime
     *
     * @return the value of Customization.UpdateTime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.UpdateTime
     *
     * @param updatetime the value for Customization.UpdateTime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customization.IsActive
     *
     * @return the value of Customization.IsActive
     *
     * @mbg.generated
     */
    public Short getIsactive() {
        return isactive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customization.IsActive
     *
     * @param isactive the value for Customization.IsActive
     *
     * @mbg.generated
     */
    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }
}