class Solution {
    /**
     * The main method that kicks off the Sudoku solving process.
     * It calls a recursive helper function to solve the board.
     *
     * @param board The 9x9 Sudoku board.
     */
    public void solveSudoku(char[][] board) {
        // We only need to call our recursive solver once.
        // The recursion will handle iterating through all the empty cells.
        solve(board);
    }

    /**
     * A recursive helper function that uses backtracking to solve the Sudoku.
     *
     * @param board The Sudoku board.
     * @return true if a solution was found, false otherwise.
     */
    private boolean solve(char[][] board) {
        // Loop through every cell to find the first empty one.
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                // 1. Find an empty cell
                if (board[i][j] == '.') {
                    
                    // 2. Try placing numbers '1' through '9'
                    for (char num = '1'; num <= '9'; num++) {
                        
                        // 3. Check if the placement is valid
                        if (isValid(board, i, j, num)) {
                            
                            // If valid, place the number
                            board[i][j] = num;
                            
                            // Recursively call solve() to solve the rest of the puzzle.
                            // If the rest of the puzzle is solved, we are done.
                            if (solve(board)) {
                                return true; // Propagate success back up the call stack.
                            } else {
                                // 4. Backtrack: If the recursive call failed, it means this number
                                // led to a dead end. Undo the move and try the next number.
                                board[i][j] = '.';
                            }
                        }
                    }
                    
                    // If we tried all numbers '1'-'9' and none of them worked,
                    // it means the puzzle is unsolvable from this state. Return false.
                    return false;
                }
            }
        }
        
        // Base Case: If we loop through the entire board and find no empty cells,
        // it means the puzzle is completely filled and solved.
        return true;
    }

    /**
     * Checks if placing a character 'c' at a given (row, col) is valid.
     *
     * @param board The Sudoku board.
     * @param row   The row index.
     * @param col   The column index.
     * @param c     The character to check.
     * @return true if the move is valid, false otherwise.
     */
    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // Check if 'c' is already in the current row
            if (board[row][i] == c) {
                return false;
            }
            
            // Check if 'c' is already in the current column
            if (board[i][col] == c) {
                return false;
            }
            
            // Check if 'c' is already in the 3x3 sub-box
            // This logic maps the cell's (row, col) to its 3x3 box
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == c) {
                return false;
            }
        }
        return true;
    }
}
