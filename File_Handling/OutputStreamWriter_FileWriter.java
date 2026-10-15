package JavaByKK.File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_FileWriter {
    static void main() {

        //OUTPUT IN TERMINAL
//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello World");
//            osw.write('\n');
//            osw.write(97);
//            osw.write(10);    // 10 == \n
//            char[] ch = "Hello BRO!".toCharArray();
//            osw.write(ch);
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }



        //OUTPUT IN FILE

        //THIS REWRITES / OVERWRITES THE WHOLE FILE
        try(FileWriter fw = new FileWriter("JavaByKK/File_Handling/note.txt")) {
            fw.write("Hello bro!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //THIS APPENDS IN THE OLD FILE, I.E., new FileWriter("Location", boolean append)
        try(FileWriter fw = new FileWriter("JavaByKK/File_Handling/note.txt", true)) {
            fw.write("Java By KK");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
