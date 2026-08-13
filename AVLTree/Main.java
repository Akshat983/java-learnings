package JavaByKK.AVLTree;

public class Main {
    static void main() {
        AVL avl = new AVL();

        for (int i = 0; i < 1000; i++) {
            avl.insert(i);
        }

        System.out.println(avl.height());
    }
}
