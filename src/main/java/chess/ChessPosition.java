package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }

        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        int row = 8 - this.getRow();
        int column = this.getColumn() - 'a';

        return new Position(row, column);
    }

    protected static ChessPosition fromPosition(Position position) {
        int chessRow = 8 - position.getRow();
        char chessColumn = (char) (position.getColumn() + (int) 'a');

        return new ChessPosition(chessColumn, chessRow);
    }

    @Override
    public String toString() {
        return "" + this.getColumn() + this.getRow();
    }
}
