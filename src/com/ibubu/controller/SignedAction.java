package com.ibubu.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SignedAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(SignedAction.class);

	private SessionMap<String, String> session;

	private String account, password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String signin() {
		logger.info("signin method called");
		return ActionSupport.SUCCESS;
	}

	public String signout() {
		logger.info("signout method called");
		session.invalidate();
		return ActionSupport.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		session.put("signed", "true");
		this.session = (SessionMap) session;
	}
}
