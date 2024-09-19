package multi_threading;

public class DownloadManager extends Thread{
    private String fileName;
    // Constructor to set the file name to be downloaded
    public DownloadManager(String fileName){
        this.fileName = fileName;
    }
    public void run(){
        System.out.println("Downloading: " + fileName);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Download complete: " + fileName);
    }

    public static void main(String[] args) {
        DownloadManager download1 = new DownloadManager("file1.txt");
        DownloadManager download2 = new DownloadManager("file2.txt");
        DownloadManager download3 = new DownloadManager("file3.txt");

        download1.start();
        download2.start();
        download3.start();

        System.out.println("All downloads started...");

    }
}
