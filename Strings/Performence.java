package JavaByKK.Strings;

public class Performence {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            series += (char)('A' + i); // for each time it will create a new object, thus will take much space and time. Therefore, we need to study "String Builder"
        }
        System.out.println(series);
    }
}
