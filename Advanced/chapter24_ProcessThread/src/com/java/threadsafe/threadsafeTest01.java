package com.java.threadsafe;

public class threadsafeTest01 {
    public static void main(String[] args) {
        Account account = new Account("1111",10000);

        Thread t1 = new Thread(new AccountThread(account));
        Thread t2 = new Thread(new AccountThread(account));
        t1.start();
        t2.start();
    }
}


