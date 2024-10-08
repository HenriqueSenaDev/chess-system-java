package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(pieces.length - i + " ");

            for (int j = 0; j < pieces[i].length; j++) {
                printPiece(pieces[i][j]);
            }

            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < pieces[0].length; i++) {
            int charAscii =  97 + i;
            char letter = (char) charAscii;
            System.out.print(letter + " ");
        }
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }

        System.out.print(" ");
    }
}
