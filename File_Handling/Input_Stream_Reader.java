package JavaByKK.File_Handling;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStreamReader converts byte stream to char stream
public class Input_Stream_Reader {
    static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter some letters: ");
//            int letters = isr.read();
//            while (isr.ready()) {
//                System.out.println((char)letters);
//                letters = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(FileReader fr = new FileReader("JavaByKK/File_Handling/input.txt")){
            int letters = fr.read();
            while(fr.ready()) {
                System.out.println((char)letters);
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
