package com.strategy;

import com.strategy.model.User;

public interface LoginStrategy {
    void performLogin(User user);
}
