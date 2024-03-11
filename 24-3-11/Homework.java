public class Homework{
	public static void main(String[] args){
		//第一题：设计日期类，每个日期对象都可以描述年月日信息。
		Day d = new Day(2024,3,11);
		System.out.println("今天是" + d.year + "年" + d.month +  "月" + d.day + "日");
		
		//第二题：设计男人类，每个男人都有身份证号、姓名、性别、女人。设计女人类，每个女人都有身份证号、姓名、性别、男人。
		Man man = new Man("12345","张三",null);
		Woman woman = new Woman("56784","李四",null);
		man.woman = woman;
		woman.man = man;
		System.out.println(man.name + "的身份证号是：" + man.id + ",性别：" + Man.sex + ",女人的姓名：" + man.woman.name);
		System.out.println(woman.name + "的身份证号是：" + woman.id + ",性别：" + Woman.sex + ",男人的姓名：" + woman.man.name);
		
		//第三题：设计银行账户类，每个账户都有账号、密码、余额等信息。
		Account account = new Account("111111","222222",1314.520);
		System.out.println("账号：" + account.id + ",密码：" + account.password + ",余额：" + account.balance);
		
		//第四题：设计微信账号类，每个微信账号都有微信号、手机号、昵称等信息。
		Wechat weixin = new Wechat("zhangsan","1234679","花开");
		System.out.println("微信号：" + weixin.id + ",手机号：" + weixin.phone + ",微信昵称：" + weixin.name);

		/*
		第五题：定义丈夫类 Husband 和妻子类 Wife，
		丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
		妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
		分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），
		编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
		妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字，
		或者能够输出这个“妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。
		并且要求在程序中演示出空指针异常的效果。
		*/
		Husband husband = new Husband("12343267867","张三","1999-2-4",null);
		Wife wife = new Wife("27367463728","李四","1999-10-21",null);
		husband.wife = wife;
		wife.husband = husband;
		System.out.println(husband.name + "的身份证号：" + husband.id + ",出生日期是：" + husband.birthday + ",妻子的姓名是：" + husband.wife.name);
		System.out.println(wife.name + "的身份证号：" + wife.id + ",出生日期是：" + wife.birthday + ",妻子的姓名是：" + wife.husband.name);
	}
}


class Husband{
	public String id;
	public String name;
	public String birthday;
	public Wife wife;
	
	public Husband(){}
	public Husband(String id,String name,String birthday,Wife wife){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.wife = wife;
	}
}


class Wife{
	public String id;
	public String name;
	public String birthday;
	public Husband husband;
	
	public Wife(){}
	public Wife(String id,String name,String birthday,Husband husband){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.husband = husband;
	}
}


class Wechat{
	public String id;
	public String phone;
	public String name;
	
	public Wechat(String id,String phone,String name){
		this.id = id;
		this.phone = phone;
		this.name = name;
	}
}


class Account{
	public String id;
	public String password;
	public double balance;
	
	public Account(String id,String password,double balance){
		this.id = id;
		this.password = password;
		this.balance = balance;
	}
}


class Man{
	public String id;
	public String name;
	public static String sex = "男";
	public Woman woman;
	
	public Man(String id,String name,Woman woman){
		this.id = id;
		this.name = name;
		this.woman = woman;
	}
}


class Woman{
	public String id;
	public String name;
	public static String sex = "女";
	public Man man;
	
	public Woman(String id,String name,Man man){
		this.id = id;
		this.name = name;
		this.man = man;
	}
}


class Day{
	public int year;
	public int month;
	public int day;
	
	public Day(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
}