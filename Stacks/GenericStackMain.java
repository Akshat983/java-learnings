package JavaByKK.Stacks;

public class GenericStackMain {
    static void main() throws StackException {
        CustomGenericStack st = new CustomGenericStack<>();
        st.push("aefg");
        st.push(34);
        st.push(3333.34);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
    }
}
