import domain.Trade;
import domain.TradeUtil;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasics {

    private void findLargeTradesUsingStreams(List<Trade> trades) {

        List<Trade> largeTrades = trades.stream()
                .filter(trade ->trade.getQuantity() > 10000)
                .filter(Trade::isCancelledTrade)
                .limit(10)
     .collect(Collectors.toList());

        System.out.println("Large trades: "+largeTrades);
    }

    public static void main(String[] args) {
        StreamsBasics basics = new StreamsBasics();
        List<Trade> trades = TradeUtil.createTrades();
        basics.findLargeTradesUsingStreams(trades);
    }
}

