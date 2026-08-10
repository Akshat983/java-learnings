package JavaByKK.Recursion.QueenKnightSoduku;


public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count+=queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {

        for (int i = 0; i < r; i++) {
            if(board[i][c])
                return false;
        }

        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[r-i][c-i]) {
                return false;
            }
        }

        int maxRight = Math.min(r, board.length-c-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[r-i][c+i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]) {
                    System.out.print("Q ");
                }
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
