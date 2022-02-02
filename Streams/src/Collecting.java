import domain.Movie;
import domain.MovieUtil;
import domain.Trade;
import domain.TradeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//import static java.util.stream.Collectors.toList;
//import static java.util.stream.Collectors.toSet;
//import static java.util.stream.Collectors.toMap;


public class Collecting {
    List<Trade> trades = TradeUtil.createTrades();

    private void collectIntoAList() {
        List<Trade> tradeCollection =
                trades.stream().collect(Collectors.toList());

        System.out.println(tradeCollection);
    }
    private void collectIntoASet() {
        Set<Trade> tradeCollection =
                trades.stream().collect(Collectors.toSet());

        System.out.println(tradeCollection);
    }
    private void collectIntoToAMap() {
        List<Movie> movies = MovieUtil.createMovies();

        Map<String, Movie> movieMap =
                movies.stream().collect(Collectors.toMap(Movie::getName, movie -> movie));
        System.out.println(movieMap);
    }

    public static void main(String[] args) {
        new Collecting().collectIntoAList();
        new Collecting().collectIntoASet();
        new Collecting().collectIntoToAMap();
    }

}
