package demo1;

public class I extends Tetromino{
    public I() {
        cells[0] = new Cell(0,4,Teris.T);
        cells[1] = new Cell(0,3,Teris.T);
        cells[2] = new Cell(0,5,Teris.T);
        cells[3] = new Cell(0,6,Teris.T);
    }
}
