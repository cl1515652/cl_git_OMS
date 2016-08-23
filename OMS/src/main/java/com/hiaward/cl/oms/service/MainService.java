/**   
* @Title: mainService.java 
* @Package com.hiaward.cl.oms.service 
*
* @author cl   
* @date 2016年7月14日 下午3:46:28 
* @version  [版本号, 2016年7月14日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: TODO(用一句话描述该文件做什么) 
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiaward.cl.oms.client.DeviceInfoMapper;
import com.hiaward.cl.oms.client.DeviceTradeInfoMapper;
import com.hiaward.cl.oms.dao.TermMapper;
import com.hiaward.cl.oms.entity.DeviceInfoExample;
import com.hiaward.cl.oms.entity.DeviceTradeInfoExample;

@Service
public class MainService {

	@Autowired
	private DeviceTradeInfoMapper deviceTradeInfoMapper;
	
	@Autowired
	private DeviceInfoMapper deviceInfoMapper;
	
	@Autowired
	private TermMapper termMapper;
	
	/*
	 * 获取交易数 
	 * 条件为当天的交易数量
	 * 
	 */
	public String getJys() {
		
		//构建查询条件
		DeviceTradeInfoExample dte = new DeviceTradeInfoExample();
		dte.createCriteria().andTardeTimeEqualTo(new Date());
		
		
		
		return deviceTradeInfoMapper.countByExample(dte)+"";
	}
	
	
	
	/*
	 * 获取正常设备的数量
	 * 条件为 State = 0 and DeviceState = 0
	 * DeviceState 为0 正常 1 故障
	 * 
	 */
	public String getZcsb() {
	
		//DeviceInfoExample die = new DeviceInfoExample();
		//die.createCriteria().andStateEqualTo("0").andDeviceStateEqualTo("0");
		
		return termMapper.getZcsb("0");
	
	}

	/*
	 * 获取故障设备的数量
	 * 条件为 State = 0 and DeviceState = 1
	 * DeviceState 为0 正常 1 故障
	 * 
	 */
	public String getGzsb() {
		//DeviceInfoExample die = new DeviceInfoExample();
		//die.createCriteria().andStateEqualTo("0").andDeviceStateEqualTo("1");
		
		return termMapper.getZcsb("1");
		//return deviceInfoMapper.countByExample(die)+"";
	}
	
}
