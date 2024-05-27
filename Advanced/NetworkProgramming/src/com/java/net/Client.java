package com.java.net;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 这个类充当客户端
 */
public class Client {
    public static void main(String[] args) {
        Socket clientSocket = null;
        BufferedWriter bw = null;
        try {
            //创建客户端套接字对象
            //需要指定服务器的IP地址和端口号
            InetAddress ia = InetAddress.getLocalHost();
            int port = 8888;
            clientSocket = new Socket(ia, port);

            //客户端发送消息，是输出流
            OutputStream outputStream = clientSocket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(outputStream));

            //发消息
            while (true) {
                bw.write("你好，最近身体着呢么样？\n");
                bw.write("最近天气怎么样？\n");

                bw.flush();
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //先关闭流后关闭套接字
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
