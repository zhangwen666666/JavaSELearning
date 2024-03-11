public class Homework{
	public static void main(String[] args){
		//��һ�⣺��������࣬ÿ�����ڶ��󶼿���������������Ϣ��
		Day d = new Day(2024,3,11);
		System.out.println("������" + d.year + "��" + d.month +  "��" + d.day + "��");
		
		//�ڶ��⣺��������࣬ÿ�����˶������֤�š��������Ա�Ů�ˡ����Ů���࣬ÿ��Ů�˶������֤�š��������Ա����ˡ�
		Man man = new Man("12345","����",null);
		Woman woman = new Woman("56784","����",null);
		man.woman = woman;
		woman.man = man;
		System.out.println(man.name + "�����֤���ǣ�" + man.id + ",�Ա�" + Man.sex + ",Ů�˵�������" + man.woman.name);
		System.out.println(woman.name + "�����֤���ǣ�" + woman.id + ",�Ա�" + Woman.sex + ",���˵�������" + woman.man.name);
		
		//�����⣺��������˻��࣬ÿ���˻������˺š����롢������Ϣ��
		Account account = new Account("111111","222222",1314.520);
		System.out.println("�˺ţ�" + account.id + ",���룺" + account.password + ",��" + account.balance);
		
		//�����⣺���΢���˺��࣬ÿ��΢���˺Ŷ���΢�źš��ֻ��š��ǳƵ���Ϣ��
		Wechat weixin = new Wechat("zhangsan","1234679","����");
		System.out.println("΢�źţ�" + weixin.id + ",�ֻ��ţ�" + weixin.phone + ",΢���ǳƣ�" + weixin.name);

		/*
		�����⣺�����ɷ��� Husband �������� Wife��
		�ɷ�������԰��������֤�ţ��������������ڣ����ӡ�
		����������԰��������֤�ţ��������������ڣ��ɷ�
		�ֱ�����������ṩ���췽�����޲������췽�����в������췽����Ҫ�ṩ����
		��д���Գ��򣬴����ɷ����Ȼ���ٴ������Ӷ����ɷ����������Ӷ���
		���Ӷ�������ɷ����Ҫ���ܹ����������ɷ���󡱵����ӵ����֣�
		�����ܹ������������Ӷ��󡱵��ɷ�����֡�Ҫ���ܹ���������ִ�й��̵��ڴ�ͼ��
		����Ҫ���ڳ�������ʾ����ָ���쳣��Ч����
		*/
		Husband husband = new Husband("12343267867","����","1999-2-4",null);
		Wife wife = new Wife("27367463728","����","1999-10-21",null);
		husband.wife = wife;
		wife.husband = husband;
		System.out.println(husband.name + "�����֤�ţ�" + husband.id + ",���������ǣ�" + husband.birthday + ",���ӵ������ǣ�" + husband.wife.name);
		System.out.println(wife.name + "�����֤�ţ�" + wife.id + ",���������ǣ�" + wife.birthday + ",���ӵ������ǣ�" + wife.husband.name);
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
	public static String sex = "��";
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
	public static String sex = "Ů";
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