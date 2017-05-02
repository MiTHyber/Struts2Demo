package com.mithyber.action;

import org.apache.commons.lang3.StringUtils;

import com.mithyber.model.User;
import com.mithyber.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

// Model driven let u put one more object (first one is action) on value stack - so u don't need to use user.login in jsp stuff
public class LoginActionSupport extends ActionSupport implements ModelDriven<User> {

    private static final long serialVersionUID = -7691948870144655414L;
    // private String login;
    // private String password;
    // in jsp we can assign values to user.login instead of login etc.
    // private User user;
    // in case of ModulDriven u have to initialize the field
    private User user = new User();

    // making sure that input parameters valid
    // if there is at least one error than struts redirect to input result in struts.xml
    @Override
    public void validate() {
	// if (StringUtils.isEmpty(getLogin())) {
	if (StringUtils.isEmpty(user.getLogin())) {
	    // showing error in the jsp
	    addFieldError("login", "Login cannot be blank");
	}
	// if (StringUtils.isEmpty(getPassword())) {
	if (StringUtils.isEmpty(user.getPassword())) {
	    addFieldError("password", "Password cannot be blank");
	}
    }

    @Override
    public String execute() {
	LoginService loginService = new LoginService();
	// user = new User();
	// user.setLogin(login);
	// user.setPassword(password);
	if (loginService.verifyLogin(user))
	    // if ("saya".equals(getLogin()) && "goddess".equals(getPassword()))
	    return SUCCESS;
	return LOGIN;
    }

    // public String getLogin() {
    // return login;
    // }
    //
    // public void setLogin(String login) {
    // this.login = login;
    // }
    //
    // public String getPassword() {
    // return password;
    // }
    //
    // public void setPassword(String password) {
    // this.password = password;
    // }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    @Override
    public User getModel() {
	return user;
    }
}
