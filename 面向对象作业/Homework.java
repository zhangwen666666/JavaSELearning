/*
public class Homework{
	public static void main(String[] args){
		Date date = new Date();
		date.year = 2023;
		date.month = 10;
		date.day = 20;
		System.out.println(date.year + "." + date.month + "." + date.day);
	}
}


// 第一题：设计日期类，每个日期对象都可以描述年月日信息。
class Date{
	int year;
	int month;
	int day;
}
*/


/*
//第五题：定义丈夫类 Husband 和妻子类 Wife，
//丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
//妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
//分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），
//编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
//妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字，
//或者能够输出这个“妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。
//并且要求在程序中演示出空指针异常的效果。
public class Homework{
	public static void main(String[] args){
		Husband h = new Husband();
		h.id = "11111111";
		h.name = "张文";
		h.birthday = "2000.12.22";
		
		Wife w = new Wife("22222222","王泽杰","2001.04.05", h);
		// w.id = "22222222";
		// w.name = "王泽杰";
		// w.birthday = "2001.04.05";
		// w.h = h;
		
		System.out.println("王泽杰的丈夫是" + w.h.name);
		h.w = w;
		System.out.println("张文的妻子是" + h.w.name);
	}
	
}

class Husband{
	String id;
	String name;
	String birthday;
	Wife w;
	
	public Husband(){
		System.out.println("Husband 无参构造");
	}
	
	public Husband(String id,String name,String birthday,Wife w){
		System.out.println("Husband 有参构造");
	}
}

class Wife{
	String id;
	String name;
	String birthday;
	Husband h;
	
	public Wife(){
		System.out.println("Wife 无参构造");
	}
	
	public Wife(String id,String name,String birthday,Husband h){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.h = h;
		System.out.println("Wife 有参构造");
	}
}
*/


/*
一、请通过代码封装，实现如下需求：
	编写一个类Book，代表教材:	
	1.具有属性：名称（title）、页数（pageNum）
	2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
	3.为各属性提供赋值和取值方法
	4.具有方法:detail，用来在控制台输出每本教材的名称和页数
	5.编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
*/

/* 
class BookTest{
	 public static void main(String[] args){
		 Book b1 = new Book();
		 b1.setPageNum(300);
		 b1.setTitle("JavaSE语法");
		 b1.detail();
		 
		 Book b2 = new Book();
		 b2.setTitle("Python人工智能");
		 b2.setPageNum(50);
		 b2.detail();
	 }
 }
 
 class Book{
	 String title;
	 int pageNum;
	 
	 public Book(){
		 this.pageNum = 200;
	 }
	 
	 //title属性
	 public void setTitle(String title){
		 this.title = title;
	 } 
	 public String getTitle(){
		 return this.title;
	 }
	 
	 //pageNum属性
	 public void setPageNum(int num){
		 if(num < 200){
			 System.out.println("页数少于200页，赋值失败！！！");
			 return;
		 }
		 this.pageNum = num;
	 }
	 public int getPageNum(){
		 return this.pageNum;
	 }
	 
	 public void detail(){
		 System.out.println("书名：" + this.getTitle());
		 System.out.println("页数：" + this.getPageNum());
	 }
 }
 */
 
 
 
 /*
 二、写一个名为Account的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户id，余额balance，年利率annualInterestRate；
包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序
（1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
 */
 
 class Account{
	 String id;	//账户
	 double balance; //余额
	 double annualInterestRate; //年利率
	 
	 //id账户属性
	 public void setId(String id){
		 this.id = id;
	 }
	 public String getId(){
		 return this.id;
	 }
	 
	 //balance余额属性
	 public void setBalance(double balance){
		 this.balance = balance;
	 }
	 public double getBalance(){
		 return this.balance;
	 }
	 
	 //annualInterestRate年利率属性
	 public void setAnnualInterestRate(double annualInterestRate){
		 this.annualInterestRate = annualInterestRate;
	 }
	 public double getAnnualInterestRate(){
		 return this.annualInterestRate;
	 }
	 
	 //取款方法withdraw()
	 public void withdraw(double money){
		 if(this.balance < money){
			 System.out.println("余额不足，取钱失败");
			 return;
		 }
		 this.balance -= money;
		 System.out.println("成功取出：" + money);
	 }
	 
	 //存款方法deposit()
	 public void deposit(double money){
		 this.balance += money;
		 System.out.println("成功存入：" + money);
	 }
 }
 
 class Customer{
	 String name;
	 Account account;
	 
	 public static void main(String[] args){
		Customer c = new Customer();
		c.name = "Jane Smith";
		Account account = new Account();
		account.setId("1000");
		account.setBalance(2000);
		account.setAnnualInterestRate(0.0123);
		c.account = account;
		
		c.account.deposit(100);
		c.account.withdraw(960);
		c.account.withdraw(2000);
		
		System.out.println("Customer [" + c.name + "] " + "has a account: id is " + c.account.id +
		", annualInterestRate is " + (c.account.annualInterestRate*100) + "%, balance is " + c.account.balance);
	 }
 }