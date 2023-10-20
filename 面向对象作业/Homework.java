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
		
		Wife w = new Wife("22222222","王泽杰","2001.04.05",h);
		w.id = "22222222";
		w.name = "王泽杰";
		w.birthday = "2001.04.05";
		w.h = h;
		
		System.out.println("王泽杰的丈夫是" + w.h.name);
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
		System.out.println("Wife 有参构造");
	}
}