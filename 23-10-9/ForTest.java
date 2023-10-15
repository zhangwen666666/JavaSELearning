public class ForTest{
	public static void main(String[] args){
		/*
		int sum = 0;
		for(int i = 1; i < 100; i += 2){
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		int total = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 1)
				total += i;
		}
		System.out.println("total = " + total);
		*/
		
		/*
		int i = 1,j = 1;
		for (i = 1; i < 10; i++){
			for(j = 1;j<=i;j++)
			{
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i = 0;i < 10;i++){
			System.out.println(i);
			if(i == 5)
				continue;
		}
		*/
		
		/*
		//求1000以内所有不能被7整除的数字的和。
		int sum = 0;
		for(int i = 0;i <= 1000;i++){
			if(i % 7 == 0)
				continue;
			else
				sum += i;
		}
		System.out.println("1000以内所有不能被7整除的数字的和是：" + sum);
		*/
	
		/*
		//计算1+2-3+4-5.....+100的结果
		int sum = 1;
		for(int i = 2;i <= 100;i++){
			if(i % 2 == 0)
				sum += i;
			else
				sum -= i;
		}
		System.out.println("sum = " + sum);
		*/
		
		/*
		//从控制台输入一个非负整数，计算该数的阶乘
		int ret = 1;
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个非负整数：");
		int num = s.nextInt();
		if(num < 0){
			System.out.println("你输入的数有误！！！");
			return;
		}
		if(num != 0){
			for(int i = 1;i <= num;i++){
				ret *= i; 
			} 
		}
		System.out.println(num + "! = " + ret);
		*/
		
		
		//从控制台接受一个正整数，判断该数字是否为质数
		int num;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		int flag = 1;
		for(int i = 2;i <= java.lang.Math.sqrt(num);i++){
			if(num % i == 0){
				flag = 0;
				break;
			}
		}
		if(flag == 0 | num == 1)
			System.out.println(num + "不是质数");
		else
			System.out.println(num + "是质数");
		
		
		/*
		//从键盘接受一个正整数，该正整数做为行数，输出以下图形
		//    *    
		//   ***
		//  *****
		// *******
		//*********
		int num;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		for(int i = 0;i < num;i++){
			for(int j = 0;j < num - 1 - i;j++){
				System.out.print(" ");
			}
			for(int j = 0;j < 2 * (i + 1) - 1;j++){
				System.out.print("*");
			}
			for(int j = 0;j < num - 1 - i;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
		*/
		
		/*
		//小芳的妈妈每天给她2.5元，她都会存起来，但是，每当这一天是存钱的第五天
		//或者5的倍数的话，她都会花去6元钱。请问，经过多少天，小芳才能存到100元
		float money = 0.0f;
		int day = 0;
		for(day = 0;money < 100;){
			day++;
			money += 2.5;
			if(day % 5 == 0)
				money -= 6;
		}
		System.out.println("需要" + day + "天存了" + money + "元");
		*/
		
		/*
		//求1000以内的完数
		for(int i = 1; i <= 1000; i++){
			int sum = 0;
			for(int j = 1; j <= i / 2; j++){
				if(i % j == 0)
					sum += j;
			}
			if(sum == i)
				System.out.print(i + " ");
		}
		*/
		
		//给出一个不多于5位的正整数，求他是几位数，并逆序打印处各位数字
		/*
		int num,count = 0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		num = scanner.nextInt();
		while(num > 0){
			count += 1;
			int ret = num % 10;
			System.out.print(ret + " ");
			num /= 10;
		}
		System.out.println();
		System.out.println("count = " + count);
		*/
	}
}  