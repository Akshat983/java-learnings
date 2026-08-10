package JavaByKK.OOPS.Generics;
//  <T> here we can put anything in <> then that variable is known as generic and user needs to define which data type he wants to use
public class CustomGenericArrayList<T> {
    private Object[] ar;
    private int size = 0;

    CustomGenericArrayList() {
        ar = new Object[10];
    }

    void add(T num) {
        if(isFull()) {
            resize();
        }
        ar[size++] = num;
    }

    private boolean isFull() {
        return size == ar.length;
    }

    private void resize() {
        Object[] temp = new Object[2*size];
        for(int i = 0; i < size; i++) {
            temp[i] = ar[i];
        }
        ar = temp;
    }

    public T remove() {
        return (T)ar[--size];
    }

    public int sizeOf() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void set(int idx, T value) {
        ar[idx] = value;
    }

    public T get(int i) {
        return (T)ar[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append((T)ar[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static void main() {
        CustomGenericArrayList<Integer> car = new CustomGenericArrayList<>();
        System.out.println(car);
        for (int i = 0; i < 14; i++) {
            car.add(2*i);
        }
        System.out.println(car.sizeOf());
        System.out.println(car.get(10));
        System.out.println(car);

//      Here we aren't mentioning any data type so we can input any data type (OBJECT)
        CustomGenericArrayList car2 = new CustomGenericArrayList();
        car2.add(23);
        car2.add("dwsfda");
        System.out.println(car2);
    }
}
