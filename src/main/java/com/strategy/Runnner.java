package com.strategy;

import com.strategy.impl.LoginWithConnectIdStrategy;
import com.strategy.impl.LoginWithFacebookStrategy;
import com.strategy.impl.LoginWithOktaStrategy;
import com.strategy.impl.LoginWithTwoFartorAuthentication;
import com.strategy.model.User;

import java.util.HashMap;
import java.util.Map;

public class Runnner {

    private static Map<LoginStrategy, User> users;

    static {
        users = new HashMap<>();
                users.put(new LoginWithConnectIdStrategy(), new User("user_1", "qwerty1"));
                users.put(new LoginWithFacebookStrategy(), new User("user_2", "qwerty2"));
                users.put(new LoginWithOktaStrategy(), new User("user_3", "qwerty3"));
                users.put(new LoginWithTwoFartorAuthentication(), new User("user_4", "qwerty4"));
    }

    public static void main(String[] args) {
        LoginContext context = new LoginContext();

        users.forEach((key, value) -> {
            context.setLoginStrategy(key);
            context.performLoginAction(value);
        });
    }
}
