package JavaByKK.Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Akshat Agarwal is good";
        System.out.println(Arrays.toString(name.toCharArray())); // .toCharArray() : converts String to array of its individual characters
        System.out.println(Arrays.toString(name.split(" "))); // .split(" ") : will split string to array with elements separated with space
    }
}
