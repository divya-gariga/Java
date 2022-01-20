import java.io.File;
import java.util.Scanner;
import java.util.regex.*;
public class Assignment1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter the file name you want to search (w/o extension) :");
            String fileToSearch=scan.nextLine();
            searchFile(fileToSearch);
            System.out.println("Enter any number to continue searching of files  or 0 to exit:");
            num=scan.nextInt();
            scan.nextLine();
        }while(num!=0);
    }

    public static void searchFile(String fileToSearch) {
        //getting the homeDirectory where we search the given file
        File homeDirectory=new File(".");
        //files variable has the list of files and folders in home directory
        File[] files=homeDirectory.listFiles();
        //this is the pattern to match for( we are searching for .txt files
        String pattern=fileToSearch+".txt";
        if(files!=null) {
            for (File file : files) {
                //if the file in the home directory matches the pattern then file is found
                if (Pattern.matches(pattern, file.getName())) {
                    System.out.println("File Found!");
                    System.out.println("Its absolute path :" + file.getAbsolutePath());
                    return;
                }
            }
        }
        System.out.println("Either pattern not matched or File not found!");
    }

}
