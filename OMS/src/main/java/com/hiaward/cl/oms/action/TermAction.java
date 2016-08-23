/**
* @Title: TermAction.java
* @Package com.hiaward.cl.oms.action
*
* @author cl
* @date 2016年7月27日 上午9:15:30
* @version  [1.0, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 设备请求处理类
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hiaward.cl.oms.entity.Term;
import com.hiaward.cl.oms.service.TermService;

/**
* @Title: TermAction.java
* @Package com.hiaward.cl.oms.action
*
* @author cl
* @date 2016年7月27日 上午9:15:30
* @version  [1.0, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 设备请求处理类
*
* @company Copyright (c) Hiaward Coperation.
*/

@Controller
public class TermAction {

	@Autowired
	private TermService termService;


	//新增设备
	@ResponseBody
	@RequestMapping(value="queryTerm",produces = "text/html;charset=UTF-8")
	public String queryTerm(HttpServletRequest requset){
		//获取查询条件
		String termNum = requset.getParameter("termNum");
		String ipAddr = requset.getParameter("ipAddr");
		String manufacturer = requset.getParameter("manufacturer");
		String deviceType = requset.getParameter("deviceType");
		//String v_status = requset.getParameter("v_status");

		Map<String, String> m = new HashMap<String,String>();
		m.put("termNum",termNum);
		m.put("ipAddr",ipAddr);
		m.put("manufacturer",manufacturer);
		m.put("deviceType",deviceType);


		String rst = JSON.toJSONString(termService.queryTerm(m));

		//System.out.println(rst);
		return rst;
	}

	//查询设备信息
	@ResponseBody
	@RequestMapping(value="addTerm",produces = "text/html;charset=UTF-8")
	public String addTerm(Term term){

		//返回 1 成功

		return termService.addTerm(term)+"";
	}


	//查询设备更具ID
	@ResponseBody
	@RequestMapping(value="getTermById",produces = "text/html;charset=UTF-8")
	public String getTermById(HttpServletRequest requset){

		//返回 1 成功
		String termId = requset.getParameter("termId");

		return JSON.toJSONString(termService.getTermById(termId));
	}

	//修改信息
	@ResponseBody
	@RequestMapping(value="updateTerm",produces = "text/html;charset=UTF-8")
	public String updateTerm(Term term){

		//返回 1 成功

		return termService.updateTerm(term)+"";
	}

	//设备故障统计
	@ResponseBody
	@RequestMapping(value="queryErrorTerm",produces = "text/html;charset=UTF-8")
	public String queryErrorTerm(HttpServletRequest requset){

		//返回 1 成功
		//获取查询条件
		String start_time = requset.getParameter("start_time");
		String end_time = requset.getParameter("end_time");


		Map<String, String> m = new HashMap<String,String>();

		m.put("start_time",start_time);
		m.put("end_time",end_time);



		String rst = JSON.toJSONString(termService.queryErrorTerm(m));

		//System.out.println(rst);
		return rst;
	}


	//查询设备信息
	@ResponseBody
	@RequestMapping(value="queryTremStatus",produces = "text/html;charset=UTF-8")
	public String queryTremStatus(HttpServletRequest requset){


		//获取查询条件
		String termNum = requset.getParameter("termNum");
		String ipAddr = requset.getParameter("ipAddr");
		String manufacturer = requset.getParameter("manufacturer");
		String deviceType = requset.getParameter("deviceType");
		String v_status = requset.getParameter("v_status");

		Map<String, String> m = new HashMap<String,String>();
		m.put("termNum",termNum);
		m.put("ipAddr",ipAddr);
		m.put("manufacturer",manufacturer);
		m.put("deviceType",deviceType);
		m.put("v_status",v_status);



		String rst = JSON.toJSONString(termService.queryTremStatus(m));

		return rst;
	}

	//删除设备
	@ResponseBody
	@RequestMapping(value="deleteById",produces = "text/html;charset=UTF-8")
	public String deleteById(String termId){
	//deleteById

		return  termService.deleteById(termId)+"";
	}

}
