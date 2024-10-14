package demo1;

public class L extends Tetromino {
    public L() {
        cells[0] = new Cell(0, 4, Teris.L);
        cells[1] = new Cell(0, 3, Teris.L);
        cells[2] = new Cell(0, 5, Teris.L);
        cells[3] = new Cell(1, 3, Teris.L);
    }
}
