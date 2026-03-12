import java.util.*;

// Comparable Interface
// Belongs to java.lang package
// java.lang is auto-imported
// Used when default/natural sorting order is required
// Can give only one sorting logic
// class is modified as sorting logic is written Inside the class

class Movie implements Comparable<Movie> {
    String title;
    int releaseYear;

    Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // For custom Sorting we need to override compareTo method of Comparable interface.
    // Internally Java calls movie1.compareTo(movie2)

    // Rule of compareTo()
        //Return negative → this < other
        //Return 0 → equal
        //Return positive → this > other

    @Override
    public int compareTo(Movie other) {
        return this.releaseYear - other.releaseYear; // follows ascending order
        // Sometimes , this can lead to overflow so we must use :
        // return Integer.compare(this.releaseYear, other.releaseYear);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("The Dark Knight", 2008));
        list.add(new Movie("Inception", 2010));
        list.add(new Movie("Interstellar", 2014));

        print(list);
        Collections.sort(list);
        print(list);
    }

    public static void print(List<Movie> list) {
        for (Movie movie : list) {
            System.out.println(movie.title + " " + movie.releaseYear);
        }
    }
}
