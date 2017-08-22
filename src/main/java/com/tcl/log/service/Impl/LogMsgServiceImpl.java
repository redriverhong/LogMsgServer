package com.tcl.log.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcl.log.dao.LogMsgDao;
import com.tcl.log.service.LogMsgService;
import com.tcl.log.vo.LogMsg;

@Service
@Transactional
public class LogMsgServiceImpl implements LogMsgService {
	@Autowired
	private LogMsgDao logmsgdao;
	@Override
	public void insertLog(LogMsg logmsg) throws Exception {
		// TODO Auto-generated method stub
		logmsgdao.insertLogMsg(logmsg);
	}

	@Override
	public List<LogMsg> queryLog(String level) throws Exception {
		return logmsgdao.selectLogMsgByLevel(level);
	}

}
