package com.strategy;

import com.strategy.model.User;

public class LoginContext {
    private LoginStrategy loginStrategy;

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void performLoginAction(User user) {
        loginStrategy.performLogin(user);
    }
}