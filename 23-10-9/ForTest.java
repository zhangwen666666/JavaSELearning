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
		//��1000�������в��ܱ�7���������ֵĺ͡�
		int sum = 0;
		for(int i = 0;i <= 1000;i++){
			if(i % 7 == 0)
				continue;
			else
				sum += i;
		}
		System.out.println("1000�������в��ܱ�7���������ֵĺ��ǣ�" + sum);
		*/
	
		/*
		//����1+2-3+4-5.....+100�Ľ��
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
		//�ӿ���̨����һ���Ǹ���������������Ľ׳�
		int ret = 1;
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ���Ǹ�������");
		int num = s.nextInt();
		if(num < 0){
			System.out.println("������������󣡣���");
			return;
		}
		if(num != 0){
			for(int i = 1;i <= num;i++){
				ret *= i; 
			} 
		}
		System.out.println(num + "! = " + ret);
		*/
		
		
		//�ӿ���̨����һ�����������жϸ������Ƿ�Ϊ����
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
			System.out.println(num + "��������");
		else
			System.out.println(num + "������");
		
		
		/*
		//�Ӽ��̽���һ��������������������Ϊ�������������ͼ��
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
		//С��������ÿ�����2.5Ԫ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�����
		//����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С�����ܴ浽100Ԫ
		float money = 0.0f;
		int day = 0;
		for(day = 0;money < 100;){
			day++;
			money += 2.5;
			if(day % 5 == 0)
				money -= 6;
		}
		System.out.println("��Ҫ" + day + "�����" + money + "Ԫ");
		*/
		
		/*
		//��1000���ڵ�����
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
		
		//����һ��������5λ���������������Ǽ�λ�����������ӡ����λ����
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