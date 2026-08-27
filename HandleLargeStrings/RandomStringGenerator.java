package JavaByKK.HandleLargeStrings;

import java.util.Random;

public class RandomStringGenerator {
    static String generate(int size) {
        Random r = new Random();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < size; i++) {
            sb.append((char) (r.nextInt(26) + 97));
        }

        return sb.toString();
    }
}