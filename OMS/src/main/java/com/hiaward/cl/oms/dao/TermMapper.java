package com.hiaward.cl.oms.dao;

import java.util.List;
import java.util.Map;

import com.hiaward.cl.oms.entity.Term;


public interface TermMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbggenerated Wed Jul 27 13:36:53 CST 2016
     */
    int deleteByPrimaryKey(Integer termid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbggenerated Wed Jul 27 13:36:53 CST 2016
     */
    int insert(Term record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbggenerated Wed Jul 27 13:36:53 CST 2016
     */
    int insertSelective(Term record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbggenerated Wed Jul 27 13:36:53 CST 2016
     */
    Term selectByPrimaryKey(Integer termid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbggenerated Wed Jul 27 13:36:53 CST 2016
     */
    int updateByPrimaryKeySelective(Term record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term
     *
     * @mbggenerated Wed Jul 27 13:36:53 CST 2016
     */
    int updateByPrimaryKey(Term record);
    
    
    List<Term> queryTerm(Map<String,String> m);
    List<Map<String,Object>> queryErrorTerm(Map<String,String> m);
    List<Map<String,Object>> queryTremStatus(Map<String,String> m);
    
    String getZcsb(String status);
    
}