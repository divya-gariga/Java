package divya.assignment.data;

public class DefaultInitialization {
    int intVar;
    char charVar;

    public void printInstanceVariables() {
        System.out.println("instance variables: " +intVar+"  "+charVar);
    }

    public void printLocalVariables() {
        int intVar ;
        char charVar;
        //System.out.println("Local variables: " + intVar + " " +charVar);
        //we cannot use local variables before initializing them
    }
}