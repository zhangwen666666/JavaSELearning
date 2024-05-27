package com.java.net;

import java.net.InetAddress;

public class InetAddressTest01 {
    public static void main(String[] args) throws Exception{
        //获取本机的IP地址和主机名的封装对象InetAddress
        InetAddress localHost = InetAddress.getLocalHost();

        //获取本机的IP地址
        String hostAddress = localHost.getHostAddress();
        System.out.println("本机IP地址：" + hostAddress);//本机IP地址：192.168.1.14

        //获取本机的主机名
        String hostName = localHost.getHostName();
        System.out.println("本机的主机名：" + hostName);//本机的主机名：DESKTOP-QRSSSIC

        InetAddress baiduAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(baiduAddress.getHostAddress());//110.242.68.3
        System.out.println(baiduAddress.getHostName());//www.baidu.com

    }
}
