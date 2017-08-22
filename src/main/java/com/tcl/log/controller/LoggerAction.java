package com.tcl.log.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.framework.common.core.BaseController;
import com.framework.common.log.TclLogger;
import com.framework.common.log.factory.TclLoggerFactory;
import com.framework.common.util.GsonUtil;
import com.tcl.log.service.LogMsgService;
import com.tcl.log.vo.LogMsg;

@Controller
@RequestMapping(value = "/logger")
public class LoggerAction extends BaseController
{
	private TclLogger tcllogger=TclLoggerFactory.getLogger(this.getClass());
	@Autowired
	private LogMsgService logmsgservice;

	@RequestMapping(value = "/insertlog")
	public void insertLogMsg() throws Exception
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username+"   "+password);
		Map<String, Object> result = null;
		try
		{
			LogMsg logmsg = getLogMsg();
			tcllogger.info("insertLogMsg", GsonUtil.objectToGson(logmsg));
			logmsg.setLogTime(new Date(logmsg.getTime()));
			logmsgservice.insertLog(logmsg);
			result = getRetMap(SUCCESS);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			result = getRetMap(FAILURE);
		}
		finally
		{
			returnBack(result);
		}
	}

	@RequestMapping(value = "/querylog", method ={ RequestMethod.GET })
	public void queryLogMsg() throws Exception
	{
		Map<String, Object> result = null;
		try
		{
			String level = "info";
			List<LogMsg> list = logmsgservice.queryLog(level);
			result = getRetMap(SUCCESS);
			result.put("logData", list);
		}
		catch (Exception e)
		{
			result = getRetMap(FAILURE);
		}
		finally
		{
			returnBack(result);
		}
	}

	private LogMsg getLogMsg() throws Exception
	{
		String postDate = getPostDate();
		LogMsg msg = GsonUtil.gsonToBean(postDate, LogMsg.class);
		return msg;

	}
}
