package com.java.net3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 这个类充当客户端，给服务器发一个图片，并接受服务器的反馈
 */
public class Client {
    public static void main(String[] args) {
        Socket clientSocket = null;
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        BufferedReader br = null;
        try {
            //创建客户端套接字对象
            //需要指定服务器的IP地址和端口号
            InetAddress ia = InetAddress.getLocalHost();
            int port = 8888;
            clientSocket = new Socket(ia, port);

            //客户端发送图片，是输出流
            OutputStream outputStream = clientSocket.getOutputStream();
            bos = new BufferedOutputStream(outputStream);

            //新建一个输入流，从客户端的硬盘上读取图片
            bis = new BufferedInputStream(new FileInputStream("F:\\dog.jpg"));

            //一边读一边发送
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);
            }

            bos.flush();

            //关闭输出(输出结束)  这里必须关闭，否则会卡在输出这里
            clientSocket.shutdownOutput();

            //发送完之后接收服务器的反馈
            InputStream inputStream = clientSocket.getInputStream();
            br = new BufferedReader(new InputStreamReader(inputStream));
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //先关闭流后关闭套接字
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
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
