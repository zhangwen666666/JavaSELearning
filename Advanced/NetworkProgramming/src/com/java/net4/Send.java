package com.java.net4;

import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();

        //准备数据包，用来发送数据
        byte[] bytes = new byte[1024];
        FileInputStream fis = new FileInputStream("F:\\ha_ndbcluster.cc");
        int readCount = 0;
        while ((readCount = fis.read(bytes)) != -1) {
            DatagramPacket dp = new DatagramPacket(bytes, readCount, InetAddress.getLocalHost(), 8888);
            //发送数据
            datagramSocket.send(dp);
        }
        datagramSocket.close();
    }
}
