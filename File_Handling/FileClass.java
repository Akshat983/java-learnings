package JavaByKK.File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
    static void main(String[] args) {

        //creating a file
        try {
            File fo = new File("JavaByKK/File_Handling/new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //write in file
        try {
            FileWriter fw = new FileWriter("JavaByKK/File_Handling/new-file.txt");
            fw.write("नारायणं नमस्कृत्य नरं चैव नरोत्तमम्।\nदेवीं सरस्वतीं चैव ततो जयमुदीरयेत्॥");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //reading from a file
        try {
            FileReader fr = new FileReader("JavaByKK/File_Handling/new-file.txt");
            System.out.println(fr.readAllLines());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //deleting a file
        try {
            File fo = new File("JavaByKK/File_Handling/random.txt");
            fo.createNewFile();
            if(fo.delete()) {
                System.out.println(fo.getName() + " is now deleted.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
