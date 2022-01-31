interface Movie{
    public boolean check(int id);
}

public class MethodReferences{

    // Static method reference usage
    public void testMovieStaticMethodRef(){
        Movie m1 = (i) -> i< 100?true:false;
        System.out.println("Using lambda for calling static methods :"+m1.check(10));
        Movie m2 = MethodReferences::isClassic;
        System.out.println("using method references for calling static methods :"+m2.check(10));
    }

    // Instance method reference usage
    public void testMovieInstanceMethodRef() {
        MethodReferences ref = new MethodReferences();
        Movie m1 = (i) -> i>=1 && i <=10?true:false;
        System.out.println("Using lambda to call instance methods :"+m1.check(9));
        Movie m2 = ref:: isTop10;
        System.out.println("Using method ref to call instance methods :"+m2.check(9));

    }

    public static boolean isClassic(int movieId){
        if(movieId<100)
            return true;
        else
            return false;
    }

    public boolean isTop10(int movieId){
        if(movieId>=1 && movieId<=10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        MethodReferences methodRef = new MethodReferences();
        methodRef.testMovieStaticMethodRef();
        methodRef.testMovieInstanceMethodRef();
    }

}

