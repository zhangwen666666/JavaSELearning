package com.java.threadsafe;

public class Account {
    private String no;
    private double balance;

    public Account() {
    }

    public Account(String no, double balance) {
        this.no = no;
        this.balance = balance;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double money) {
        synchronized (this) {
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
