package JavaByKK.Stacks;

import java.util.Stack;

public class CustomStack {
    protected int[] st;
    private static int DEFAULT_SIZE = 10;
    private int ptr = -1;

    CustomStack(int size) {
        this.st = new int[size];
    }

    CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push (int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        st[ptr] = item;
        return true;
    }

    public int pop () throws StackException {
        if(isEmpty()) {
            throw new StackException("Can't pop from an empty stack!!");
        }
        return st[ptr--];
    }

    public int peek () throws StackException {
        if(isEmpty()) {
            throw new StackException("Can't pop from an empty stack!!");
        }

        return st[ptr];
    }

    public boolean isFull () {
        return ptr == st.length - 1;
    }

    public boolean isEmpty () {
        return ptr == -1;
    }
}
