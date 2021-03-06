package com.fang.cloud.mapper;

import com.fang.cloud.entity.UserAccount;

import java.util.Map;

public interface UserAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAccount
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAccount
     *
     * @mbg.generated
     */
    int insert(UserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAccount
     *
     * @mbg.generated
     */
    int insertSelective(UserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAccount
     *
     * @mbg.generated
     */
    UserAccount selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAccount
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserAccount
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserAccount record);

    int isExistsForUser(String mobile);

    UserAccount selectForLogin(Map<String, String> param);
}