public class Homework{
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("������һ��������");
		int num = scanner.nextInt();
		//System.out.println(num + "! = " + fact(num));
		System.out.println("����"+ num + "����С�����ǣ�" + primeNumber(num));
	}
	
	//��дһ��������������n�Ľ׳�
	public static int fact(int n){
		int ret = 1;
		for(int i = 1;i <= n; i++)
		{
			ret *= i;
		}
		return ret;
	}
	
	//��дһ���������������ĳ��������n����С������
	public static int primeNumber(int n){
		int ret = n;
		while(!isPrime(++ret)){

		}
		return ret;
	}
	public static boolean isPrime(int n){
		//�÷��������ж�һ�����Ƿ�Ϊ����
		if(n <= 1)
			return false;
		for(int i = 2;i <= java.lang.Math.sqrt(n);i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}