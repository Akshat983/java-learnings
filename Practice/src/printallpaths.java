import java.util.Arrays;

public class printallpaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] paths = new int[3][3];
        printpaths(0, 0, "", maze, paths, 1);
    }
    static void printpaths(int r, int c, String p, boolean[][] maze, int[][] path, int steps) {
        if(r == 2 && c == 2) {
            path[r][c] = steps;
            for (int i = 0; i < 3; i++) {
                System.out.println(Arrays.toString(path[r]));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r < 2) {
            path[r][c] = steps;
            maze[r][c] = false;
            printpaths(r+1, c, p + "D", maze, path, steps+1);

        }
        if(c < 2) {
            path[r][c] = steps;
            maze[r][c] = false;
            printpaths(r, c+1, p + "R", maze, path, steps+1);

        }
        if(r > 0) {
            path[r][c] = steps;
            maze[r][c] = false;
            printpaths(r-1, c, p + "U", maze, path, steps+1);

        }
        if(c > 0) {
            path[r][c] = steps;
            maze[r][c] = false;
            printpaths(r, c-1, p + "L", maze, path, steps+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
