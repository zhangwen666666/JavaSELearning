public class Master {
    public static void main(String[] args){
        Pet p1 = new Dog();
        Pet p2 = new Cat();
        Pet p3 = new YingWu();
        Master master = new Master();
        master.feed(p1);
        master.feed(p2);
        master.feed(p3);
    }

    public void feed(Pet p){
        p.eat();
    }
}
