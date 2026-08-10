package JavaByKK.Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // it will change the old object. Thus, it will make a string mutable and will take less space and time
        for (int i = 0; i < 26; i++) {
            builder.append((char)('A'+i)); // .append()
        }
        StringBuilder builder2 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
//        System.out.println(builder);              // ABCDEFGHIJKLMNOPQRSTUVWXYZ
//        String st = builder.toString();           // .toString()
//        System.out.println(builder.reverse());    // .reverse() : ZYXWVUTSRQPONMLKJIHGFEDCBA
//        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
//        builder.append(ch, 3, 5);                 // it will append 5 characters from index 3
//        System.out.println(builder);
//        System.out.println(builder.compareTo(builder2)); // -32
//        builder.delete(3, 26);                     // it will delete characters from index 3 till index 25
//        builder.insert(4, ch, 3, 5); // ABCDdefghEFGHIJKLMNOPQRSTUVWXYZ  // similarly we can insert int, string, long, array, etc.
//        System.out.println(builder.indexOf("BCDE", 7)); // -1 (7 is from where the indexing starts to search
//        System.out.println(builder.length()); // 26
//        System.out.println(builder.lastIndexOf("CDE", 18)); // 2
//        System.out.println(builder.isEmpty()); // false
//        builder.replace(3, 10, "akshat"); // ABCakshatKLMNOPQRSTUVWXYZ
    }
}
