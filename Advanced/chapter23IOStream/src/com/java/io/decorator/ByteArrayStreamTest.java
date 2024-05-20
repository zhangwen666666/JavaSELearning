package com.java.io.decorator;

import com.java.io.User;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ByteArrayStreamTest {
    public static void main(String[] args) throws Exception{
        //准备对象
        Address address = new Address("北京","朝阳");
        User user = new User("zhangsan",18,address);
        //User{name='zhangsan', age=18, addr=Address{city='北京', street='朝阳'}}
        System.out.println(user);

        //写入内存中的byte数组
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(user);
        oos.flush();
        byte[] byteArray = baos.toByteArray();//获取内存中的byte数组

        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bais);
        User newUser = (User)ois.readObject();
        //User{name='zhangsan', age=18, addr=Address{city='北京', street='朝阳'}}
        System.out.println(newUser);

        newUser.getAddr().setCity("天津");
        //User{name='zhangsan', age=18, addr=Address{city='北京', street='朝阳'}}
        System.out.println(user);
        //User{name='zhangsan', age=18, addr=Address{city='天津', street='朝阳'}}
        System.out.println(newUser);
    }
}
