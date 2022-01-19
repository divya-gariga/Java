import java.util.Scanner;
public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter 5 Integers:");
        for(int i=0;i<5;i++)
        {
            array[i]=scan.nextInt();
        }
        System.out.println("Here are the 5 integers multiplied by 2");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]*2);
        }
    }
}
