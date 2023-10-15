/*
public class test{
	public static void main(String[] args){
		float a = (float)100;
		System.out.println(a);
	}
}
*/

public class test{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}

class Q1{
	public static void main(String[] args){
		int x = 10;
		int a = x + x++; 
		System.out.println("a = " + a);//a = 20
		System.out.println("x = " + x);//x = 11
		int b = x + ++x;
		System.out.println("b = " + b);//b = 23
		System.out.println("x = " + x);//x = 12
		int c = x + x--;
		System.out.println("c = " + c);//c = 24
		System.out.println("x = " + x);//x = 11
		int d = x + --x;
		System.out.println("d = " + d);//d = 21
		System.out.println("x = " + x);//x = 10
	}
}

class Q2{
	public static void main(String[] args){
		int a = 15;
		int b = 2;
		double c = 2;
		System.out.println(a + " / " + b + " = " + (a / b));//7
		System.out.println(a + " % " + b + " = " + (a % b));//1
		System.out.println(a + " / " + c + " = " + (a / c));//7.5
		System.out.println(a + " % " + c + " = " + (a % c));//1.0
	}
}