public class Test{
	public static void main(String args[]){
		/*
		char c1 = 'a';
		System.out.println("\"test\"");
		
		long l = 2147483647L;
		int x = (int)l;
		System.out.println(x);
		*/
		
		/*
		char c1 = 'a';
		byte b = 1;
		System.out.println(c1 + b);
		
		//short s = c1 + b;
		short s = 98;
		*/
		
		/*
		byte x = 100;
		x += 100;
		System.out.println(x);
		*/
		
		/*
		int x = 10;
		int a = x+ x++;	//a=20 x=11 
		System.out.println("a =" + a);
		System.out.println("x =" + x);
		int b = x + ++x;	//b=23 x=12
		System.out.println("b =" + b);
		System.out.println("x =" + x);
		int c = x + x--;  //c=24 x=11
		System.out.println("c =" + c);
		System.out.println("x =" + x);
		int d = x + --x;//d=21 x=10
		System.out.println("d =" + d);
		System.out.println("x =" + x);
		*/
		
		/*
		int a = 15;
		int b = 2;
		double c = 2;
		System.out.println(a + "/" + b + "=" + (a / b)); // 15/2=7
		System.out.println(a + "%" + b + "=" + (a % b)); // 15%2=1
		System.out.println(a + "/" + c + "=" + (a / c)); // 15/2=7.5
		System.out.println(a + "%" + c + "=" + (a % c)); // 15%2=1.0
		*/
		
		/*
		boolean x, y, z;
		int a = 15;
		int b = 2;
		x = a > b; // true;
		y = a < b; // false;
		z = a != b; // true;
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("z =" + z);
		*/
		
		/*
		int x;
		double y;
		x = (int) 22.5 + (int) 34.7; //x = 56
		y = (double) x; // y=56.0
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		*/
		
		/*
		int i = 5;
		int j = 5;
		int m = 5;
		int n = 5;
		i++; //i=6
		j = j + 1;	//j=6
		m--;	//m=4
		n = n - 1;	//n=4
		System.out.println(i);		//6
		System.out.println(i++);	//6  i=7
		System.out.println(++i);	//8  i=8
		System.out.println(i--);	//8  i=7
		System.out.println();
		System.out.println(j);		//6
		System.out.println(j++);	//6	 j=7
		System.out.println(j--);	//7	 j=6
		System.out.println(--j);	//5  j=5
		System.out.println();
		System.out.println(m);		//4
		System.out.println(n);		//4
		*/
		
		/*
		int i = 0;
		int j = 0;
		System.out.println(i);	//0
		System.out.println(j);	//0
		i++;	//i=1
		++j;	//j=1
		System.out.println(i);	//1
		System.out.println(j);	//1
		System.out.println("--------------------------");
		System.out.println(i++);	//1 i=2
		System.out.println(++j);	//2 j=2
		System.out.println("--------------------------");
		System.out.println(i);	//2
		System.out.println(j);  //2
		*/
		
		
		/*
		char c = 'f';
		switch(c){
		case 'a':
			System.out.println("字符a");
			break;
		case 'b':
			System.out.println("字符b");
			break;
		case 'c':
			System.out.println("字符v");
			//break;
		case 'd':
			System.out.println("字符d");
			//break;	
		case 'f':
			System.out.println("字符f");
			//break;
		default:
			System.out.println("字符");
			//break;
		}
		*/
		
		/*
		1、根据指定月份，打印该月份所属的季节。
		3,4,5 春季 
		6,7,8 夏季 
		9,10,11 秋季 
		12, 1, 2 冬季
		if和switch各写一版
		*/
		/*
		System.out.print("请输入一个月份：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int month = s.nextInt();
		String season = "？？？";
		if(month < 1 || month > 12)
			season = "您输入的月份无效！！！";
		else if(month <= 2)
			season = "冬季";
		else if(month <= 5)
			season = "春季";
		else if(month <= 8)
			season = "夏季";
		else if(month <= 11)
			season = "秋季";
		else
			season = "冬季";
		System.out.println(season);
		
		System.out.print("请在输入一个月份：");
		month = s.nextInt();
		switch(month){
		case 1:case 2:case 12:
			season = "冬季";
			break;
		case 3:case 4:case 5:
			season = "春季";
			break;
		case 6:case 7:case 8:
			season = "夏季";
			break;
		case 9:case 10:case 11:
			season = "秋季";
			break;
		default:
			season = "您输入的月份无效！！！";
			break;
		}
		System.out.println(season);
		*/		
		

		// 2、从键盘接收一个数字，判断该数字的正负。
		/*
		System.out.print("请输入一个数字");
		java.util.Scanner s = new java.util.Scanner(System.in);
		double num = s.nextDouble();
		if(num < 0)
			System.out.println("负数");
		else if(num > 0)
			System.out.println("正数");
		*/
		

		//3、从键盘接收一个数字，判断该数字的奇偶。
		/*
		System.out.print("请输入一个正整数：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		if(num % 2 == 1)
			System.out.println(num + "是奇数");
		else
			System.out.println(num + "是偶数");
		*/


		/*
		4、整数大小比较：输入两个整数，比较大小，
			若x>y 输出 >
			若x=y 输出 =
			若x<y 输出 <
		*/
		/*
		System.out.print("请输入两个数字：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		char c = '=';
		if(num1 > num2)
			c = '>';
		else if(num1 < num2)
			c = '<';
		System.out.println(c);
		*/


		//5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
		//使用if-else结构，并按从小到大的顺序输出
		/*
		System.out.print("请输入三个数字：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		if(num1 < num2 && num1 < num3){
			if(num2 < num3)
				System.out.println(num1 + " " + num2 + " " + num3);
			else
				System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if(num2 < num1 && num2 < num3){
			if(num1 < num3)
				System.out.println(num2 + " " + num1 + " " + num3);
			else
				System.out.println(num2 + " " + num3 + " " + num1);
		}
		else{
			if(num1 < num2)
				System.out.println(num3 + " " + num1 + " " + num2);
			else
				System.out.println(num3 + " " + num2 + " " + num1);
		}
		*/
		

		/*
		6、打车起步价8元（3KM以内）
		超过3KM，超出的每公里1.2元
		超过5KM，超出的每公里1.5元
		请在键盘上接收公里数，得出总价。
		*/		
		/*
		System.out.print("请输入里程数：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		double num1 = s.nextDouble();
		double money = 0;
		if(num1 <= 3)
			money = 8;
		else if(num1 <= 5)
			money = 8 + (num1 - 3) * 1.2;
		else if(num1 > 5)
			money = 8 + 2.4 + (num1 - 5) * 1.5;
		System.out.println(money);
		*/
		
		
		/*
		System.out.print("请输入成绩：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		double score = s.nextDouble();
		if(score < 0 || score > 100)
			System.out.println("成绩不合法");
		else{
			int grade = (int)(score / 10);
			String str = "不及格";
			switch(grade){
			case 10: case 9:
				str = "优";
				break;
			case 8:
				str = "良";
				break;
			case 7:
				str = "中";
				break;
			case 6:
				str = "及格";
				break;
			default:
				break;
			}
			System.out.println("您的等级是：" + str);
		}
		*/
		
		
		//打印九九乘法表
		int i = 1;
		int j = 1;
		for(i = 1; i <= 9; i++){
			for(j = 1;j <= i; j++){
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
	}
}