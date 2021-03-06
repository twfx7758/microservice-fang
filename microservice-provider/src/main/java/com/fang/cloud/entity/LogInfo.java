package com.fang.cloud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LogInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.LogID
     *
     * @mbg.generated
     */
    private Integer logid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.SystemID
     *
     * @mbg.generated
     */
    private Integer systemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.ModuleID
     *
     * @mbg.generated
     */
    private Integer moduleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.InfoID
     *
     * @mbg.generated
     */
    private String infoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.IP
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.AccessTime
     *
     * @mbg.generated
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accesstime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LogInfo.IsActive
     *
     * @mbg.generated
     */
    private Short isactive;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.LogID
     *
     * @return the value of LogInfo.LogID
     *
     * @mbg.generated
     */
    public Integer getLogid() {
        return logid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.LogID
     *
     * @param logid the value for LogInfo.LogID
     *
     * @mbg.generated
     */
    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.SystemID
     *
     * @return the value of LogInfo.SystemID
     *
     * @mbg.generated
     */
    public Integer getSystemid() {
        return systemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.SystemID
     *
     * @param systemid the value for LogInfo.SystemID
     *
     * @mbg.generated
     */
    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.ModuleID
     *
     * @return the value of LogInfo.ModuleID
     *
     * @mbg.generated
     */
    public Integer getModuleid() {
        return moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.ModuleID
     *
     * @param moduleid the value for LogInfo.ModuleID
     *
     * @mbg.generated
     */
    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.InfoID
     *
     * @return the value of LogInfo.InfoID
     *
     * @mbg.generated
     */
    public String getInfoid() {
        return infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.InfoID
     *
     * @param infoid the value for LogInfo.InfoID
     *
     * @mbg.generated
     */
    public void setInfoid(String infoid) {
        this.infoid = infoid == null ? null : infoid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.IP
     *
     * @return the value of LogInfo.IP
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.IP
     *
     * @param ip the value for LogInfo.IP
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.AccessTime
     *
     * @return the value of LogInfo.AccessTime
     *
     * @mbg.generated
     */
    public Date getAccesstime() {
        return accesstime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.AccessTime
     *
     * @param accesstime the value for LogInfo.AccessTime
     *
     * @mbg.generated
     */
    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LogInfo.IsActive
     *
     * @return the value of LogInfo.IsActive
     *
     * @mbg.generated
     */
    public Short getIsactive() {
        return isactive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LogInfo.IsActive
     *
     * @param isactive the value for LogInfo.IsActive
     *
     * @mbg.generated
     */
    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }
}