package com.hiaward.cl.oms.entity;

public class SysDict {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict.SD_ID
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	private Integer sdId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict.DT_TYPE
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	private String dtType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict.SD_CODE
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	private Integer sdCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict.EN_NAME
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	private String enName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict.ZH_NAME
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	private String zhName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict.SD_ID
	 * @return  the value of sys_dict.SD_ID
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public Integer getSdId() {
		return sdId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict.SD_ID
	 * @param sdId  the value for sys_dict.SD_ID
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public void setSdId(Integer sdId) {
		this.sdId = sdId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict.DT_TYPE
	 * @return  the value of sys_dict.DT_TYPE
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public String getDtType() {
		return dtType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict.DT_TYPE
	 * @param dtType  the value for sys_dict.DT_TYPE
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public void setDtType(String dtType) {
		this.dtType = dtType == null ? null : dtType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict.SD_CODE
	 * @return  the value of sys_dict.SD_CODE
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public Integer getSdCode() {
		return sdCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict.SD_CODE
	 * @param sdCode  the value for sys_dict.SD_CODE
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public void setSdCode(Integer sdCode) {
		this.sdCode = sdCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict.EN_NAME
	 * @return  the value of sys_dict.EN_NAME
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public String getEnName() {
		return enName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict.EN_NAME
	 * @param enName  the value for sys_dict.EN_NAME
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public void setEnName(String enName) {
		this.enName = enName == null ? null : enName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict.ZH_NAME
	 * @return  the value of sys_dict.ZH_NAME
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public String getZhName() {
		return zhName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict.ZH_NAME
	 * @param zhName  the value for sys_dict.ZH_NAME
	 * @mbggenerated  Wed Jul 27 10:19:33 CST 2016
	 */
	public void setZhName(String zhName) {
		this.zhName = zhName == null ? null : zhName.trim();
	}
}