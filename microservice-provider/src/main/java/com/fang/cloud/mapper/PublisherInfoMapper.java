package com.fang.cloud.mapper;

import com.fang.cloud.entity.PublisherInfo;

public interface PublisherInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PublisherInfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long shopid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PublisherInfo
     *
     * @mbg.generated
     */
    int insert(PublisherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PublisherInfo
     *
     * @mbg.generated
     */
    int insertSelective(PublisherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PublisherInfo
     *
     * @mbg.generated
     */
    PublisherInfo selectByPrimaryKey(Long shopid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PublisherInfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PublisherInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PublisherInfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PublisherInfo record);
}