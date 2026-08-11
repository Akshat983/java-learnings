package JavaByKK.BinaryTree;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        Binarytree bt = new Binarytree();
        bt.populate(in);

        bt.display();
    }
}
