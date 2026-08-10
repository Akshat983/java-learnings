class MazeWithDiagonal {
    static void main() {
        paths(3, 3, "");
    }
    static void paths(int r, int c, String p) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r == 1) {
            while(c-- > 1){
                p += "R";
            }
            System.out.println(p);
            return;
        }
        if(c == 1) {
            while(r-- > 1){
                p += "D";
            }
            System.out.println(p);
            return;
        }
        paths(r-1, c-1, p+"Dia");
        paths(r, c-1, p + "R");
        paths(r-1, c, p + "D");
    }
}