//time complexity: O(n) space complexity: O(m) where m is 26 always
public class Assignment2 {
    public static void main(String[] args) {
        checkAlphabetInString("abcdefghijklmnopqrStuvwxyz");
    }
    public static void checkAlphabetInString(String str)
    {
        if(str.length()<26)
        {
            System.out.println("NOT PRESENT");
            return;
        }
        str= str.toLowerCase();
        int[] alphabets=new int[26];
        for(int i=0;i<str.length();i++)
        {
            alphabets[(int)str.charAt(i)-97]++;
        }
        int flag=0;
        for(int i=0;i<26;i++)
        {
            if(alphabets[i]==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("PRESENT");
        else
            System.out.println("NOT PRESENT");
    }
}
