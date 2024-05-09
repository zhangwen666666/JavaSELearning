package com.enum2;

public enum Season implements Eatable{
    //枚举值必须写在最前面
    SPRING("春季","万物复苏"){
        @Override
        public void eat() {
            System.out.println("春天吃苹果");
        }
    },
    SUMMER("夏季","烈日炎炎"){
        @Override
        public void eat() {
            System.out.println("夏天吃西瓜");
        }
    },
    AUTUMN("秋季","硕果累累"){
        @Override
        public void eat() {
            System.out.println("秋天吃玉米");
        }
    },
    WINTER("冬季","白雪皑皑"){
        @Override
        public void eat() {
            System.out.println("冬天烤地瓜");
        }
    };//这里分号不能省略

    //实例变量
    private final String name;
    private final String desc;

    //Getter()
    public String getName() { return name;}
    public String getDesc() { return desc;}

    //构造方法(私有的)，只能在本类中调用，并且不需要new，直接使用"枚举值(实参)"来调用
    Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
}

interface Eatable{
    void eat();
}
