public class Homework{
	public static void main(String[] args){
		//�ж�һ����λ���ǲ��ǻ�������
		/*
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		if((num / 10000 == num % 10) & ((num / 1000) % 10 == (num / 10) % 10))
			System.out.println(num + "�ǻ�������");
		else
			System.out.println(num + "���ǻ�������");
		*/
		
		/*
		//���ӳ��ң���һ��ժ�����ɸ����ӣ���������һ�룬��������ֳ���һ�����ڶ���
		//�����ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�
		//һ���һ��������10�����ϣ����ٳ�ʱ��ֻʣ��һ�����ӣ����һ�칲ժ�˶���
		int count = 1;
		for(int i = 9;i >= 1;i--)
		{
			count = count * 2 + 1;
		}
		System.out.println("count = " + count);
		*/
		
		/*
		//����1��+2��+3��...+10��
		int i = 10;
		int sum = 0;
		int ret = 1;
		for(int j = 1;j <= 10; j++){
			ret *= j;
			sum += ret;
		}
		System.out.println("sum = " + sum);
		*/
		
		//һ�����100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�������£�
		//�����ڵ�10�����ʱ��������������
		/*
		double height = 100;
		double sum = 100;
		for(int i = 2;i <= 10; i++){
			height /= 2;
			sum += height * 2;
		}
		System.out.println("sum = " + sum);
		*/
		
		//һ����λ����ǡ�õ���ȥ��������λ����֮����ʣ����λ����3����
		//�����λ���Ƕ���
		for(int i = 1000;i <= 9999;i++){
			if((i % 1000) * 3 == i){
				System.out.println(i);
			}
		}
	}
}