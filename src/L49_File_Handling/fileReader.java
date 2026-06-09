package L49_File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    static void main() {
        try {
            FileReader isr = new FileReader("note.txt");
            int letters = isr.read();
            while (isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
