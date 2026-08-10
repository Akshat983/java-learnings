package JavaByKK.Practice.src;

public class NQueens {
    static void main() {
        boolean[][] board = new boolean[4][4];
        queen(0, 0, board, 3);
    }
    static void queen(int r, int c, boolean[][] board, int queens) {
        if(queens == 0) {
            display(board);
            System.out.println();
            return;
        }
       if(r == board.length) {
           return;
       }
       if(c == board[0].length) {
           queen(r+1, 0, board, queens);
           return;
       }
       if(isSafe(r, c, board)) {
           board[r][c] = true;
           queen(r+1, 0, board, queens-1);
           board[r][c] = false;
       }
       queen(r, c+1, board, queens);
    }

    static boolean isSafe(int r, int c, boolean[][] board) {
        for(int i = 0; i < board.length; i++) {
            if(board[i][c] || board[r][i]) {
                return false;
            }
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(i+j == r+c) {
                    if(board[i][j]) {
                        return false;
                    }
                }
                if(i-j == r-c) {
                    if(board[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                if(board[r][c]) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
