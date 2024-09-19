package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File textFile = new File("D:\\newFile.txt");
            if (textFile.createNewFile()){
                System.out.println("file created: " + textFile.getName());
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
