package com.exception;

public class MyStack {
    private Object[] elements;
    private int index;

    //构造方法
    public MyStack() {
        this.elements = new Object[5];
        this.index = -1;
    }  //默认初始容量为5

    public MyStack(Object[] elements) {
        this.elements = elements;
        this.index = this.elements.length - 1;
    }

    //setter and getter
    public void setElements(Object[] elements) {
        this.elements = elements;
        this.index = this.elements.length - 1;
    }

    public void push(Object elem) throws StackOperationException{
        if (index == elements.length - 1) {
            throw new StackOperationException("栈已满，压栈失败");

            // System.out.println("栈已满，压栈失败");
            // return;
        }
        elements[++index] = elem;
    }

    public Object pop() throws StackOperationException {
        if (index == -1) {
            throw new StackOperationException("栈已空，弹栈失败");
            // System.out.println("栈已空，弹栈失败");
            // return null;
        }
        index--;
        return elements[index + 1];
    }

    public void printArray() {
        if (index == -1)
            System.out.print("栈为空");
        for (int i = 0; i <= index; i++) {
            System.out.print(elements[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] strs = {"张三", "李四", "王五", "赵六"};
        MyStack s = new MyStack(strs);
        s.printArray();

        try {
            String str = (String) s.pop();
            System.out.println(str);
            s.printArray();

            str = (String) s.pop();
            System.out.println(str);
            s.printArray();

            str = (String) s.pop();
            System.out.println(str);
            s.printArray();

            str = (String) s.pop();
            System.out.println(str);
            s.printArray();

            str = (String) s.pop();
            System.out.println(str);
            s.printArray();
        } catch (StackOperationException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            s.push("李白");
            s.printArray();

            s.push("韩信");
            s.printArray();

            s.push("露娜");
            s.printArray();

            s.push("赵云");
            s.printArray();

            s.push("百里守约");
            s.printArray();
        }catch(StackOperationException e){
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------------------------------");

       /* MyStack s1 = new MyStack();
        s1.printArray();
        str = (String) s1.pop();
        System.out.println(str);
        s1.printArray();

        s1.push("李白");
        s1.printArray();

        s1.push("韩信");
        s1.printArray();

        s1.push("露娜");
        s1.printArray();

        s1.push("赵云");
        s1.printArray();

        s1.push("百里守约");
        s1.printArray();

        s1.push("百里玄策");
        s1.printArray();

        s1.setElements(new Object[]{"hello", "world"});
        s1.printArray();
        s1.push("abc");
        s1.pop();
        s1.printArray();
        s1.pop();
        s1.printArray();
        s1.pop();
        s1.printArray();*/
    }
}
