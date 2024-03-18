/*第二题：
        在画图软件中，可以画出不同大小或颜色的圆形、矩形等几何图形。几何图形之间有许多共同的特征，如它们可以是用某种颜色画出来的，可以是填充的或者不填充的。此外还有些不同的特征，比如，圆形都有半径，可以根据半径计算圆形的面积和周长，矩形都有宽和高，可以根据宽高来计算矩形的面积和周长。
        1、编写Java程序。
        (1)使用继承机制，分别设计实现抽象类 图形类，子类类圆形类、正方形类、长方形类，要求：
        ①抽象类图形类中有属性包括画笔颜色(String类型)、图形是否填充(boolean类型：true表示填充，false表示不填充)，
        有方法获取图形面积、获取图形周长等；
        ②使用构造方法为其属性赋初值；
        ③在每个子类中都重写toString()方法，返回所有属性的信息；
        ④根据文字描述合理设计子类的其他属性和方法。

        (2)设计实现画板类，要求：
        ①画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
        ②画一个绿色、有填充、半径为3.0的圆形；
        ③画一个黄色、无填充、边长为4.0的正方形；
        ④分别求三个对象的面积和周长，并将每个对象的所有属性信息打印到控制台。*/
public abstract class Graph {
    private String color;
    private boolean padding;
    public abstract double getArea();
    public abstract double getPerimeter();

    public Graph(){}
    public Graph(String color,boolean padding){
        this.color = color;
        this.padding = padding;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPadding() {
        return padding;
    }

    public void setPadding(boolean padding) {
        this.padding = padding;
    }
}

class Circle extends Graph{
    private double radius;
    public Circle(){}
    public Circle(String color,boolean padding,double radius){
        super(color,padding);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius *radius;
    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    public String toString(){
        return "颜色：" + this.getColor() + ", 是否填充:" + this.isPadding() + ", 半径:" + radius;
    }
}

class Square extends Graph{
    private double sideLength;

    public Square() {
    }
    public Square(String color, boolean padding, double sideLength) {
        super(color, padding);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea(){
        return sideLength * sideLength;
    }
    public double getPerimeter(){
        return 4 * sideLength;
    }

    public String toString(){
        return "颜色：" + this.getColor() + ", 是否填充:" + this.isPadding() + ", 边长:" + sideLength;
    }
}

class Rectangle extends Graph{
    private double length;
    private double width;
    public Rectangle(){}
    public Rectangle(String color,boolean padding,double length,double width){
        super(color,padding);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }

    public String toString() {
        return "颜色：" + this.getColor() + ", 是否填充:" + this.isPadding() + ", 长:" + this.length + ", 宽:" + this.width;
    }
}

class canvas{
    public static void main(String[] args){
        Graph circle = new Circle("green",true,3.0);
        Graph rectangle = new Rectangle("red",false,10.0,5.0);
        Graph square = new Square("yellow",false,4.0);

        System.out.println(circle + ", 面积是:" + getArea(circle) + ", 周长是:" + getPerimeter(circle));
        System.out.println(rectangle + ", 面积是:" + getArea(rectangle) + ", 周长是:" + getPerimeter(rectangle));
        System.out.println(square + ", 面积是:" + getArea(square) + ", 周长是:" + getPerimeter(square));
    }

    public static double getArea(Graph g){
        return g.getArea();
    }

    public static double getPerimeter(Graph g){
        return g.getPerimeter();
    }
}