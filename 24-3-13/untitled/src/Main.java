public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.setTitle("《辟邪剑谱》");
//        book1.setPageNum(123);
//        book1.detail();
//        Book book2 = new Book("《葵花宝典》",159);
//        book2.detail();
//        Book book3 = new Book("《打狗棒法》",300);
//        System.out.println(book3.getTitle() + "共有" + book3.getPageNum() + "页");

//        Account account = new Account("12345",1314.52,0.0013);
//        account.withdraw(2000);
//        account.deposit(2000);
//        account.withdraw(2000);
//        System.out.println("账户id：" + account.getId() + ",账户余额：" + account.getBalance() + ",账户年利率：" + account.getAnnualInterestRate());

        //写一个测试程序
//        （1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
//        （2）对Jane Smith操作：
//        存入100元，再取出960元，再取出2000。
//        打印Jane Smith的基本信息
//        信息如下显示：
//        成功存入：100
//        成功取出：960
//        余额不足，取钱失败
//        Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0

//        account.setId("1000");
//        account.setBalance(2000.0);
//        account.setAnnualInterestRate(0.0123);
//        Custormer c = new Custormer("Jane Smith",account);
//        c.getAccount().deposit(100);
//        c.getAccount().withdraw(960);
//        c.getAccount().withdraw(2000);
//        System.out.println("Customer " +  c.getName() + " has a account ：id is " + c.getAccount().getId() +
//                " annualInterestRate is " + c.getAccount().getAnnualInterestRate()*100 + "% balance is "
//                + c.getAccount().getBalance());

        Student s = new Student("张三", 18, "天津市西青区", "037000", "13967482590");
        PostAddress pa = s.getPostAddress();
        System.out.println("邮编：" + pa.post + ", 地址：" + pa.address);
    }
}