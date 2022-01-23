package divya.assignment.singleton;

public class StaticInitialization {
    String str;
    public static StaticInitialization print(String str)
    {
       // this.str=str;
        //instance variables cannot be accessed from static method
        StaticInitialization static_init=new StaticInitialization();
        return static_init;
    }
    public void printString(){
        System.out.println(this.str);
    }
}
