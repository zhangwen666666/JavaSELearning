package com.java.reflect;

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("classInfo");
        String className = rb.getString("className");
        System.out.println(className);
    }
}
