public class Override01{
	public static void main(String[] args){
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		
		a1.move();	// 小猫在移动
		a2.move();	// 小鸟在移动
		
		Animal a3 = new Cat();
		//a3.catchMouth();
		Cat x = (Cat)a3;  // 将a3向下转型为Cat类型
		x.catchMouth();
		
		Animal a4 = new Bird();
		if(a4 instanceof Cat){
			Cat y = (Cat)a4;  // 将a4向下转型为Cat类型
			y.catchMouth();
		}
		
		Cat c = new Cat();
		System.out.println(c instanceof Animal);//true
	}
}

class Animal{
	public void move(){
		System.out.println("动物在移动");
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("小猫在移动");
	}
	
	//猫的专属方法，抓老鼠方法
	public void catchMouth(){
		System.out.println("猫正在抓老鼠");
	}
}

class Bird extends Animal{
	public void move(){
		System.out.println("小鸟在移动");
	}
}