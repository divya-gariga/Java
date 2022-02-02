import domain.Trade;
import domain.TradeUtil;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    List<Trade> trades=TradeUtil.createTrades();

   private void tradeQuantity(){
       Optional<Integer> quantity=trades.stream().map(Trade::getQuantity).reduce(Integer::sum);
       System.out.println(quantity);
   }

    private void intStream(){
       int[] ints=new int[]{1,2,3,4,5,6};
       IntStream intStreams= IntStream.of(ints);
       intStreams.forEach(System.out::println);
    }

    private void doubleStream() {
       double[] doubles=new double[]{1.1,2.2,3,4,5};
        DoubleStream doubleStreams=DoubleStream.of(doubles);
        doubleStreams.forEach(System.out::println);
    }

    private void convertStream(){
       int sum=trades.stream().mapToInt(Trade::getQuantity).sum();
        System.out.println("The total quantity :"+sum);
    }

    public static void main(String[] args) {
        new PrimitiveStreams().tradeQuantity();
        new PrimitiveStreams().intStream();
        new PrimitiveStreams().doubleStream();
        new PrimitiveStreams().convertStream();
    }

}

