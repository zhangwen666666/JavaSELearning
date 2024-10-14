package demo1;

public class O extends Tetromino{
    public O() {
        cells[0] = new Cell(0,4,Teris.O);
        cells[1] = new Cell(0,5,Teris.O);
        cells[2] = new Cell(1,4,Teris.O);
        cells[3] = new Cell(1,5,Teris.O);
    }
}
