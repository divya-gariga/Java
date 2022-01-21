import java.util.Scanner;
import java.util.regex.*;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;
        do {
            System.out.println("Enter a sentence");
            sentence = scan.nextLine();

            if (sentenceChecker(sentence))
                System.out.println("The given sentence starts with a capital letter and ends with a period.");
            else
                System.out.println("The given sentence doesn't begin with a capital letter or end with a period");
            System.out.println("enter y or n to continue :");

        }while(scan.nextLine().charAt(0)=='y');
    }

    public static boolean sentenceChecker(String sentence) {
        Pattern pattern=Pattern.compile("^[A-Z].*[\\.]$");
        Matcher match =pattern.matcher(sentence);
        return match.matches();
    }
}

