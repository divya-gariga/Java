import java.util.regex.*;

public class RegularExFun {
    public static void main(String[] args) {
        //ex 1
        String testStr="divya, Jyothi, Bhavya";
        Pattern pattern=Pattern.compile("divya");
        Matcher matcher=pattern.matcher(testStr);
        int Count = 0;
        while(matcher.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d\n",Count);

        //ex 2
        testStr="12A34B5678";
        Pattern p = Pattern.compile("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d");
        Matcher m = p.matcher(testStr);
        System.out.println(m.find());
    }
}

