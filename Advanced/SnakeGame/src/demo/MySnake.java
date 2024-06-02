package demo;

import javax.swing.*;

public class MySnake {

    public static void main(String[] args) {
        //创建一个窗口
        JFrame fream = new JFrame();
        //指定窗口的x和y的位置以及窗口的昆都和高度值
        fream.setBounds(600,100,700,900);
        //是否允许拖拽，这里不允许拖拽来改变大小
        fream.setResizable(false);
        //当点击窗口关闭按钮，执行退出操作
        fream.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //添加画布
        fream.add(new MyPanel());

        //显示出来
        fream.setVisible(true);
    }
}
