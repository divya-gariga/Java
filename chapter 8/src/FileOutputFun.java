import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter("output.txt");
            pw.println("HI");
            pw.println("I am Gariga Divya");
            System.out.println("written to file!");
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't write to file");
            System.out.println(e.getMessage());
        }
    }
}
