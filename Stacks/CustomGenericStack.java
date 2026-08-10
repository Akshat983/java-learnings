package JavaByKK.Stacks;

public class CustomGenericStack <T> {
    private Object[] stack;
    private int size = -1;

    public CustomGenericStack() {
        this.stack = new Object[10];
    }

    public void push (T item) {
        if(isFull()) {
            resize();
        }
        stack[++size] = item;
    }

    private boolean isFull () {
        return size == stack.length - 1;
    }

    private void resize () {
        Object[] temp = new Object[stack.length * 2];

        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }

        stack = temp;
    }

    public T pop () throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty!");
        }

        T t = (T) stack[size--];
        return t;
    }

    public T peek () throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty!");
        }

        return (T) stack[size];
    }

    public boolean isEmpty() {
        return size == -1;
    }
}
