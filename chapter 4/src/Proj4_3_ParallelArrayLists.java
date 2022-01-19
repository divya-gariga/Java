import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_ParallelArrayLists {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();
        System.out.println("Enter 3 names:");
        for(int i=0;i<3;i++)
        {
            names.add(scan.next());
        }
        System.out.println("Enter 3 ages:");
        for(int i=0;i<3;i++)
        {
            ages.add(scan.nextInt());
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
        }
    }
}
