package com.java.annotation4;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class c = Class.forName("com.java.annotation4.User");

        if (c.isAnnotationPresent(Id.class)) {

            //如果有id注解,需要判断是否有int类型的id属性
            boolean hasIntId = false; //假设没有
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    hasIntId = true;
                    break;
                }
            }

            if (!hasIntId) { //如果没有int类型的id属性，抛出一个异常
                throw new NotFoundIntIdException("具有@Id注解的类必须有int类型的id属性");
            } else {
                System.out.println(c.getSimpleName() + "类有@Id注解，并且有int类型的id属性");
            }

        } else {
            System.out.println(c.getSimpleName() + "类没有@Id注解");
        }
    }
}
