package com.object.clone02;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("天津","西青");
        User u1 = new User("张三",address);
        User u2 = u1.clone();
        System.out.println("修改u2前");
        System.out.println(u1);//User{name='张三', addr=Address{city='天津', street='西青'}}
        System.out.println(u2);//User{name='张三', addr=Address{city='天津', street='西青'}}
        u2.getAddr().setStreet("滨海新区");
        u2.setName("李四");
        System.out.println("修改u2后");
        System.out.println(u1);//User{name='张三', addr=Address{city='天津', street='西青'}}
        System.out.println(u2);//User{name='李四', addr=Address{city='天津', street='滨海新区'}}
    }
}

