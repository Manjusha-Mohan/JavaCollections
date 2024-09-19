package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\newFile.txt");
            writer.write("This is my first file write using Java. Happy learning!.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
