import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args){
        Scanner scan;
        int sum=0;
        try{
            scan=new Scanner(new File("input.txt"));
            while(scan.hasNext()){
                sum=sum+scan.nextInt();
            }
            System.out.println("The sum of the numbers in the file is: "+sum);
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println("couldn't read a file!");
            System.out.println(e.getMessage());
        }
    }
}
