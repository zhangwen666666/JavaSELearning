package com.java.net;

import java.net.URL;

public class URLTest {
    public static void main(String[] args) throws Exception{
        //创建URL类型的对象
        URL url = new URL("http://www.baidu.com:8888/oa/index.html?name=zhangsan&password=123#tip");

        //获取URL中的协议
        String protocol = url.getProtocol();
        System.out.println("协议:" + protocol);//协议:http

        String host = url.getHost();
        System.out.println("域名:" + host);//域名:www.baidu.com

        int defaultPort = url.getDefaultPort();
        System.out.println("默认端口号：" + defaultPort);//默认端口号：80

        int port = url.getPort();
        System.out.println("端口号：" + port);//端口号：8888

        String path = url.getPath();
        System.out.println("路径" + path);//路径/oa/index.html

        String file = url.getFile();
        System.out.println("资源：" + file);//资源：/oa/index.html?name=zhangsan&password=123

        String query = url.getQuery();
        System.out.println("数据：" + query);//数据：name=zhangsan&password=123

        String ref = url.getRef();
        System.out.println("锚点：" + ref);//锚点：tip
    }
}
