/**   
* @Title: MainAction.java 
* @Package com.hiaward.cl.oms.action 
*
* @author cl   
* @date 2016年7月18日 下午3:43:53 
* @version  [1.0, 2016年7月18日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 主页监控请求
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hiaward.cl.oms.entity.UserInfo;
import com.hiaward.cl.oms.service.MainService;

@Controller
public class MainAction {

	@Autowired
	private MainService mainService;
	
	@ResponseBody
	@RequestMapping(value="getMain")
	public String getMain(UserInfo userInfo,HttpSession session){
		
		//查询交易数
		String jys = mainService.getJys();
		//查询正常设备
		String zcsb = mainService.getZcsb();
		//查询故障设备
		String gzsb = mainService.getGzsb();
		
		Map<String,String> rst = new HashMap<String,String>();
		
		rst.put("jys", jys);
		rst.put("zcsb", zcsb);
		rst.put("gzsb", gzsb);
		
		
		//反馈到前端
		return JSON.toJSONString(rst);
	}
	
	
	
}
