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
		
		Wife w = new Wife("22222222","�����","2001.04.05",h);
		w.id = "22222222";
		w.name = "�����";
		w.birthday = "2001.04.05";
		w.h = h;
		
		System.out.println("����ܵ��ɷ���" + w.h.name);
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
		System.out.println("Wife �вι���");
	}
}