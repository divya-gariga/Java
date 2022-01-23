import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Assignment11 {
    public static void main(String[] args) {
        String fileName=args[0];
        Map<Character,Integer> occurrences=countOccurrences(fileName);
        writeToFile(occurrences,fileName);
        System.out.println(occurrences);
        System.out.println("The above occurrences are written to file");
    }

    public static void writeToFile(Map<Character, Integer> occurrences,String fileName) {
        try{
            PrintWriter pw=new PrintWriter(new File(fileName));
            pw.println("Character    Frequency");
            for(Character key:occurrences.keySet()){
                pw.println(key+"            "+occurrences.get(key));
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Character,Integer> countOccurrences(String fileName){
        Map<Character,Integer> occurrences=new HashMap<>();
        for(int i=0;i<fileName.length();i++)
        {
            Integer value= occurrences.getOrDefault(fileName.charAt(i),0);
            occurrences.put(fileName.charAt(i),value+1);
        }
        return occurrences;
    }
    }


