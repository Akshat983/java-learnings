package JavaByKK.Practice.src;


public class NKnights {
    static void main() {
        boolean[][] board = new boolean[3][3];
        knights(0, 0, board, 4);
    }
    static void knights(int r, int c, boolean[][] board, int knight) {
        if(knight == 0) {
            display(board);
            System.out.println();
            return;
        }

        if(r == board.length-1 && c == board[0].length) {
            return;
        }

        if(c == board[0].length) {
            knights(r + 1, 0, board, knight);
            return;
        }

        if(isSafe(board, r, c)) {
            board[r][c] = true;
            knights(r, c + 1, board, knight-1);
            board[r][c] = false;
        }
        knights(r, c+1, board, knight);
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        if(isValid(board, r-2, c-1)) {
            if(board[r-2][c-1]) {
                return false;
            }
        }
        if(isValid(board, r-2, c+1)) {
            if(board[r-2][c+1]) {
                return false;
            }
        }
        if(isValid(board, r-1, c-2)) {
            if(board[r-1][c-2]) {
                return false;
            }
        }
        if(isValid(board, r-1, c+2)) {
            if(board[r-1][c+2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int r, int c) {
        return (r>=0 && r<board.length && c>=0 && c<board[0].length);
    }

    static void display(boolean[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == true) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
