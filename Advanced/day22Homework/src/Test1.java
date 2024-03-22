/*第一题：
        （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
        （2）定义接口B，里面包含抽象方法void setColor(String c)。
        （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
        （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
        圆柱体的高height、颜色color。
        （5）创建主类来测试类Cylinder。*/
public class Test1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3,4,"蓝色");
        Cylinder c2 = new Cylinder(3,4,"黄色");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.area());  //150.72
        c1.volume();//113.04
        System.out.println(c1.equals(c2));   //false
        c2.setColor("蓝色");
        System.out.println(c2);
        System.out.println(c1.equals(c2));   //true

    }
}

interface A{
    public abstract double area();
    public static final double PI = 3.14;
}

interface B{
    void setColor(String c);
}

interface C extends A,B{
    void volume();
}

class Cylinder implements C{
    private double radius;
    private double height;
    private String color;

    public Cylinder(){}
    public Cylinder(double radius,double height,String color){
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public void setRadius(double radius){this.radius = radius;}
    public double getRadius(){return radius;}
    public void setHeight(double height){this.height = height;}
    public double getHeight(){return height;}
    public void setColor(String color){this.color = color;}
    public String getColor(){return color;}

    public double area(){
        return PI * radius * radius * 2 + 2 * PI * radius * height;
    }
    public void volume(){
        System.out.println("体积是：" + (PI * radius * radius * height));
    }

    public String toString(){
        return "半径：" + radius + ",高：" + height + ",颜色：" + color;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Cylinder)) return false;
        if(obj == this) return true;
        Cylinder tmp = (Cylinder)obj;
        return radius == tmp.getRadius() && height == tmp.height && color.equals(tmp.color);
    }
}
