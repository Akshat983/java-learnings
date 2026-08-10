package JavaByKK.Practice.src;

public class QueensPossibility8x8 {
    static void main() {
        boolean[][] board = new boolean[8][8];
        System.out.println(queens(board, 0, 0));
    }
    static int queens(boolean[][] board, int row, int col) {
        if(row == 8) {
            return 1;
        }
        int count = 0;
        for(int i = 0; i < 8; i++) {
            if(isSafe(board, row, i)) {
                board[row][i] = true;
                count+=queens(board, row+1, col);
                board[row][i] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        for(int i = 0; i < board.length; i++) {
            if(board[i][c] || board[r][i]) {
                return false;
            }
        }
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i + j == r + c) {
                    if (board[i][j]) {
                        return false;
                    }
                }
                if (i - j == r - c) {
                    if (board[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
