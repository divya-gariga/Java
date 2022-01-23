package divya.assignment.main;
import divya.assignment.data.DefaultInitialization;
import divya.assignment.singleton.StaticInitialization;

public class Main {
    public static void main(String[] args) {
        DefaultInitialization obj=new DefaultInitialization();
        obj.printInstanceVariables();
        obj.printLocalVariables();

        StaticInitialization static_init=StaticInitialization.print("divya");
        static_init.printString();
    }
}
