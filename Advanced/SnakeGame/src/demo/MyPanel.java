package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MyPanel extends JPanel implements KeyListener, ActionListener {
    //声明右侧蛇头和身体图片
    ImageIcon right = new ImageIcon("images/right.png");
    ImageIcon body = new ImageIcon("images/body.png");

    //声明上，下，左侧蛇头
    ImageIcon top = new ImageIcon("images/top.png");
    ImageIcon bottom = new ImageIcon("images/bottom.png");
    ImageIcon left = new ImageIcon("images/left.png");

    //定义蛇的数据结构
    int len = 3;    //蛇的初始长度
    int[] snakeX = new int[28 * 36];  //x坐标
    int[] snakeY = new int[28 * 36];  //y坐标

    //声明一个枚举变量，来表示蛇头方向
    Direction direction = Direction.RIGHT;

    //声明一个变量来标记游戏是否开始，当值为true时表示开始游戏
    boolean isStart = false;

    //声明一个变量用来表示蛇是否还活着
    boolean isLive = true;

    //创建定时器对象
    Timer timer = new Timer(200, this);

    //声明食物
    int foodX;
    int foodY;
    Random random = new Random();
    //声明食物图片
    ImageIcon food = new ImageIcon("images/food.png");

    //无参构造
    public MyPanel() {
        //初始蛇头的位置
        snakeX[0] = 100;
        snakeY[0] = 100;

        //初始两个身体的位置
        snakeX[1] = 75;
        snakeY[1] = 100;
        snakeX[2] = 50;
        snakeY[2] = 100;

        //获取键盘事件
        this.setFocusable(true);

        //添加监听
        this.addKeyListener(this);

        //启动定时器
        timer.start();

        //生成食物的坐标
        foodX = 25 * random.nextInt(28);
        foodY = 25 * random.nextInt(36);
    }

    //重写画组件的方法
    @Override
    protected void paintComponent(Graphics g) {
        //调用父类方法做一些基本工作
        super.paintComponent(g);
        //设置背景颜色
        this.setBackground(Color.CYAN);
        //在画布上添加游戏区域
        g.fillRect(0, 0, 700, 900);

        //添加右侧蛇头和两个身体
        /* right.paintIcon(this,g,100,100);
        body.paintIcon(this,g,75,100);
        body.paintIcon(this,g,50,100);*/

        //添加右侧蛇头
        //right.paintIcon(this, g, 100, 100);

        //格局枚举值来添加蛇头
        switch (direction) {
            case TOP -> top.paintIcon(this, g, snakeX[0], snakeY[0]);
            case LEFT -> left.paintIcon(this, g, snakeX[0], snakeY[0]);
            case RIGHT -> right.paintIcon(this, g, snakeX[0], snakeY[0]);
            case BOTTOM -> bottom.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

        //添加身体
        for (int i = 1; i < len; i++) {
            body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        //判断当前标记游戏的变量isStart是否为false
        //false是提示信息
        if (!isStart && isLive) {
            //放上开始提示，并设置字体和颜色
            g.setColor(Color.RED);
            g.setFont(new Font("宋体", Font.BOLD, 50));
            g.drawString("请按空格键开始游戏！", 70, 500);
        }

        //如果蛇死了
        if (!isLive) {
            //提示游戏失败
            g.setColor(Color.RED);
            g.setFont(new Font("宋体", Font.BOLD, 50));
            g.drawString("游戏失败", 70, 500);
        }

        //添加食物
        food.paintIcon(this, g, foodX, foodY);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //按下键盘
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //判断。按空格键时数字值为32
        if (keyCode == 32) {
            //标记游戏状态的值取反
            isStart = !isStart;
            //重新画组件
            repaint();
        } else if (keyCode == KeyEvent.VK_UP) {
            direction = Direction.TOP;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            direction = Direction.BOTTOM;
        } else if (keyCode == KeyEvent.VK_LEFT) {
            direction = Direction.LEFT;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            direction = Direction.RIGHT;
        }
    }

    @Override
    //按键弹起
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //游戏开始才移动蛇
        if (isStart && isLive) {
            //移动蛇的身体
            for (int i = len - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }

            //移动蛇头
            switch (direction) {
                case TOP -> {
                    snakeY[0] -= 25;
                    if (snakeY[0] < 0)
                        snakeY[0] = 25 * 36;
                }
                case BOTTOM -> snakeY[0] = (snakeY[0] + 25) % 900;
                case LEFT -> {
                    snakeX[0] -= 25;
                    if (snakeX[0] < 0)
                        snakeX[0] = 25 * 36;
                }
                case RIGHT -> snakeX[0] = (snakeX[0] + 25) % 700;
            }

            //检查蛇是否还活着
            for (int i = 1; i < len; i++) {
                if (snakeX[i] == snakeX[0] && snakeY[i] == snakeY[0]) {
                    isLive = false;
                    break;
                }
            }

            //当蛇头与食物重复时，表示吃掉食物
            if (snakeY[0] == foodY && snakeX[0] == foodX) {
                //蛇的长度加1
                len++;

                //蛇尾坐标
                snakeY[len - 1] = snakeY[len - 2];
                snakeX[len - 1] = snakeX[len - 2];

                //生成新的食物
                foodX = 25 * random.nextInt(28);
                foodY = 25 * random.nextInt(36);
            }

            //重新画组件
            repaint();
            //重新启动定时器
            timer.start();
        }
    }
}
