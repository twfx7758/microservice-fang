package com.fang.cloud.mapper;

import com.fang.cloud.entity.LogInfo;

public interface LogInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LogInfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LogInfo
     *
     * @mbg.generated
     */
    int insert(LogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LogInfo
     *
     * @mbg.generated
     */
    int insertSelective(LogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LogInfo
     *
     * @mbg.generated
     */
    LogInfo selectByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LogInfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LogInfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LogInfo record);
}