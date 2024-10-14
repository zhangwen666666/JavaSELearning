package demo1;

/**
 * 俄罗斯方块的七种图形的共同特征：都由四个小方格组成、都可以进行左移，右移，下落，变形
 * 属性：Cell数组用于创建四个小方块
 * 方法：moveLeft(),moveRight(),softDrop()
 */
public class Tetromino {
    protected Cell[] cells = new Cell[4];

    //编写左移方法
    public void moveLeft() {
        for (Cell cell : cells) {
            cell.left();
        }
    }

    //编写右移
    public void moveRight() {
        for (Cell cell : cells) {
            cell.right();
        }
    }

    //编写下落
    public void softDrop() {
        for (Cell cell : cells) {
            cell.drop();
        }
    }

    //编写随机生成四方格的方法
    public static Tetromino randomOne() {
        int num = (int) (Math.random() * 7);
        Tetromino tetromino = null;
        switch (num) {
            case 0 -> tetromino = new I();
            case 1 -> tetromino = new J();
            case 2 -> tetromino = new L();
            case 3 -> tetromino = new O();
            case 4 -> tetromino = new S();
            case 5 -> tetromino = new T();
            case 6 -> tetromino = new Z();
        }
        return tetromino;
    }
}
