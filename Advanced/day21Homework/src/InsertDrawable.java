public interface InsertDrawable {
    void insert();
}

class Mouse implements InsertDrawable{
    private String brand;
    public Mouse(){}
    public Mouse(String brand){this.brand = brand;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void insert(){
        System.out.println("插入了一个" + brand + "牌的鼠标");
    }
}

class Keyboard implements InsertDrawable{
    private String brand;
    public Keyboard(){}
    public Keyboard(String brand){this.brand = brand;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void insert(){
        System.out.println("插入了一个" + brand + "牌的键盘");
    }
}

class Monitor implements InsertDrawable{
    private String brand;
    public Monitor(){}
    public Monitor(String brand){this.brand = brand;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void insert(){
        System.out.println("插入了一个" + brand + "牌的显示器");
    }
}

class Printer implements InsertDrawable{
    private String brand;
    public Printer(){}
    public Printer(String brand){this.brand = brand;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void insert(){
        System.out.println("插入了一个" + brand + "牌的打印机");
    }
}

class GraphicsCard implements InsertDrawable{
    private String brand;
    public GraphicsCard(){}
    public GraphicsCard(String brand){this.brand = brand;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void insert(){
        System.out.println("插入了一个" + brand + "牌的显卡");
    }
}