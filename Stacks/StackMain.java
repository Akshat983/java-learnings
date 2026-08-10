package JavaByKK.Stacks;

public class StackMain {
    static void main() throws StackException {
//        CustomStack st = new CustomStack();
//        st.push(12);
//        st.push(15);
//        st.push(16);
//        st.push(19);
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());

        CustomDynamicStack st = new CustomDynamicStack(2);
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
