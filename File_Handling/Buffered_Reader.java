package JavaByKK.File_Handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader {
    static void main(String[] args) {

        //INPUT FROM KEYBOARD
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("You Typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //INPUT FROM FILE
        try (BufferedReader br = new BufferedReader(new FileReader("JavaByKK/File_Handling/note.txt"))){
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
