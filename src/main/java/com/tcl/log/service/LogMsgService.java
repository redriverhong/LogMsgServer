package com.tcl.log.service;

import java.util.List;

import com.tcl.log.vo.LogMsg;

public interface LogMsgService {
	/**
	 * 插入日志
	 * @throws Exception
	 */
	public void insertLog(LogMsg logmsg) throws Exception;
	/**
	 * 查询日志
	 * @return 
	 * @throws Exception
	 */
	public List<LogMsg> queryLog(String level) throws Exception;
}
