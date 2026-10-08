package JavaByKK.File_Handling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffered_Reader {
    static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You Typed: " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
