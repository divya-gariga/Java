import domain.Movie;
import domain.MovieUtil;

import java.util.List;

public class WorkingWithStreams {

    List<Movie> movies = MovieUtil.createMovies();

    private void findMoviesByDirector(String director) {
        movies.stream()
                .filter(m-> m.getDirector().equals("Steven Spielberg")? true:false)
                .map(Movie::getName)
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new WorkingWithStreams().findMoviesByDirector("Steven Spielberg");
    }

}
