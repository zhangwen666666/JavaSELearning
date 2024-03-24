package com.homework;

//	写一个类Army,代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所拥有的所有武器），
//  该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量, 并用这一大小来初始化数组w。
//  该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
//  在这个类中还定义两个方法attackAll()让w数组中的所有武器攻击；以及moveAll()让w数组中的所有可移动的武器移动。
//  写一个主方法去测试以上程序。
//  提示：
//       Weapon是一个父类。应该有很多子武器。这些子武器应该有一些是可移动的，有一些是可攻击的。
public class Army {
    private Weapon[] w;
    private int weaponCount;

    public Army() {
        this(10);
    }

    public Army(int num) {
        this.w = new Weapon[num];
        this.weaponCount = 0;
    }

    public Army(Weapon[] w) {
        this.w = w;
        this.weaponCount = w.length;
    }

    public boolean addWeapon(Weapon wa) {
        if (w.length == weaponCount) {
            System.out.println("武器库已满，添加失败");
            return false;
        }
        w[weaponCount++] = wa;
        System.out.println("成功添加" + wa.getName() +"武器");
        return true;
    }

    public void attackAll() {
        for (int i = 0; i < weaponCount; i++) {
            w[i].attack();
        }
    }

    public void moveAll() {
        for (int i = 0; i < weaponCount; i++) {
            if (w[i].getMove())
                System.out.println(w[i].getName() + "正在移动");
        }
    }

    public String toString(){
        if(weaponCount == 0){
            return "武器数量为0";
        }
        String result = "武器数量为" + weaponCount +",\n具体内容如下:\n";
        for(int i = 0;i<weaponCount;i++){
            result += w[i].toString();
        }
        return result;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Army)) return false;
        if(this == obj) return true;
        Army army = (Army)obj;
        boolean flag = true;
        if(this.weaponCount!= army.weaponCount)
            return false;
        for(int i = 0; i<weaponCount;i++){
            if(!(this.w[i].equals(army.w[i])))
                return false;
        }
        return true;
    }
}

class Weapon {
    private String name;
    private boolean isMove;

    public Weapon() {
    }

    public Weapon(String name, boolean isMove) {
        this.name = name;
        this.isMove = isMove;
    }

    public void attack() {
    }

    public boolean getMove() {
        return isMove;
    }

    public void setMove(boolean move) {
        isMove = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "名称：" + name + (isMove ? "，可以移动\n" : "，不能移动\n");
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Weapon)) return false;
        if(this == obj) return true;
        Weapon weapon = (Weapon)obj;
        return isMove == weapon.isMove && name.equals(weapon.name);
    }
}

class Rifle extends Weapon {
    public Rifle() {
    }

    public Rifle(String name, boolean isMove) {
        super(name, isMove);
    }

    public void attack() {
        System.out.println(getName() + "正在攻击");
    }
}

class SniperRifle extends Weapon {
    public SniperRifle() {
    }

    public SniperRifle(String name, boolean isMove) {
        super(name, isMove);
    }

    public void attack() {
        System.out.println(getName() + "正在攻击");
    }
}


class Tank extends Weapon {
    public Tank() {
    }

    public Tank(String name, boolean isMove) {
        super(name, isMove);
    }

    public void attack() {
        System.out.println(getName() + "正在攻击");
    }
}

class Test{
    public static void main(String[] args) {
        Rifle r1 = new Rifle("AK47",true);
        Rifle r2 = new Rifle("M4A1",true);
//        System.out.println(r1.equals(r2));
//        System.out.println(r1);
        SniperRifle s1 = new SniperRifle("巴雷特",true);
        SniperRifle s2 = new SniperRifle("AWM",true);
        Tank t = new Tank("41式坦克",false);
        Army a = new Army(5);
        System.out.println(a);
        a.addWeapon(r1);
        a.addWeapon(s1);
        a.addWeapon(t);
        a.addWeapon(s2);
        a.addWeapon(r2);
        a.addWeapon(r2);
//        System.out.println(a);
//        a.attackAll();
//        a.moveAll();

        Army a2 = new Army(5);
//        System.out.println(a2);
        a2.addWeapon(r1);
        a2.addWeapon(s1);
        a2.addWeapon(t);
        a2.addWeapon(s2);
        a2.addWeapon(r2);

        System.out.println(a.equals(a2));
    }
}


