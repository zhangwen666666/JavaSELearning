public class Test{
	public static void main(String args[]){
		/*
		for1:for(int i = 0; i < 2; i++){
			for2:for(int k = 0; k < 10; k++){
				if(k == 5)
					continue for1;
				System.out.println("k = " + k);
			}
		}
		*/
		
		//1、计算1000以内所有不能被7整除的整数之和
		/*
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			if(i % 7 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum); //429429
		*/
		

		//2、计算 1+2-3+4-5+6-7....+100的结果
		/*
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 1 && i != 1)
				sum -= i;
			else
				sum += i;
		}
		System.out.println(sum); //52
		*/
		

		//3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		int ret = 1;
		for(int i = num; i >= 1; i--){
			ret *= i;
		}
		System.out.println(num + "! = " + ret);
		*/
		

		//4、从控制台接收一个正整数，判断该数字是否为质数
		//质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		//int num = s.nextInt();
		for(int num = 1;num <= 20;num++){
			if(num <= 0)
				System.out.println("输入不合法");
			else{
				boolean flag = false;
				for(int i = 2; i <= num/2; i++){
					if(num % i == 0){
						System.out.println(num + "不是质数");
						flag = true;
						break;
					}
				}
				if(flag == false)
					System.out.println(num + "是质数");
			}
		}
		*/
		

		/*
		5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
			*
		   ***
		  *****
		 *******
		*********
		例如：输入5，则打印如上图5行。
		*/
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1;j <= num - i; j++){
				System.out.print(" ");
			}
			for(int j = 1;j <= 2 * i - 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/


		//6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
		//或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		/*
		int day = 0;
		double money = 0;
		while(true){
			money = money + 2.5;
			day++;
			if(money > 100)
				break;
			if(day % 5 == 0)
				money -= 6;
		}
		System.out.println(day); //74
		*/
		

		//7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
		//找出1000内所有的完数。
		/*
		for(int i = 1;i < 10000; i++){
			int num = 0;
			for(int k = 1;k <= i / 2;k++){
				if(i % k == 0)
					num += k;
			}
			if(num == i)
				System.out.println(i + "是完数");
		}
		*/
		

		//8、给一个不多于5位的正整数，
		//要求：
		//一、求它是几位数
		//二、逆序打印出各位数字
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		int ret = 1;
		while(num/10 != 0){
			System.out.print(num % 10);
			num /= 10;
			ret++;
		}
		System.out.print(num % 10);
		System.out.print("\n" + ret);
		*/
		m1();
	}
	
	
	public static void m1(){
		System.out.println("m1");
		String[] str = {"a","b"};
		main(str);
	}
}