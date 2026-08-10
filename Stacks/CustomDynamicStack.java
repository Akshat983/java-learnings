package JavaByKK.Stacks;

public class CustomDynamicStack extends CustomStack{

    public CustomDynamicStack(int size) {
        super(size);
    }

    public CustomDynamicStack() {
        super();
    }

    @Override
    public boolean push(int item) {
        if(isFull()) {
            int[] ar = new int[2 * st.length];

            //Copy data
            for(int i = 0; i < st.length; i++) {
                ar[i] = st[i];
            }
            st = ar;
        }
        return super.push(item);
    }
}
