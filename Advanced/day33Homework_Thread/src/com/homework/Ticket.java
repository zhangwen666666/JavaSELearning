package com.homework;

public class Ticket {
    private int ticketNum;
    private String ticketType;

    public Ticket() {
        this(50, "硬座");
    }

    public Ticket(int ticketNum) {
        this(ticketNum, "硬座");
    }

    public Ticket(String ticketType) {
        this(30, ticketType);
    }

    public Ticket(int ticketNum, String ticketType) {
        this.ticketNum = ticketNum;
        this.ticketType = ticketType;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public synchronized void saleTicket() throws SoldOutException {
//    public void saleTicket() throws SoldOutException {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticketNum == 0) {
            throw new SoldOutException("票已售罄");
        }
        ticketNum--;
        System.out.println(Thread.currentThread().getName() + "成功售卖！" + ticketType +
                "余票：" + ticketNum);
    }
}
