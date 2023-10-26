class Solution {
    private static final int MATRIX_SIZE = 9;
    public void solveSudoku(char[][] board) {
        solvedBoard(board);
    }
    
    // helper methods to see if the row, column or 3x3 square is a match
    // if it already exits, then it can't be inserted
    
    private static boolean numberInRow(char[][] board, char c, int row){
        // iterate over the row
        for(int i = 0; i < MATRIX_SIZE; i++){
            // if the character at i in the row is within, return true
            if(board[row][i] == c){
                return true;
            }
        } // other wise return false as it was not int the row
        return false;
    }
    
     private static boolean numberInColumn(char[][] board, char c, int column){
        // iterate over the row
        for(int i = 0; i < MATRIX_SIZE; i++){
            // if the character at i in the column is within, return true
            if(board[i][column] == c){
                return true;
            }
        } // other wise return false as it was not int the row
        return false;
    }
    
    private static boolean numberInBox(char[][] board, char c, int row, int column){
        // find the box to look over by getting the remainder of the row by 3 as it's 3x3 box and substracing that from the row
       int localBoxRow = row - row % 3;
        // apply the samed logic but for the column
        int localBoxColumn = column - column % 3;
        
        // nested for loop using these variables
        for(int i = localBoxRow; i < localBoxRow + 3; i++){
            for(int j = localBoxColumn; j < localBoxColumn + 3; j++){
                // now use i and j to check if these match the character within the box
                if(board[i][j] == c){
                    return true;
                }
            }
        } // if never found, return false
        return false;
    }
    
    // use one method to combine all these helper methods
    private static boolean isValidPlacement(char[][] board, char c, int row, int column){
        // if all the helper methods are false, then it is a valid placement
        return !numberInRow(board, c, row) &&
            !numberInColumn(board, c, column) &&
            !numberInBox(board, c, row, column);
    }
    
    // method to solve
    private static boolean solvedBoard(char[][] board){
        for(int row = 0; row < MATRIX_SIZE; row++){
            for(int column = 0; column < MATRIX_SIZE; column++){
                if(board[row][column] == '.'){
                    for(char numberToTry = '1'; numberToTry <= '9'; numberToTry++){
                        if(isValidPlacement(board, numberToTry, row, column)){
                            board[row][column] = numberToTry;
                            
                            // recursive call to solvedBoard that if is true, returns true
                            if(solvedBoard(board)){
                                return true;
                            } else { // if not true, then back track and clear out the placement
                                board[row][column] = '.';
                            }
                        }
                    }
                    // unable to solve board
                    return false;
                }
            }
        }
        // after going through all the for loops and recursive calls, return true
        return true;
    }
}