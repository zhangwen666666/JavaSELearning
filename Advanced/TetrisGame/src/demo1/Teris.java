package demo1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 编写俄罗斯方块主类
 */
public class Teris extends JPanel {
    //声明正在下落的方块
    private Tetromino currentOne = Tetromino.randomOne();

    //声明将要下落的方块
    private Tetromino nextOne = Tetromino.randomOne();

    //声明游戏的主区域
    private Cell[][] wall = new Cell[18][9];

    //声明单元格的值为48像素
    private static final int CEIL_SIZE = 48;

    //载入方块图片
    public static BufferedImage I;
    public static BufferedImage J;
    public static BufferedImage L;
    public static BufferedImage O;
    public static BufferedImage S;
    public static BufferedImage T;
    public static BufferedImage Z;
    public static BufferedImage backImage;

    //指定其中图片的路径,加载图片
    static {
        try {
            I = ImageIO.read(new File("images/I.png"));
            J = ImageIO.read(new File("images/J.png"));
            L = ImageIO.read(new File("images/L.png"));
            O = ImageIO.read(new File("images/O.png"));
            S = ImageIO.read(new File("images/S.png"));
            T = ImageIO.read(new File("images/T.png"));
            Z = ImageIO.read(new File("images/Z.png"));
            backImage = ImageIO.read(new File("images/background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        //绘制游戏背景
        g.drawImage(backImage, 0, 0, null);
        //平移坐标轴
        g.translate(22, 15);
        //绘制游戏主区域
        paintWall(g);
        //绘制正在下落的四方格
        paintCurrentOne(g);
    }

    private void paintCurrentOne(Graphics g) {
        Cell[] cells = currentOne.cells;
        for (Cell cell : cells) {
            int x = cell.getCol();
            int y = cell.getRow();
            g.drawImage(cell.getImage(), x, y, null);
        }
    }

    private void paintWall(Graphics g) {
        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < wall[i].length; j++) {
                int x = j * CEIL_SIZE;
                int y = i * CEIL_SIZE;
                Cell cell = wall[i][j];
                //判断当前单元格是否有小方块，没有就绘制矩形框，有就将小方块嵌入墙中
                if (cell == null) {
                    g.drawRect(x, y, CEIL_SIZE, CEIL_SIZE);
                } else {
                    g.drawImage(cell.getImage(), x, y, null);
                }
            }
        }
    }


    public static void main(String[] args) {
        //创建窗口对象
        JFrame frame = new JFrame("俄罗斯方块");

        //创建游戏面板
        Teris panel = new Teris();
        //将面板添加到窗口中
        frame.add(panel);

        //设置可见
        frame.setVisible(true);
        //设置窗口尺寸
        frame.setSize(810, 940);
        //设置窗口居中
        frame.setLocationRelativeTo(null);
        //设置窗口关闭时程序终止
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
