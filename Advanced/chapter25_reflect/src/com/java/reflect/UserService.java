package com.java.reflect;

public class UserService {
    public boolean logIn(String userName,String password){
        return "admin".equals(userName) && "123456".equals(password);
    }

    public void logOut(){
        System.out.println("用户已安全退出");
    }
}
