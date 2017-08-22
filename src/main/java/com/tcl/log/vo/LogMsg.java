package com.tcl.log.vo;

import java.io.Serializable;
import java.util.Date;

public class LogMsg implements Serializable{

	private static final long serialVersionUID = 1L;
	//日志Id
	private String logId;
//	//日志类型：1：业务逻辑，2：性能
//	private String type;
	//日志发生的app
	private String appId;
	//日志类别：info,error
	private String level;
	//
	private String tagId;
	//日志发生的方法
	private String method;
	//标签
	private String label;
	//日志消息
	private String logmsg;
	//操作者
	private String operator;
	//异常消息
	private String expmsg;
	//时间
	private long time;
	//时间
	private Date logTime;
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTagId() {
		return tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLogmsg() {
		return logmsg;
	}
	public void setLogmsg(String logmsg) {
		this.logmsg = logmsg;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getExpmsg() {
		return expmsg;
	}
	public void setExpmsg(String expmsg) {
		this.expmsg = expmsg;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public long getTime()
	{
		return time;
	}
	public void setTime(long time)
	{
		this.time = time;
		
	}
	public Date getLogTime()
	{
		this.logTime = new Date(this.time);
		return logTime;
	}
	public void setLogTime(Date logTime)
	{
		this.logTime = logTime;
	}
	
	
}
