package com.java.net2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Socket clientSocket = null;
        BufferedWriter bw = null;
        Scanner scanner = new Scanner(System.in);
        try {
            InetAddress ip = InetAddress.getLocalHost();
            int port = 6666;
            clientSocket = new Socket(ip, port);

            OutputStream clientSocketOutputStream = clientSocket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(clientSocketOutputStream));
            while (true) {
                bw.write(scanner.next());
                bw.write("\n");
                bw.flush();
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
