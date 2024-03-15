public class Pet {
    public void eat(){

    }
}

class Dog extends Pet{
    public void eat(){
        System.out.println("狗正在吃骨头");
    }
}

class Cat extends Pet{
    public void eat(){
        System.out.println("猫正在吃老鼠");
    }
}

class YingWu extends Pet{
    public void eat(){
        System.out.println("鹦鹉正在吃虫子");
    }
}