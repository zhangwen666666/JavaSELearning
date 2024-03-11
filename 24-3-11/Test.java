public class Test{
	public static void main(String args[]){
		int num = 5;
		System.out.println(sum1(num));
		System.out.println(sum2(num));
		System.out.println(fact(num));
	}
	
	public static int sum1(int num){
		int sum = 0;
		for(int i = 1;i<=num;i++){
			sum += i;
		}
		return sum;
	}
	
	public static int sum2(int num){
		if(num == 1)
			return 1;
		return num + sum2(num - 1);
	}
	
	public static int fact(int num){
		if(num == 1)
			return 1;
		return num * fact(num - 1);
	}
}