package com.homework;

public class InitializeTickets implements Runnable{
    private Ticket ticket;

    public InitializeTickets() {
    }

    public InitializeTickets(Ticket ticket) {
        this.ticket = ticket;
    }

    public synchronized void initializeTickets(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if("硬座".equals(ticket.getTicketType()))
            ticket.setTicketNum(35);
        else
            ticket.setTicketNum(20);
        System.out.println(Thread.currentThread().getName() + ":成功初始化票数,票数为" + ticket.getTicketNum());
    }

    @Override
    public void run() {
        synchronized (ticket){
            initializeTickets();
        }
    }
}
