package com.strategy;

import com.strategy.model.User;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

public class LoginContext {
    private LoginStrategy loginStrategy;
    private static final Logger LOG = LogManager.getLogger();

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void performLoginAction(User user) {
        LOG.info(String.format("%s: [%s]", user, loginStrategy.getClass().getCanonicalName()));
        loginStrategy.performLogin(user);
    }
}