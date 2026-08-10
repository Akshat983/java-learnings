package JavaByKK.Recursion.MazeProblems_Backtracking;

import java.util.ArrayList;

public class MazePathUsingLists {
    public static void main(String[] args) {
        System.out.println(maze(3, 3, ""));
    }
    static ArrayList<String> maze(int r, int c, String p) {
        if(r == 1) {
            while(c-- > 1) {
                p = p+"R";
            }
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(c == 1) {
            while(r-- > 1) {
                p = p+"D";
            }
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        list.addAll(maze(r-1, c, p+"D"));
        list.addAll(maze(r, c-1, p+"R"));
        return list;
    }
}
