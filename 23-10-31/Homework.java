/*
1.��д����ʵ�����ֵ������������ֿ��Ե��಻ͬ�������Ӷ�������ͬ��������
���Ե���������������������ٺ����á�
	ʵ��˼·���ؼ����룺
		1)����������Instrument����������makeSound()
		2)��������������ࣺ����Erhu������Piano��С����Violin
		3)����������Musician�����Ե����������play(Instrument i)
		4)��������࣬�����ֲ�ͬ��������������
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

//������
class Instrument{
	public void makeSound(){
		
	}
}

//������
class ErHu extends Instrument{
	public void makeSound(){
		System.out.println("�������ڵ�����");
	}
}

//Piano��
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("�������ڵ�����");
	}
}

//С������
class Violin extends Instrument{
	public void makeSound(){
		System.out.println("�������ڵ�С����");
	}
}

//������
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
��д����ģ�⡰���ˡ�ι��������ĳ�����
��ʾ1��
	�����ࣺMaster
	�����ࣺPet
	���������ࣺDog��Cat��YingWu
��ʾ2��
	����Ӧ����ι���ķ�����feed()
	����Ӧ���гԵķ�����eat()
	ֻҪ����ι�������ͳԡ�

Ҫ����������ֻ�ṩһ��ι������feed()��Ҫ��ﵽ����ι���������͵ĳ��

��д���Գ���
	�������˶���
	�������ֳ������
	�������˵�ι������feed()��ι����ͬ�ĳ���۲�ִ�н����

ͨ���ð���������̬�ڿ����е����á�
��Ҫ��ʾ��feed�����Ƿ���Ҫһ������������ѡʲô���ͣ�����
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

//������
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


//������
class Pet{
	public void eat(){
		
	}
}

//����
class Dog extends Pet{
	public void eat(){
		System.out.println("�������ڿй�ͷ");
	}
}

//è
class Cat extends Pet{
	public void eat(){
		System.out.println("è���ڳ���");
	}
}

//����
class YingWu extends Pet{
	public void eat(){
		System.out.println("�������ڳԳ���");
	}
}