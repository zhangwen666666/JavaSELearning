package com.java.lambda;

public interface SetValue<T, E> {
    void setValue(T o, E value1, E value2, E value3);
}

class Test {
    public static void main(String[] args) {
        //使用匿名内部类
        SetValue<A, String> setValue = new SetValue<A, String>() {
            @Override
            public void setValue(A o, String value1, String value2, String value3) {
                o.setValue(value1, value2, value3);
            }
        };
        A a1 = new A();
        setValue.setValue(a1, "abc", "def", "ghj");
        System.out.println(a1);

        //使用精简的Lambda表达式
        SetValue<A, String> setValue1 = (o, value1, value2, value3) ->
                o.setValue(value1, value2, value3);
        setValue1.setValue(a1, "qwer", "qwgdf", "hgello");
        System.out.println(a1);

        //使用方法引用
        SetValue<A, String> setValue2 = A::setValue;
        setValue2.setValue(a1,"hello","world","zhangsan");
        System.out.println(a1);

        SetValue<A,Integer> setValue3 = A::setInt;
        setValue3.setValue(a1,10,20,30);
    }
}

class A {
    private String value1;
    private String value2;
    private String value3;

    private int int1;
    private int int2;
    private int int3;

    public void setValue(String value1, String value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void setInt(int int1,int int2,int int3){
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
    }

    @Override
    public String toString() {
        return "A{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                '}';
    }
}