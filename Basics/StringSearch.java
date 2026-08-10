package JavaByKK;
import java.util.*;
public class StringSearch {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(search(in.nextLine(),in.next().charAt(0)));
    }

    static int search(String st, char target) {
        for(int i = 0; i< st.length(); i++)
        {
            if(st.charAt(i) == target)
                return i;
        }
        return -1;
    }
}
