import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Double> someRealNumbers=new ArrayList<>();
        double value;
        System.out.println("Enter the 0 or more elements or -1 to exit:");
        while((value= scan.nextDouble())>0)
        {
            someRealNumbers.add(value);
        }
        System.out.println("The ArrayList elements in reverse order:");
        for(int i=someRealNumbers.size()-1;i>=0;i--)
        {
            System.out.println(someRealNumbers.get(i));
        }
    }
}
