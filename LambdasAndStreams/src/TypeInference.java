interface Greeting{
    public String sayHello(String name);
}

public class TypeInference {

    public void testGreeting(String name,Greeting greet)
    {
        String result=greet.sayHello(name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        //inline lambda
        new CreatingLambda().testGreeting("Harry",(name)->"Hello  "+name);
    }
}
