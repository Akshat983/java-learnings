package JavaByKK;

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int ar[]=new int[]{-12,345,2,6,7896};
        int c=0;
        for(int i : ar)
        {
            if(evenDigits(i))
                c++;
        }
        System.out.println(c);
    }
    static boolean evenDigits(int n)
    {
        if(n<0)
            n=-n;
        int c= (int)Math.log10(n)+1;  // c -> number of digits

        return (c%2==0);
    }
}
