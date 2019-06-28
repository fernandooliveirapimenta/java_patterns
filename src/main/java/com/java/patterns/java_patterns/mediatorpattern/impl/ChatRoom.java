package com.java.patterns.java_patterns.mediatorpattern.impl;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.printf("%s [%s]: %s \n", new Date().toString(), user.getName(), message);
    }
}
