public class PassByValue {
    public static void main(String[] args) {
        //primitives types
        int number=10;
        System.out.println("Before method call: "+number);
        int result=add(number);
        System.out.println("After method call: "+number);

        //reference types
        StringBuilder name=new StringBuilder("Divya");
        System.out.println("Before method call :"+name);
        add(name);
        System.out.println("After method call :"+name);

        //String
        String str=new String("Hello");
        System.out.println("Before method call :"+str);
        add(str);
        System.out.println("after method call :"+str);

    }
    public static int add(int number)
    {
        number=number+2;
        return number;
    }
    public static void add(StringBuilder name)
    {
       name.insert(0,"Gariga ");
    }
    public static void add(String str)
    {
        str=str+" world!";
    }
}
