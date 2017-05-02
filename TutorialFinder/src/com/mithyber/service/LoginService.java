package com.mithyber.service;

import com.mithyber.model.User;

public class LoginService {
    public boolean verifyLogin(User user) {
	return "saya".equals(user.getLogin()) && "goddess".equals(user.getPassword());
    }
}
