/**
* @Title: TermService.java
* @Package com.hiaward.cl.oms.service
*
* @author cl
* @date 2016年7月27日 下午1:40:10
* @version  [版本号, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 设备服务类
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiaward.cl.oms.dao.TermMapper;
import com.hiaward.cl.oms.entity.Term;

@Service
public class TermService {


	@Autowired
	private TermMapper termMapper;

	public List<Term> queryTerm(Map<String,String> m){

		return termMapper.queryTerm(m);

	}

	public int addTerm(Term term){

		return termMapper.insertSelective(term);
	}

	public Term getTermById(String termId){

		int termid = Integer.parseInt(termId);
		return termMapper.selectByPrimaryKey(termid);
	}

	public int updateTerm(Term term){

		return termMapper.updateByPrimaryKeySelective(term);
	}

	public List<Map<String, Object>> queryErrorTerm(Map<String,String> m){

		return termMapper.queryErrorTerm(m);
	}


	public List<Map<String, Object>> queryTremStatus(Map<String,String> m){

		return termMapper.queryTremStatus(m);
	}

	public int deleteById(String id){

		return termMapper.deleteByPrimaryKey(Integer.parseInt(id));
	}

}
