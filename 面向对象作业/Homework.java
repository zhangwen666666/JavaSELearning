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


// ��һ�⣺��������࣬ÿ�����ڶ��󶼿���������������Ϣ��
class Date{
	int year;
	int month;
	int day;
}
*/


/*
//�����⣺�����ɷ��� Husband �������� Wife��
//�ɷ�������԰��������֤�ţ��������������ڣ����ӡ�
//����������԰��������֤�ţ��������������ڣ��ɷ�
//�ֱ�����������ṩ���췽�����޲������췽�����в������췽����Ҫ�ṩ����
//��д���Գ��򣬴����ɷ����Ȼ���ٴ������Ӷ����ɷ����������Ӷ���
//���Ӷ�������ɷ����Ҫ���ܹ����������ɷ���󡱵����ӵ����֣�
//�����ܹ������������Ӷ��󡱵��ɷ�����֡�Ҫ���ܹ���������ִ�й��̵��ڴ�ͼ��
//����Ҫ���ڳ�������ʾ����ָ���쳣��Ч����
public class Homework{
	public static void main(String[] args){
		Husband h = new Husband();
		h.id = "11111111";
		h.name = "����";
		h.birthday = "2000.12.22";
		
		Wife w = new Wife("22222222","�����","2001.04.05", h);
		// w.id = "22222222";
		// w.name = "�����";
		// w.birthday = "2001.04.05";
		// w.h = h;
		
		System.out.println("����ܵ��ɷ���" + w.h.name);
		h.w = w;
		System.out.println("���ĵ�������" + h.w.name);
	}
	
}

class Husband{
	String id;
	String name;
	String birthday;
	Wife w;
	
	public Husband(){
		System.out.println("Husband �޲ι���");
	}
	
	public Husband(String id,String name,String birthday,Wife w){
		System.out.println("Husband �вι���");
	}
}

class Wife{
	String id;
	String name;
	String birthday;
	Husband h;
	
	public Wife(){
		System.out.println("Wife �޲ι���");
	}
	
	public Wife(String id,String name,String birthday,Husband h){
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.h = h;
		System.out.println("Wife �вι���");
	}
}
*/


/*
һ����ͨ�������װ��ʵ����������
	��дһ����Book������̲�:	
	1.�������ԣ����ƣ�title����ҳ����pageNum��
	2.����ҳ����������200ҳ���������������Ϣ��������Ĭ��ֵ200
	3.Ϊ�������ṩ��ֵ��ȡֵ����
	4.���з���:detail�������ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
	5.��д������BookTest���в��ԣ�ΪBook��������Ը����ʼֵ��������Book�����detail��������������Ƿ���ȷ
*/

/* 
class BookTest{
	 public static void main(String[] args){
		 Book b1 = new Book();
		 b1.setPageNum(300);
		 b1.setTitle("JavaSE�﷨");
		 b1.detail();
		 
		 Book b2 = new Book();
		 b2.setTitle("Python�˹�����");
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
	 
	 //title����
	 public void setTitle(String title){
		 this.title = title;
	 } 
	 public String getTitle(){
		 return this.title;
	 }
	 
	 //pageNum����
	 public void setPageNum(int num){
		 if(num < 200){
			 System.out.println("ҳ������200ҳ����ֵʧ�ܣ�����");
			 return;
		 }
		 this.pageNum = num;
	 }
	 public int getPageNum(){
		 return this.pageNum;
	 }
	 
	 public void detail(){
		 System.out.println("������" + this.getTitle());
		 System.out.println("ҳ����" + this.getPageNum());
	 }
 }
 */
 
 
 
 /*
 ����дһ����ΪAccount����ģ���˻���
��������Ժͷ���������ʾ��
������������ԣ��˻�id�����balance��������annualInterestRate��
�����ķ����������Ե�set��get������ȡ���withdraw()������deposit()

дһ�����Գ���
��1������һ��Customer�����ֽ�Jane Smith������һ���˺�Ϊ1000�����Ϊ2000��������Ϊ1.23%���˻�
��2����Jane Smith������
����100Ԫ����ȡ��960Ԫ����ȡ��2000��
��ӡJane Smith�Ļ�����Ϣ
��Ϣ������ʾ��
�ɹ����룺100
�ɹ�ȡ����960
���㣬ȡǮʧ��
Customer [Smith��Jane] has a account ��id is 1000 annualInterestRate is 1.23% balance is 1140.0
 */
 
 class Account{
	 String id;	//�˻�
	 double balance; //���
	 double annualInterestRate; //������
	 
	 //id�˻�����
	 public void setId(String id){
		 this.id = id;
	 }
	 public String getId(){
		 return this.id;
	 }
	 
	 //balance�������
	 public void setBalance(double balance){
		 this.balance = balance;
	 }
	 public double getBalance(){
		 return this.balance;
	 }
	 
	 //annualInterestRate����������
	 public void setAnnualInterestRate(double annualInterestRate){
		 this.annualInterestRate = annualInterestRate;
	 }
	 public double getAnnualInterestRate(){
		 return this.annualInterestRate;
	 }
	 
	 //ȡ���withdraw()
	 public void withdraw(double money){
		 if(this.balance < money){
			 System.out.println("���㣬ȡǮʧ��");
			 return;
		 }
		 this.balance -= money;
		 System.out.println("�ɹ�ȡ����" + money);
	 }
	 
	 //����deposit()
	 public void deposit(double money){
		 this.balance += money;
		 System.out.println("�ɹ����룺" + money);
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