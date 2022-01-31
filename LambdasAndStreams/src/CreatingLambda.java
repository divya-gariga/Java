public class CreatingLambda {
    public interface Greeting{
        public String sayHello(String name);
    }
    public void testGreeting(String name,Greeting greet)
    {
        String result=greet.sayHello(name);
        System.out.println(result);
    }

    public static void main(String[] args) {
        //inline lambda
        new CreatingLambda().testGreeting("Harry",(String name)->"Hello  "+name);
        new CreatingLambda().testGreeting("Divya",(String name)->"Hello  "+name);

        Greeting greet=(String name)->"Hello "+name;
        new CreatingLambda().testGreeting("Charlie",greet);
    }
}
