package com.hiaward.cl.oms.client;

import com.hiaward.cl.oms.entity.DeviceInfo;
import com.hiaward.cl.oms.entity.DeviceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int countByExample(DeviceInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int deleteByExample(DeviceInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int deleteByPrimaryKey(String deviceNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int insert(DeviceInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int insertSelective(DeviceInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	List<DeviceInfo> selectByExample(DeviceInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	DeviceInfo selectByPrimaryKey(String deviceNo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int updateByExampleSelective(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int updateByExample(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int updateByPrimaryKeySelective(DeviceInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device_info
	 * @mbggenerated  Thu Jul 14 15:35:43 CST 2016
	 */
	int updateByPrimaryKey(DeviceInfo record);
}