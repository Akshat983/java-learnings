package JavaByKK.Recursion.MazeProblems_Backtracking;

public class AllPaths_Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPaths(0, 0, maze, "");
    }
    static void allPaths(int r, int c, boolean[][] maze, String p) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r < maze.length - 1) {
            maze[r][c] = false;
            allPaths(r+1, c, maze, p+"D");
        }
        if(c < maze[0].length-1) {
            maze[r][c] = false;
            allPaths(r, c+1, maze, p+"R");
        }
        if(r>0) {
            maze[r][c] = false;
            allPaths(r-1, c, maze, p+"U");
        }
        if(c>0) {
            maze[r][c] = false;
            allPaths(r, c-1, maze, p+"L");
        }
        maze[r][c] = true;
    }
}
