package com.object.clone01;

public class User implements Cloneable{
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        //也可以直接向下转型并将返回值类型修改
        return (User)super.clone();
    }
}
