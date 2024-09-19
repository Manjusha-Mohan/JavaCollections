package file_handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("newFile.txt");
        if(obj.delete()){
            System.out.println(obj.getName() + " is deleted");
        } else{
            System.out.println("Failed to delete");
        }
    }
}
