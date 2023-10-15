public class Homework{
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = scanner.nextInt();
		//System.out.println(num + "! = " + fact(num));
		System.out.println("大于"+ num + "的最小质数是：" + primeNumber(num));
	}
	
	//编写一个方法，求整数n的阶乘
	public static int fact(int n){
		int ret = 1;
		for(int i = 1;i <= n; i++)
		{
			ret *= i;
		}
		return ret;
	}
	
	//编写一个方法，输出大于某个正整数n的最小的质数
	public static int primeNumber(int n){
		int ret = n;
		while(!isPrime(++ret)){

		}
		return ret;
	}
	public static boolean isPrime(int n){
		//该方法用来判断一个数是否为质数
		if(n <= 1)
			return false;
		for(int i = 2;i <= java.lang.Math.sqrt(n);i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}