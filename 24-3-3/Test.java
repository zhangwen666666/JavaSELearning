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
		
		//1������1000�������в��ܱ�7����������֮��
		/*
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			if(i % 7 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum); //429429
		*/
		

		//2������ 1+2-3+4-5+6-7....+100�Ľ��
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
		

		//3���ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		int ret = 1;
		for(int i = num; i >= 1; i--){
			ret *= i;
		}
		System.out.println(num + "! = " + ret);
		*/
		

		//4���ӿ���̨����һ�����������жϸ������Ƿ�Ϊ����
		//������������ָ�ڴ���1����Ȼ���У�����1�����������ⲻ����������������Ȼ����
		/*
		java.util.Scanner s = new java.util.Scanner(System.in);
		//int num = s.nextInt();
		for(int num = 1;num <= 20;num++){
			if(num <= 0)
				System.out.println("���벻�Ϸ�");
			else{
				boolean flag = false;
				for(int i = 2; i <= num/2; i++){
					if(num % i == 0){
						System.out.println(num + "��������");
						flag = true;
						break;
					}
				}
				if(flag == false)
					System.out.println(num + "������");
			}
		}
		*/
		

		/*
		5���Ӽ��̽���һ��������������������Ϊ�������������ͼ��
			*
		   ***
		  *****
		 *******
		*********
		���磺����5�����ӡ����ͼ5�С�
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


		//6��С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5��
		//����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
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
		

		//7��һ�������ǡ�õ�����������֮�ͣ�������������������� 6 = 1 + 2 + 3�����
		//�ҳ�1000�����е�������
		/*
		for(int i = 1;i < 10000; i++){
			int num = 0;
			for(int k = 1;k <= i / 2;k++){
				if(i % k == 0)
					num += k;
			}
			if(num == i)
				System.out.println(i + "������");
		}
		*/
		

		//8����һ��������5λ����������
		//Ҫ��
		//һ�������Ǽ�λ��
		//���������ӡ����λ����
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