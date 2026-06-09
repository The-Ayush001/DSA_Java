package L49_File_Handling;

import java.io.IOException;

public class InputStreamReader {
    static void main() {
        try {
            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
            System.out.print("Enter some letters:");
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
