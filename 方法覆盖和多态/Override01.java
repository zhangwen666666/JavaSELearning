public class Override01{
	public static void main(String[] args){
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		
		a1.move();	// Сè���ƶ�
		a2.move();	// С�����ƶ�
		
		Animal a3 = new Cat();
		//a3.catchMouth();
		Cat x = (Cat)a3;  // ��a3����ת��ΪCat����
		x.catchMouth();
		
		Animal a4 = new Bird();
		if(a4 instanceof Cat){
			Cat y = (Cat)a4;  // ��a4����ת��ΪCat����
			y.catchMouth();
		}
		
		Cat c = new Cat();
		System.out.println(c instanceof Animal);//true
	}
}

class Animal{
	public void move(){
		System.out.println("�������ƶ�");
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("Сè���ƶ�");
	}
	
	//è��ר��������ץ���󷽷�
	public void catchMouth(){
		System.out.println("è����ץ����");
	}
}

class Bird extends Animal{
	public void move(){
		System.out.println("С�����ƶ�");
	}
}