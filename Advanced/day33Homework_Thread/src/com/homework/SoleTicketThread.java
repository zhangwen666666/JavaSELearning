package com.homework;

public class SoleTicketThread implements Runnable {
    private Ticket ticket;

    public SoleTicketThread() {
    }

    public SoleTicketThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ticket.saleTicket();
            } catch (SoldOutException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
