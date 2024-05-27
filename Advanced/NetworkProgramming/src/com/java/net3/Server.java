package com.java.net3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 这个类充当服务器对象，接受客户端发来的图片，并返回给客户端一句话
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedInputStream bi = null;
        BufferedOutputStream bos = null;
        BufferedWriter bw = null;
        try {
            //先启动服务器端，启动服务器端之后，这个应用肯定要对应一个端口
            //创建服务器端套接字对象
            int port = 8888;
            serverSocket = new ServerSocket(port);

            System.out.println("服务器启动成功，端口号：" + port + "等待客服端的请求");

            //开始接受客户端的请求
            clientSocket = serverSocket.accept();

            //服务器端接受图片，应该获取输入流
            InputStream inputStream = clientSocket.getInputStream();
            bi = new BufferedInputStream(inputStream);

            //新建一个输出流，用来保存图片的
            bos = new BufferedOutputStream(new FileOutputStream("./01.jpg"));

            //读数据
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = bi.read(bytes)) != -1) {
                //将客户端发送的图片写入到服务器硬盘上
                bos.write(bytes,0,readCount);
            }
            bos.flush();

            //服务器接受完图片之后给客户端回个话
            OutputStream outputStream = clientSocket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            //回消息
            bw.write("图片接收成功！！！\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bi != null) {
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw != null){
                try {
                    bw.close();
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
