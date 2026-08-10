package JavaByKK.Recursion.MazeProblems_Backtracking;

import java.util.Arrays;

public class AllPathsPrintMatrix {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allPathsPrint(0, 0, maze, "", 1, path);
    }

    static void allPathsPrint(int r, int c, boolean[][] maze, String p, int step, int[][] path) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            path[r][c] = step;
            for (int i = 0; i < maze.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println();
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r < maze.length - 1) {
            maze[r][c] = false;
            path[r][c] = step;
            allPathsPrint(r+1, c, maze, p+"D", step+1, path);
        }
        if(c < maze[0].length-1) {
            maze[r][c] = false;
            path[r][c] = step;
            allPathsPrint(r, c+1, maze, p+"R", step+1, path);
        }
        if(r>0) {
            maze[r][c] = false;
            path[r][c] = step;
            allPathsPrint(r-1, c, maze, p+"U", step+1, path);
        }
        if(c>0) {
            maze[r][c] = false;
            path[r][c] = step;
            allPathsPrint(r, c-1, maze, p+"L", step+1, path);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
