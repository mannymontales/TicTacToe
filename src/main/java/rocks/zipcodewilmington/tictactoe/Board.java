package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        //[i][j]
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {

        /*
        //pass in X for check methods
        if (board[1][2] == 'X'){
            return true;
        }*/
        if ((checkColumn('X') == true) || (checkRow('X') == true) || (checkDiagonal('X') == true)){
            return true;
        }
        return false;
        //return null;
    }

    public Boolean isInFavorOfO() {
        if ((checkColumn('O') == true) || (checkRow('O') == true) || (checkDiagonal('O') == true)){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if ((isInFavorOfO() == false) && (isInFavorOfX() == false) ){
            return true;
        }
        return false;
    }

    public String getWinner() {
        String expectedWinner = "";
        if ((checkColumn('X') == true) || (checkRow('X') == true) || (checkDiagonal('X') == true)){
            expectedWinner = "X";
        } else if ((checkColumn('O') == true) || (checkRow('O') == true) || (checkDiagonal('O') == true)) {
            expectedWinner = "O";
        } else {
            expectedWinner = "";
        }
        return expectedWinner;


    }

    public boolean checkColumn(char XO){
        int columnLength = 2;
        //iterate through each column in the for loop and check each row and the specified column element
        for (int j = 0; j <= columnLength; j++ ){
                if ((board[0][j] == XO) && (board[1][j] == XO) && (board[2][j] == XO)) {
                    return true;

            }
        }
        return false;
    }

    public boolean checkRow(char XO){
        int rowLength = 2;
        //iterate through each row in the for loop and check each specified column element
        for (int i = 0; i <= rowLength; i++ ){
            if ((board[i][0] == XO) && (board[i][1] == XO) && (board[i][2] == XO)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonal(char XO){
        if ((board[0][0] == XO) && (board[1][1] == XO) && (board[2][2] == XO)){
            return true;
        }
        if ((board[0][2] == XO) && (board[1][1] == XO) && (board[2][0] == XO)){
            return true;
        }
        return false;
    }

}
