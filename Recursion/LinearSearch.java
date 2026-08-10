package JavaByKK.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar = {3, 1, 7, 2, 2, 8, 9};
        int key = 2;
        System.out.println(search(ar, key, 0));
        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.println(allIndexes(ar, key, 0, list));
    }
    static boolean search(int[] ar, int key, int i) {
        if(i == ar.length) {
            return false;
        }
        if(ar[i] == key) {
            return true;
        }
        return search(ar, key, i+1);
    }

    static ArrayList<Integer> allIndexes(int[] ar, int key, int i, ArrayList<Integer> list) {
        if(i == ar.length-1) {
            return list;
        }
        if(ar[i] == key) {
            list.add(i);
        }
        return allIndexes(ar, key, i+1, list);
    }
}
