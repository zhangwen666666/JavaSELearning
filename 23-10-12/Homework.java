public class Homework{
	public static void main(String[] args){
		//判断一个五位数是不是回文数字
		/*
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		if((num / 10000 == num % 10) & ((num / 1000) % 10 == (num / 10) % 10))
			System.out.println(num + "是回文数字");
		else
			System.out.println(num + "不是回文数字");
		*/
		
		/*
		//猴子吃桃，第一天摘了若干个桃子，当即吃了一半，还不过瘾又吃了一个，第二天
		//早上又将剩下的桃子吃掉一半，又多吃了一个，以后每天早上都吃了前一天剩下的
		//一半多一个，到第10天早上，想再吃时，只剩下一个桃子，求第一天共摘了多少
		int count = 1;
		for(int i = 9;i >= 1;i--)
		{
			count = count * 2 + 1;
		}
		System.out.println("count = " + count);
		*/
		
		/*
		//计算1！+2！+3！...+10！
		int i = 10;
		int sum = 0;
		int ret = 1;
		for(int j = 1;j <= 10; j++){
			ret *= j;
			sum += ret;
		}
		System.out.println("sum = " + sum);
		*/
		
		//一个球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
		//求它在第10次落地时，共经过多少米
		/*
		double height = 100;
		double sum = 100;
		for(int i = 2;i <= 10; i++){
			height /= 2;
			sum += height * 2;
		}
		System.out.println("sum = " + sum);
		*/
		
		//一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，
		//这个四位数是多少
		for(int i = 1000;i <= 9999;i++){
			if((i % 1000) * 3 == i){
				System.out.println(i);
			}
		}
	}
}