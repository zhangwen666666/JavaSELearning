package com.java.reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        //读取属性配置文件
        FileInputStream fis = new FileInputStream("F:\\JavaCode\\JavaSELearning\\Advanced\\chapter25_reflect\\src\\com\\java\\reflect\\UserService.properties");
        Properties properties = new Properties();
        properties.load(fis);

        //获取类名并拿到类
        Class<?> c = Class.forName(properties.getProperty("className"));

        //获取构造方法并创建对象
        Constructor<?> constructor = c.getDeclaredConstructor();
        Object o = constructor.newInstance();
        UserService userService = (UserService) o;

        //获取方法名
        String methodName = properties.getProperty("methodName");

        //获取形参列表和实参值(String类型)
        String parameterTypes = properties.getProperty("parameterTypes");
        String[] strParameterTypes = parameterTypes.split(",");
        String parameterValues = properties.getProperty("parameterValues");
        String[] strParameterValues = parameterValues.split(",");

        //将形参和实参的类型转换为Class
        Class<?>[] classParameterTypes = new Class[strParameterTypes.length];
        for(int i = 0;i< strParameterTypes.length;i++){
            classParameterTypes[i] = Class.forName(strParameterTypes[i]);
        }

        //根据方法名和形参列表获取方法
        Method m = c.getDeclaredMethod(methodName,classParameterTypes);

        boolean result = (boolean)m.invoke(userService,strParameterValues);
        System.out.println(result);
    }
}
