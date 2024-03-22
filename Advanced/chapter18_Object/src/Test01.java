public class Test01 {
    public static void main(String[] args) {
        for(int i = 0;i<200;i++){
            //制造垃圾对象
            Person p = new Person();
            p = null;

            //
            // 有一段代码可以建议垃圾回收器启动。
            if(i % 2 == 0){
                System.gc(); // 建议启动垃圾回收器。（只是建议，可能不启动，也可能启动。启动的概率高了一些。）
            }
        }
    }
}

class Person{
    //重写finalize()方法
    protected void finalize() throws Throwable{
        System.out.println(this + "即将被销毁！");
    }
}
