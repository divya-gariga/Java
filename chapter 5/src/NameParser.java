public class NameParser {
    public static void main(String[] args) {
        String fullName="Gariga Divya";
        System.out.println("The full name is : "+fullName);
        String firstName=fullName.substring(7);
        String lastName=fullName.substring(0,6);
        System.out.println("first name in uppercase: "+firstName.toUpperCase());
        System.out.println("last name in lowercase: "+lastName.toLowerCase());

        String name="hello",name1="hello",name3="world";
        if(name.compareTo(name1)==0)
            System.out.println("name==name1");
        else
            System.out.println("name,name1 are not equal");


    }
}
