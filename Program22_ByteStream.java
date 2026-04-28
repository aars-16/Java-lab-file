import java.io.*;

public class Program22_ByteStream {

    public static void main(String[] args) {

        try {
            // Create source file
            FileOutputStream fos = new FileOutputStream("byte_source.txt");
            fos.write("Hello from Byte Stream!".getBytes());
            fos.close();

            // Copy file
            FileInputStream fis = new FileInputStream("byte_source.txt");
            FileOutputStream fos2 = new FileOutputStream("dest_byte.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos2.write(b);
            }

            fis.close();
            fos2.close();

            System.out.println("File copied using Byte Stream");

        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}