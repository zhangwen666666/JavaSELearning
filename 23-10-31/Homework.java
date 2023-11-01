/*
1.编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
可以弹奏的乐器包括二胡、钢琴和琵琶。
	实现思路及关键代码：
		1)定义乐器类Instrument，包括方法makeSound()
		2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
		3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
		4)定义测试类，给乐手不同的乐器让他弹奏
*/

/*
public class Homework{
	public static void main(String[] args){
		Instrument i1 = new ErHu();
		Instrument i2 = new Piano();
		Instrument i3 = new Violin();
		Musician musician = new Musician();
		//musician.play;
		musician.play(i1);
		musician.play(i2);
		musician.play(i3);
	}
}

//乐器类
class Instrument{
	public void makeSound(){
		
	}
}

//二胡类
class ErHu extends Instrument{
	public void makeSound(){
		System.out.println("乐手正在弹二胡");
	}
}

//Piano类
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("乐手正在弹钢琴");
	}
}

//小提琴类
class Violin extends Instrument{
	public void makeSound(){
		System.out.println("乐手正在弹小提琴");
	}
}

//乐手类
class Musician{
	public void play(Instrument i){
		if(i instanceof ErHu){
			ErHu erhu = (ErHu)i;
			erhu.makeSound();
		}
		if(i instanceof Piano){
			Piano piano = (Piano)i;
			piano.makeSound();
		}
		if(i instanceof Violin){
			Violin violin = (Violin)i;
			violin.makeSound();
		}
	}
	
	public void play(int i){
		
	}
}
*/


/*
编写程序模拟“主人”喂养“宠物”的场景：
提示1：
	主人类：Master
	宠物类：Pet
	宠物类子类：Dog、Cat、YingWu
提示2：
	主人应该有喂养的方法：feed()
	宠物应该有吃的方法：eat()
	只要主人喂宠物，宠物就吃。

要求：主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。

编写测试程序：
	创建主人对象
	创建各种宠物对象
	调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。

通过该案例，理解多态在开发中的作用。
重要提示：feed方法是否需要一个参数，参数选什么类型！！！
*/

public class Homework{
	public static void main(String[] args){
		Master m = new Master();
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		Pet p3 = new YingWu();
		m.feed(p1);
		m.feed(p2);
		m.feed(p3);
	}
}

//主人类
class Master{
	public void feed(Pet p){
		/*
		if(p instanceof Dog){
			Dog d = (Dog)p;
			d.eat();
		}
		if(p instanceof Cat){
			Cat c = (Cat)p;
			c.eat();
		}
		if(p instanceof YingWu){
			YingWu yw = (YingWu)p;
			yw.eat();
		}
		*/
		p.eat(); 
	}
}


//宠物类
class Pet{
	public void eat(){
		
	}
}

//狗狗
class Dog extends Pet{
	public void eat(){
		System.out.println("狗狗正在啃骨头");
	}
}

//猫
class Cat extends Pet{
	public void eat(){
		System.out.println("猫正在吃鱼");
	}
}

//鹦鹉
class YingWu extends Pet{
	public void eat(){
		System.out.println("鹦鹉正在吃虫子");
	}
}