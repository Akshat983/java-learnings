package JavaByKK.File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Buffered_Writer {
    static void main(String[] args) {

        //In Terminal
//        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
//            bw.write("Hello bro!");
//            char[] ch = "Hello Java".toCharArray();
//            bw.write(ch);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //In File
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("JavaByKK/File_Handling/note.txt", true))) {
            bw.write("\nAkshat Agarwal");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
