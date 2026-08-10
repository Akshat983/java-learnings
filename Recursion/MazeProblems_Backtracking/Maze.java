package JavaByKK.Recursion.MazeProblems_Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countTotalPath(4, 4));
    }
    static int countTotalPath(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }
        int right = countTotalPath(row, col - 1);
        int down = countTotalPath(row - 1, col);
        return right + down;
    }
}