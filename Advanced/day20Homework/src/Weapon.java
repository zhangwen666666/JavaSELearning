//第一题：
//        （1）定义一个抽象类Weapon,该抽象类有两个抽象方法attack()，move()
//        这两个方法分别表示武器的攻击方式和移动方式。
//（2）定义3个类：Tank,Flighter,WarShip都继承自Weapon,
//        分别用不同的方式实现Weapon类中的抽象方法。
public abstract class Weapon {
    public abstract void attack();
    public abstract void move();

}

class Tank extends Weapon{
    public void attack(){
        System.out.println("坦克正在开炮");
    }
    public void move(){
        System.out.println("坦克正在移动");
    }
}

class Flighter extends Weapon{
    public void attack(){
        System.out.println("Flighter正在攻击");
    }
    public void move(){
        System.out.println("Flighter正在移动");
    }
}

class WarShip extends Weapon{
    public void attack(){
        System.out.println("WarShip正在攻击");
    }
    public void move(){
        System.out.println("WarShip正在移动");
    }
}

class MyMain{
    public static void main(String[] args) {
        Weapon tank = new Tank();
        Weapon flighter = new Flighter();
        Weapon warShip = new WarShip();
        MyMain m = new MyMain();
        m.attack(tank);
        m.attack(flighter);
        m.attack(warShip);
        m.move(tank);
        m.move(flighter);
        m.move(warShip);
    }

    public void move(Weapon w){
        w.move();
    }
    public void attack(Weapon w){
        w.attack();
    }
}



