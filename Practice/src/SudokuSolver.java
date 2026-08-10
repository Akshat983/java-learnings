package JavaByKK.Practice.src;

public class SudokuSolver {
    static void main() {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solve(board)) {
            display(board);
        }
        else {
            System.out.println("Can't solve");
        }
    }

    static boolean solve(int[][] board) {
        int row = -1;
        int col = -1;
        boolean hasleft = false;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    hasleft = true;
                    break;
                }
            }
            if(hasleft) {
                break;
            }
        }
        if(!hasleft) {
            return true;
        }
        for(int i = 1; i <= 9; i++) {
            if(isSafe(row, col, board, i)) {
                board[row][col] = i;
                if(solve(board)) {
                    return true;
                }
                else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int r, int c, int[][] board, int num) {
        //check in row and column
        for(int i = 0; i < 9; i++) {
            if(board[i][c] == num) {
                return false;
            }
            if(board[r][i] == num) {
                return false;
            }
        }
        //check in matrix
        int rstart = 3*((int)r/3);
        int cstart = 3*((int)c/3);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[rstart+i][cstart+j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
