public class Test{
	public static void main(String args[]){
		/*
		char c1 = 'a';
		System.out.println("\"test\"");
		
		long l = 2147483647L;
		int x = (int)l;
		System.out.println(x);
		*/
		
		/*
		char c1 = 'a';
		byte b = 1;
		System.out.println(c1 + b);
		
		//short s = c1 + b;
		short s = 98;
		*/
		
		/*
		byte x = 100;
		x += 100;
		System.out.println(x);
		*/
		
		/*
		int x = 10;
		int a = x+ x++;	//a=20 x=11 
		System.out.println("a =" + a);
		System.out.println("x =" + x);
		int b = x + ++x;	//b=23 x=12
		System.out.println("b =" + b);
		System.out.println("x =" + x);
		int c = x + x--;  //c=24 x=11
		System.out.println("c =" + c);
		System.out.println("x =" + x);
		int d = x + --x;//d=21 x=10
		System.out.println("d =" + d);
		System.out.println("x =" + x);
		*/
		
		/*
		int a = 15;
		int b = 2;
		double c = 2;
		System.out.println(a + "/" + b + "=" + (a / b)); // 15/2=7
		System.out.println(a + "%" + b + "=" + (a % b)); // 15%2=1
		System.out.println(a + "/" + c + "=" + (a / c)); // 15/2=7.5
		System.out.println(a + "%" + c + "=" + (a % c)); // 15%2=1.0
		*/
		
		/*
		boolean x, y, z;
		int a = 15;
		int b = 2;
		x = a > b; // true;
		y = a < b; // false;
		z = a != b; // true;
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("z =" + z);
		*/
		
		/*
		int x;
		double y;
		x = (int) 22.5 + (int) 34.7; //x = 56
		y = (double) x; // y=56.0
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		*/
		
		/*
		int i = 5;
		int j = 5;
		int m = 5;
		int n = 5;
		i++; //i=6
		j = j + 1;	//j=6
		m--;	//m=4
		n = n - 1;	//n=4
		System.out.println(i);		//6
		System.out.println(i++);	//6  i=7
		System.out.println(++i);	//8  i=8
		System.out.println(i--);	//8  i=7
		System.out.println();
		System.out.println(j);		//6
		System.out.println(j++);	//6	 j=7
		System.out.println(j--);	//7	 j=6
		System.out.println(--j);	//5  j=5
		System.out.println();
		System.out.println(m);		//4
		System.out.println(n);		//4
		*/
		
		/*
		int i = 0;
		int j = 0;
		System.out.println(i);	//0
		System.out.println(j);	//0
		i++;	//i=1
		++j;	//j=1
		System.out.println(i);	//1
		System.out.println(j);	//1
		System.out.println("--------------------------");
		System.out.println(i++);	//1 i=2
		System.out.println(++j);	//2 j=2
		System.out.println("--------------------------");
		System.out.println(i);	//2
		System.out.println(j);  //2
		*/
		
		
		/*
		char c = 'f';
		switch(c){
		case 'a':
			System.out.println("�ַ�a");
			break;
		case 'b':
			System.out.println("�ַ�b");
			break;
		case 'c':
			System.out.println("�ַ�v");
			//break;
		case 'd':
			System.out.println("�ַ�d");
			//break;	
		case 'f':
			System.out.println("�ַ�f");
			//break;
		default:
			System.out.println("�ַ�");
			//break;
		}
		*/
		
		/*
		1������ָ���·ݣ���ӡ���·������ļ��ڡ�
		3,4,5 ���� 
		6,7,8 �ļ� 
		9,10,11 �＾ 
		12, 1, 2 ����
		if��switch��дһ��
		*/
		/*
		System.out.print("������һ���·ݣ�");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int month = s.nextInt();
		String season = "������";
		if(month < 1 || month > 12)
			season = "��������·���Ч������";
		else if(month <= 2)
			season = "����";
		else if(month <= 5)
			season = "����";
		else if(month <= 8)
			season = "�ļ�";
		else if(month <= 11)
			season = "�＾";
		else
			season = "����";
		System.out.println(season);
		
		System.out.print("��������һ���·ݣ�");
		month = s.nextInt();
		switch(month){
		case 1:case 2:case 12:
			season = "����";
			break;
		case 3:case 4:case 5:
			season = "����";
			break;
		case 6:case 7:case 8:
			season = "�ļ�";
			break;
		case 9:case 10:case 11:
			season = "�＾";
			break;
		default:
			season = "��������·���Ч������";
			break;
		}
		System.out.println(season);
		*/		
		

		// 2���Ӽ��̽���һ�����֣��жϸ����ֵ�������
		/*
		System.out.print("������һ������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		double num = s.nextDouble();
		if(num < 0)
			System.out.println("����");
		else if(num > 0)
			System.out.println("����");
		*/
		

		//3���Ӽ��̽���һ�����֣��жϸ����ֵ���ż��
		/*
		System.out.print("������һ����������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num = s.nextInt();
		if(num % 2 == 1)
			System.out.println(num + "������");
		else
			System.out.println(num + "��ż��");
		*/


		/*
		4��������С�Ƚϣ����������������Ƚϴ�С��
			��x>y ��� >
			��x=y ��� =
			��x<y ��� <
		*/
		/*
		System.out.print("�������������֣�");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		char c = '=';
		if(num1 > num2)
			c = '>';
		else if(num1 < num2)
			c = '<';
		System.out.println(c);
		*/


		//5����д�����ɼ����������������ֱ�������num1,num2,num3�У������ǽ�������
		//ʹ��if-else�ṹ��������С�����˳�����
		/*
		System.out.print("�������������֣�");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		if(num1 < num2 && num1 < num3){
			if(num2 < num3)
				System.out.println(num1 + " " + num2 + " " + num3);
			else
				System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if(num2 < num1 && num2 < num3){
			if(num1 < num3)
				System.out.println(num2 + " " + num1 + " " + num3);
			else
				System.out.println(num2 + " " + num3 + " " + num1);
		}
		else{
			if(num1 < num2)
				System.out.println(num3 + " " + num1 + " " + num2);
			else
				System.out.println(num3 + " " + num2 + " " + num1);
		}
		*/
		

		/*
		6�����𲽼�8Ԫ��3KM���ڣ�
		����3KM��������ÿ����1.2Ԫ
		����5KM��������ÿ����1.5Ԫ
		���ڼ����Ͻ��չ��������ó��ܼۡ�
		*/		
		/*
		System.out.print("�������������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		double num1 = s.nextDouble();
		double money = 0;
		if(num1 <= 3)
			money = 8;
		else if(num1 <= 5)
			money = 8 + (num1 - 3) * 1.2;
		else if(num1 > 5)
			money = 8 + 2.4 + (num1 - 5) * 1.5;
		System.out.println(money);
		*/
		
		
		/*
		System.out.print("������ɼ���");
		java.util.Scanner s = new java.util.Scanner(System.in);
		double score = s.nextDouble();
		if(score < 0 || score > 100)
			System.out.println("�ɼ����Ϸ�");
		else{
			int grade = (int)(score / 10);
			String str = "������";
			switch(grade){
			case 10: case 9:
				str = "��";
				break;
			case 8:
				str = "��";
				break;
			case 7:
				str = "��";
				break;
			case 6:
				str = "����";
				break;
			default:
				break;
			}
			System.out.println("���ĵȼ��ǣ�" + str);
		}
		*/
		
		
		//��ӡ�žų˷���
		int i = 1;
		int j = 1;
		for(i = 1; i <= 9; i++){
			for(j = 1;j <= i; j++){
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
	}
}