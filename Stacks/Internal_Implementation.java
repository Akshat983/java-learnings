package JavaByKK.Stacks;

import java.util.Stack;
public class Internal_Implementation {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(15);
        st.push(16);
        st.push(19);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
