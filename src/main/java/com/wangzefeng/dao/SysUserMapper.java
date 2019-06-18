package com.wangzefeng.dao;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.example.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    SysUser selectByPrimaryKey(String sysUserId);

    SysUser selectByUserName(String userName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByPrimaryKey(String sysUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insertSelective(SysUser record);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int countByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    List<SysUser> selectByExample(SysUserExample example);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

}