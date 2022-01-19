public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("John Bough");
        System.out.println(sb);

        sb.append(" is awesome");
        System.out.println(sb);

        sb.replace(14,sb.length(),"amazing");
        System.out.println(sb);

        sb.delete(10,sb.length());
        System.out.println(sb);

        sb.insert(0,"Dr. ");
        System.out.println(sb);

    }
}
