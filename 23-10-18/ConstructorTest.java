/*
public class ConstructorTest{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(100);
		//	���� ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ
		
		/*
		//����������null��˵���Ѿ������ɹ���
		System.out.println(s1);	//Student@8efb846
		
		
	}
}

class Student{
	int id;
	String name;
	int age;
	
	
	public Student(){
		System.out.println("�޲����Ĺ��캯��ִ����");
	}
	
	
	public Student(int i){
		System.out.println("�в����Ĺ��캯��ִ����");
	}
}
*/


public class ConstructorTest{
	public static void main(String[] args){
		Student s1 = new Student();	//�޲����Ĺ��캯��ִ����
		Student s2 = new Student(100);//�в����Ĺ��캯��ִ����
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		Student s3 = new Student(3.14, "haha");//�����������Ĺ��캯��
	}
}

class Student{
	int id;
	String name;
	int age;
	
	public Student(){
		System.out.println("�޲����Ĺ��캯��ִ����");
	}
	
	public Student(int i){
		System.out.println("�в����Ĺ��캯��ִ����");
	}
	
	public Student(double d, String s){
		System.out.println("�����������Ĺ��캯��");
	}
}