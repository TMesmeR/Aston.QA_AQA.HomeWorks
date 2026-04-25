package Exceptions;

public class MyArrayDataException extends Exception {

    private int row;
    private int col;

    public MyArrayDataException(String message, int row, int col) {
        super(message + " в ячейке [" + row + "][" + col + "]");
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
