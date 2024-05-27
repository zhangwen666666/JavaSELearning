package com.java.net4;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(8888);

        //准备数据包,接收发送发发过来的消息
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length);

        //创建文件流，将接收到的消息存入文件中
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd_HHmmss");
        String time = dtf.format(now);
        String path = "E:\\dir\\" + time + ".txt";
        File file = new File(path);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(path);
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fos));

        //开始接收消息
        for (int i = 0; i < 10; i++) {
            datagramSocket.receive(dp);

            //程序执行到这里，说明已经接收到了消息
            //从包中取出数据
            String s = new String(bytes, 0, dp.getLength());
            br.write(s);
            br.flush();
        }

        br.close();
        datagramSocket.close();
    }
}
