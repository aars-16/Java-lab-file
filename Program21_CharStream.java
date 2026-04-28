import java.io.*;

public class Program21_CharStream {

    public static void main(String[] args) {

        try {
            // Create source file
            FileWriter fw = new FileWriter("source.txt");
            fw.write("Hello from Character Stream!");
            fw.close();

            // Copy file
            FileReader fr = new FileReader("source.txt");
            FileWriter fw2 = new FileWriter("dest_char.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw2.write(ch);
            }

            fr.close();
            fw2.close();

            System.out.println("File copied using Character Stream");

        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}