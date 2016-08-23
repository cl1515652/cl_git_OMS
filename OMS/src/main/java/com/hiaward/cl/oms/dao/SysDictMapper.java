package com.hiaward.cl.oms.dao;

import java.util.List;

import com.hiaward.cl.oms.entity.SysDict;

public interface SysDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Wed Jul 27 10:19:33 CST 2016
     */
    int deleteByPrimaryKey(Integer sdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Wed Jul 27 10:19:33 CST 2016
     */
    int insert(SysDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Wed Jul 27 10:19:33 CST 2016
     */
    int insertSelective(SysDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Wed Jul 27 10:19:33 CST 2016
     */
    SysDict selectByPrimaryKey(Integer sdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Wed Jul 27 10:19:33 CST 2016
     */
    int updateByPrimaryKeySelective(SysDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Wed Jul 27 10:19:33 CST 2016
     */
    int updateByPrimaryKey(SysDict record);
    
    List<SysDict> selectByDtType(String sdId);
    
}