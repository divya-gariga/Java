interface MovieFactory{
    public void create(int id);
}

public class ConstructorReferences {

    public ConstructorReferences(int id){
        System.out.println("Created movie with id: "+id);
    }

    public static void main(String[] args) {
        //using lambda
        MovieFactory movie1=(i)->new ConstructorReferences(i);
        movie1.create(1);

        //using constructor ref
        MovieFactory movie2=ConstructorReferences::new;
        movie2.create(2);

    }

}
