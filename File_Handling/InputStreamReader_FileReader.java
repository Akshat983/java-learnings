package JavaByKK.File_Handling;
import java.io.FileReader;
import java.io.IOException;

//InputStreamReader converts byte stream to char stream
public class InputStreamReader_FileReader {
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

        try(FileReader fr = new FileReader("JavaByKK/File_Handling/note.txt")){
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
