package com.haifeiWu.service;

import java.util.List;

import com.haifeiWu.entity.PHCSMP_Leave_Record;
import com.haifeiWu.entity.Temporary_Leave;

public interface LeaveRecodService {
	/**
	 * 保存离开办案区系信息
	 * 
	 * @param model
	 */
	void saveLeaveRecordInfor(PHCSMP_Leave_Record model);

	/**
	 * 保存离开办案区系信息list
	 * 
	 * @param temporaryLeaves
	 */
	void saveLeaveRecordInfor(List<Temporary_Leave> temporaryLeaves);

	/**
	 * 根据档案号查询嫌疑人用户信息
	 * 
	 * @param suspectId
	 * @return
	 */
	PHCSMP_Leave_Record findInforBySuspetcId(String suspectId);
}
