package JavaByKK.Strings;

public class Basics {
    public static void main(String[] args) {

//        // Note : Arrays are mutable, therefore any change made to ar1 will reflect in ar2
//        int[] ar1 = {1, 2, 3, 4, 5};
//        int[] ar2 = ar1;
//        ar1[2] = 33;
//        System.out.println(Arrays.toString(ar1)); //{1, 2, 33, 4, 5}
//        System.out.println(Arrays.toString(ar2)); //{1, 2, 33, 4, 5}
//
//        // Note : Strings are immutable, therefore any change made to s1 will not reflect in s2
//        String s1 = "Akshat";
//        String s2 = s1;
//        s1 = "Agarwal";
//        System.out.println(s1); // Agarwal
//        System.out.println(s2); // Akshat

         // heap memory allocation (use of new String())
//        String s1 = "Akshat";
//        String s2 = "Akshat";
//        System.out.println(s1 == s2); // true, s1 and s2 have same object s1 and s2 made in String pool in heap memory
//        // Creating different objects of same value
//        s2 = new String("Akshat");
//        System.out.println(s1 == s2); // false
//        System.out.println(s1.equals(s2)); // true, only checks equality

//        // Pretty printing
//        System.out.printf("value of pi is %.3f and it is %s", Math.PI, "irrational");
//        // %.3f will give the rounded off number till 3 digits

//        System.out.println('a' + 'b');        // 195
//        System.out.println("a" + "b");        // ab
//        System.out.println('a' + 3);          // 100
//        System.out.println((char)('a' + 3));  // d
//        System.out.println("a" + 3);          // a3

//        System.out.println("abc" + new ArrayList<>());                    // abc[]
//        System.out.println("abc" + new Integer(56));                      // abc56
//        System.out.println(new ArrayList<>() + new Integer(56));          // Error
//        System.out.println(new ArrayList<>() + "" + new Integer(56));     // []56
//        //Note : '+' operator can add primitive values as well as strings but for addition of complex
//                    data types at least one string is needed in between to convert all into string

    }
}
