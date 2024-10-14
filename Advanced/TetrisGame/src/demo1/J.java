package demo1;

public class J extends Tetromino {
    public J() {
        cells[0] = new Cell(0, 4, Teris.J);
        cells[1] = new Cell(0, 3, Teris.J);
        cells[2] = new Cell(0, 5, Teris.J);
        cells[3] = new Cell(1, 5, Teris.J);
    }
}
