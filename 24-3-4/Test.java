public class Test{
	
	//求x的y次方
	public static int pow(int x, int y){
		int result = 1;
		while(y != 0){
			result *= x;
			y--;
		}
		return result;
	}
	
	public static boolean isPalindromeNumber(int num){
		// 1、题目：一个5位数，判断它是不是回文数。即12321是回文数，
		// 个位与万位相同，十位与千位相同
		int count = 1;
		int temp = num;
		boolean flag = true;
		while(temp/10 != 0){
			count++;
			temp /= 10;
		}
		//System.out.println("count = " + count);
		temp = num;
		//System.out.println("temp = " + temp);
		while(temp/10 != 0){
			//System.out.println("temp % 10 = " + (temp % 10));
			//System.out.println("temp / (10 * (count - 1)) = " + (temp / pow(10, count - 1)));
			if(temp % 10 != temp / pow(10, count - 1)){
				flag = false;
				break;
			}
			temp %= pow(10, count - 1);
			//System.out.println("temp = " + temp);
			temp /= 10;
			//System.out.println("temp = " + temp);
			count -= 2;
			//System.out.println("count = " + count);
		}
		return flag;
	}
	
	
	public static int peachNumber(int day){
		// 2、题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，
		// 还不瘾，又多吃了一个。第二天早上又将剩下的桃子吃掉一半，又多吃了
		// 一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上
		// 想再吃时，只剩下一个桃子了。求第一天共摘了多少
		int count = 1;
		for(--day;day >= 1;day--){
			count = (count + 1) * 2;
		}
		return count;
	}
	//1 4 10 22 46 94 190 382 766 1534
	
	
	public static int sumFactorial(int num){
		// 3、题目：计算 1! + 2! + 3! + 4! +... + 10!
		// 说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4
		int ret = 1;
		int sum = 0;
		for(int i = 1;i <= num;i++){
			ret *= i;
			sum += ret;
		}
		return sum;
	}
	
	
	public static double distance(int num){
		// 4、题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
		// 求它在第10次落地时，共经过多少米
		double sum = 0;
		double height = 100;
		double temp = height;
		while(num!=0){
			sum += 2*temp;
			num--;
			temp /= 2;
		}
		return sum-height;
	}
	
	
	public static int findNumber(){
		// 5、一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个
		// 四位数是多少？
		int i = 0;
		for(i = 1000;i<=9999;i++){
			if((i % 1000) * 3 == i)
				break;
		}
		return i;
	}
	
	
	public static boolean isPrimeNumber(int num){
		boolean ret = true;
		if(num == 1 || num == 2)
			ret = false;
		for(int i = 2;i<=num/2;i++){
			if(num % i == 0){
				ret = false;
				break;
			}
		}
		return ret;
	}
	
	
	public static int minPrimeNumber(int num){
		for(int i = num + 1;true;i++){
			if(isPrimeNumber(i))
				return i;
		}
	}
	
	
	public static void main(String args[]){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		//System.out.println(isPalindromeNumber(num)? num + "是回文数字": num + "不是回文数字");
		//System.out.println("第一天摘了" + peachNumber(num) + "个桃子");
		//System.out.println("sum = " + sumFactorial(num));
		//System.out.println("总共经过了" + distance(num) + "米");
		//System.out.println("这个四位数字是" + findNumber());
		//for (num = 1;num<=20;num++)
		//System.out.println(isPrimeNumber(num)? num + "是质数": num + "不是质数");
		System.out.println("大于" + num + "的最小的质数是" + minPrimeNumber(num));
	}
}