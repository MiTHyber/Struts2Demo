package com.mithyber.action;

import com.opensymphony.xwork2.Action;

// u don't have to implement interface - it works as simple class with execute method
public class LoginAction implements Action {

    // private static final String FAILURE = "failure";
    // private static final String SUCCESS = "success";
    private String login;
    private String password;

    @Override
    public String execute() {
	if ("saya".equals(getLogin()) && "goddess".equals(getPassword()))
	    return SUCCESS;
	// return FAILURE;
	return LOGIN;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
