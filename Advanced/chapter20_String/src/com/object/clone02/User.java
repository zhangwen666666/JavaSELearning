package com.object.clone02;

public class User implements Cloneable{
    private String name;
    private Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User newUser = (User)super.clone();//浅拷贝
        Address newAddress = this.getAddr().clone(); //将地址拷贝一份
        newUser.setAddr(newAddress);
        return newUser;
    }
}
