package JavaByKK.HandleLargeStrings;

public class StringBuffer {
    static void main(String[] args) {

        //Constructor 1
        java.lang.StringBuffer sb = new java.lang.StringBuffer();
        System.out.println(sb.capacity());

        //Constructor 2
        java.lang.StringBuffer sb2 = new java.lang.StringBuffer("Akshat Agarwal");

        //Constructor 3
        java.lang.StringBuffer sb3 = new java.lang.StringBuffer(35);

        sb.append("I am a nice guy");
        String s = sb.toString();

        sb.replace(0, 4, "Akshat is");

        sb.delete(12, 17);

        sb.reverse();

        System.out.println(sb);
    }
}
