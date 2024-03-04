public class Test{
	
	//��x��y�η�
	public static int pow(int x, int y){
		int result = 1;
		while(y != 0){
			result *= x;
			y--;
		}
		return result;
	}
	
	public static boolean isPalindromeNumber(int num){
		// 1����Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ�������
		// ��λ����λ��ͬ��ʮλ��ǧλ��ͬ
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
		// 2����Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
		// ����񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����
		// һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10������
		// ���ٳ�ʱ��ֻʣ��һ�������ˡ����һ�칲ժ�˶���
		int count = 1;
		for(--day;day >= 1;day--){
			count = (count + 1) * 2;
		}
		return count;
	}
	//1 4 10 22 46 94 190 382 766 1534
	
	
	public static int sumFactorial(int num){
		// 3����Ŀ������ 1! + 2! + 3! + 4! +... + 10!
		// ˵����4! ��ʾ4�Ľ׳ˡ�4�Ľ׳��ǣ�1 * 2 * 3 * 4
		int ret = 1;
		int sum = 0;
		for(int i = 1;i <= num;i++){
			ret *= i;
			sum += ret;
		}
		return sum;
	}
	
	
	public static double distance(int num){
		// 4����Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�������£�
		// �����ڵ�10�����ʱ��������������
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
		// 5��һ����λ����ǡ�õ���ȥ��������λ����֮����ʣ����λ����3�������
		// ��λ���Ƕ��٣�
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
		//System.out.println(isPalindromeNumber(num)? num + "�ǻ�������": num + "���ǻ�������");
		//System.out.println("��һ��ժ��" + peachNumber(num) + "������");
		//System.out.println("sum = " + sumFactorial(num));
		//System.out.println("�ܹ�������" + distance(num) + "��");
		//System.out.println("�����λ������" + findNumber());
		//for (num = 1;num<=20;num++)
		//System.out.println(isPrimeNumber(num)? num + "������": num + "��������");
		System.out.println("����" + num + "����С��������" + minPrimeNumber(num));
	}
}