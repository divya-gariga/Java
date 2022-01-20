public class CountDown {
    public static void main(String[] args) {
        //countDownFrom(10);
        countUp(10,10);
    }
    public static void countDownFrom(int num){
        if(num<0)
            return;
        System.out.println(num);
        countDownFrom(num-1);
    }
    public static void countUp(int start,int end)
    {
        if(start>end)
            return;
        System.out.println(start);
        countUp(start+1,end);
    }
}
