package JavaByKK.Recursion.MazeProblems_Backtracking;

public class MazeWithRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, false, true},
                {true, true, true},
                {true, true, true}
        };
        pathWithRestrictions(0, 0, maze, "");
    }
    static void pathWithRestrictions(int r, int c, boolean[][] maze, String p) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r < maze.length - 1) {
            pathWithRestrictions(r+1, c, maze, p+"D");
        }
        if(c < maze[0].length-1) {
            pathWithRestrictions(r, c+1, maze, p+"R");
        }
    }
}
