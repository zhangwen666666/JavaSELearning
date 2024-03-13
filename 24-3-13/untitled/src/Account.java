/*二、写一个名为Account的类模拟账户。
        该类的属性和方法如下所示。
        该类包括的属性：账户id，余额balance，年利率annualInterestRate；
        包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()*/
public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(){}
    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void withdraw(double money){
        if(balance - money >= 0) {
            balance -= money;
            System.out.println("成功取出" + money + "元，当前余额：" + balance);
        }
        else
            System.out.println("余额不足，取款失败");
    }

    public void deposit(double money){
        balance += money;
        System.out.println("成功存入" + money + "元，当前余额：" + balance);
    }
}


class Custormer{
    private String name;
    private Account account;

    public Custormer(){}
    public Custormer(String name,Account account){
        this.name = name;
        this.account = account;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAccount(Account account){
        this.account = account;
    }
    public Account getAccount(){
        return account;
    }
}