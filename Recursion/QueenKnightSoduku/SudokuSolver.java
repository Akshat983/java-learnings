package JavaByKK.Recursion.QueenKnightSoduku;

public class SudokuSolver {
    public static void main(String[] args) {
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
            System.out.println("Cannot solve");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyleft = true;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }
            }

            if(!emptyleft) {
                break;
            }}
            if(emptyleft) {
                return true;
            }

            for(int num = 1; num <= 9; num++) {
                if(isSafe(board, row, col, num)) {
                    board[row][col] = num;
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
    static void display(int[][] board) {
        for(int[] row : board) {
            for(int elem : row) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board, int row, int col, int num) {
        //check in row
        for(int i = 0; i < board.length; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }
        //check in column
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == num) {
                return false;
            }
        }
        //check in sq matrix of 3x3
        int sqrt = (int)(Math.sqrt(board.length));
        int rstart = row - row % sqrt;
        int cstart = col - col % sqrt;
        for(int r = rstart; r < rstart + sqrt; r++) {
            for(int c = cstart; c < cstart + sqrt; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
