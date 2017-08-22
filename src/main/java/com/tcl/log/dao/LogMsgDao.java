package com.tcl.log.dao;

import java.util.List;

import com.tcl.log.vo.LogMsg;

public interface LogMsgDao {
	/**
	 * 通过日志类型，标签，方法查询
	 * @param level,Label,Method
	 * @return
	 */
	public List<LogMsg> selectLogMsgByLevel(String level);
	
	/**
	 * 日志插入
	 * @param logMsg
	 * @return
	 */
	public boolean insertLogMsg(LogMsg logMsg);
}