package com.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 这个类充当服务器对象
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader br = null;
        try {
            //先启动服务器端，启动服务器端之后，这个应用肯定要对应一个端口
            //创建服务器端套接字对象
            int port = 8888;
            serverSocket = new ServerSocket(port);

            System.out.println("服务器启动成功，端口号：" + port + "等待客服端的请求");

            //开始接受客户端的请求
            clientSocket = serverSocket.accept();

            //服务器端接受消息，应该获取输入流
            InputStream inputStream = clientSocket.getInputStream();
            br = new BufferedReader(new InputStreamReader(inputStream));

            //读数据
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭服务器端套接字
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭客户端套接字
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
