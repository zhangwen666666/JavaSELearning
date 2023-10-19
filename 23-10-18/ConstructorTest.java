/*
public class ConstructorTest{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(100);
		//	报错 实际参数列表和形式参数列表长度不同
		
		/*
		//输出结果不是null，说明已经创建成功了
		System.out.println(s1);	//Student@8efb846
		
		
	}
}

class Student{
	int id;
	String name;
	int age;
	
	
	public Student(){
		System.out.println("无参数的构造函数执行了");
	}
	
	
	public Student(int i){
		System.out.println("有参数的构造函数执行了");
	}
}
*/


public class ConstructorTest{
	public static void main(String[] args){
		Student s1 = new Student();	//无参数的构造函数执行了
		Student s2 = new Student(100);//有参数的构造函数执行了
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		Student s3 = new Student(3.14, "haha");//有两个参数的构造函数
	}
}

class Student{
	int id;
	String name;
	int age;
	
	public Student(){
		System.out.println("无参数的构造函数执行了");
	}
	
	public Student(int i){
		System.out.println("有参数的构造函数执行了");
	}
	
	public Student(double d, String s){
		System.out.println("有两个参数的构造函数");
	}
}