package com.magi.controller;

/**
 * 模拟
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username,String password) {
        try {
            if ("a".equals(username)){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " , password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
