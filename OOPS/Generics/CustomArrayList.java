package JavaByKK.OOPS.Generics;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] ar;
    private int size = 0;

    CustomArrayList() {
        ar = new int[10];
    }

    void add(int num) {
        if(isFull()) {
            resize();
        }
        ar[size++] = num;
    }

    private boolean isFull() {
        return size == ar.length;
    }

    private void resize() {
        int[] temp = new int[2*size];
        for(int i = 0; i < size; i++) {
            temp[i] = ar[i];
        }
        ar = temp;
    }

    public int remove() {
        return ar[--size];
    }

    public int sizeOf() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void set(int idx, int value) {
        ar[idx] = value;
    }

    public int get(int i) {
        return ar[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(ar[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static void main() {
        CustomArrayList car = new CustomArrayList();
//        car.add(22);
//        car.add(56);
//        System.out.println(car.sizeOf());
//        System.out.println(car);
//        System.out.println(car.remove());
//        car.set(0, 32);
        System.out.println(car);
        for (int i = 0; i < 14; i++) {
            car.add(33);
        }
        System.out.println(car.sizeOf());
    }
}
