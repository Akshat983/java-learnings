package JavaByKK.OOPS.Generics;
//  <T extends Number> => tells us that we can only take numbers or its subclasses(int, float, double, long, etc) only and we cant pass string char or other similar things
public class WildCardExample<T extends Number> {
    private Object[] ar;
    private int size = 0;

    WildCardExample() {
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
        WildCardExample<Integer> car = new WildCardExample<>();
        System.out.println(car);
        for (int i = 0; i < 14; i++) {
            car.add(2*i);
        }
        System.out.println(car.sizeOf());
        System.out.println(car.get(10));
        System.out.println(car);
    }
}
