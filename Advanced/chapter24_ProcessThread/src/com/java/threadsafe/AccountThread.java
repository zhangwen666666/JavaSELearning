package com.java.threadsafe;

public class AccountThread implements Runnable{

    Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(10000);
        System.out.println("取款成功，余额为：" + account.getBalance());
    }
}
