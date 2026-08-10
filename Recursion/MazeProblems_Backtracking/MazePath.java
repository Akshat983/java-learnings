package JavaByKK.Recursion.MazeProblems_Backtracking;

public class MazePath {
    public static void main(String[] args) {
        paths(4, 4, "");
    }
    static void paths(int r, int c, String p) {
        if(r == 1) {
            while(c-- > 1) {
                p = p+"R";
            }
            System.out.println(p);
            return;
        }
        if(c == 1) {
            while(r-- > 1) {
                p = p+"D";
            }
            System.out.println(p);
            return;
        }
        paths(r-1, c, p + "D");
        paths(r, c-1, p + "R");
    }
}
