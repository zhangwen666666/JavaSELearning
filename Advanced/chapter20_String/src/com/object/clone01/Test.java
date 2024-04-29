package com.object.clone01;

//浅拷贝

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建User对象
        User user = new User(20);

        User copyUser = user.clone();

        System.out.println(user);
        System.out.println(copyUser);

        System.out.println("修改前原对象的age：" + user.getAge());
        System.out.println("修改前克隆对象的age：" + copyUser.getAge());

        copyUser.setAge(18);

        System.out.println("修改克隆对象后原对象的age：" + user.getAge());
        System.out.println("修改克隆对象后克隆对象的age：" + copyUser.getAge());
    }
}
