package com.homework;

public class Main {
    public static void main(String[] args) {
        Ticket ticket01 = new Ticket();
        Thread initThread = new Thread(new InitializeTickets(ticket01),"硬座售票系统");
        initThread.start();
        Ticket ticket02 = new Ticket("卧铺");
        Thread initThread02 = new Thread(new InitializeTickets(ticket02),"硬卧售票系统");
        initThread02.start();

        Thread saleThread1 = new Thread(new SoleTicketThread(ticket01),"窗口1");
        Thread saleThread2 = new Thread(new SoleTicketThread(ticket01),"窗口2");
        Thread saleThread3 = new Thread(new SoleTicketThread(ticket01),"窗口3");
        Thread saleThread4 = new Thread(new SoleTicketThread(ticket01),"窗口4");
        Thread saleThread5 = new Thread(new SoleTicketThread(ticket02),"窗口5");
        Thread saleThread6 = new Thread(new SoleTicketThread(ticket02),"窗口6");
        Thread saleThread7 = new Thread(new SoleTicketThread(ticket02),"窗口7");

        saleThread1.start();
        saleThread2.start();
        saleThread3.start();
        saleThread4.start();
        saleThread5.start();
        saleThread6.start();
        saleThread7.start();
    }
}
