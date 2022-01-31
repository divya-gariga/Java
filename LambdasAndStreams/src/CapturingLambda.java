import domain.Trade;

public class CapturingLambda {
    Trade trade=new Trade("IBM",1000,"OPEN");
    public interface TradeCheck{
        public boolean check(Trade trade);
    }

    public boolean isOpenTrade(){
        TradeCheck tradeCheck=(trade) ->  trade.isOpen()?true:false;
        return tradeCheck.check(trade);
    }

    public boolean checkStatus(String status)
    {
//        status="";
        TradeCheck statusCheck=(trade)->trade.getStatus().equals(status)?true:false;
        return statusCheck.check(trade);
    }

    int var=10;
    public boolean instanceVariables(int localVar)
    {
        TradeCheck capturingVariables=(trade)->{ System.out.println(var); return trade.isOpen();
        };
        return capturingVariables.check(trade);
    }


    public static void main(String[] args) {
        CapturingLambda capture=new CapturingLambda();
        System.out.println("is trade open or not? "+capture.isOpenTrade());
        System.out.println("is the trade status close? "+capture.checkStatus("CLOSE"));
        System.out.println("Capturing variables:"+capture.instanceVariables(20));
    }
}
