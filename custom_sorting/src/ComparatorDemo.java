// Comparator
// Defined in java.util package
// Used when u want multiple sorting strategies.
// Don't modify the class
// Follow Open-Closed Principle
//

import java.util.*;

class Book {
    String title;
    double price;
    double rating;

    Book(String title, double price, double rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

// Separate Comparator Class
class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.price, b2.price);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Atomic Habits", 399, 4.6));
        list.add(new Book("The Power of Now", 349, 4.5));
        list.add(new Book("How to Win Friends and Influence People", 450, 4.8));

        // Using Separate Comparator Class
        Collections.sort(list, new PriceComparator());
        print(list);

        // using Anonymous class Comparator
        Comparator<Book> ratingComp = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.price, o2.price);
            }
        };
        Collections.sort(list, ratingComp);
        print(list);

        // Using Lambda Expression
        Collections.sort(list, (b1, b2) -> b1.title.compareTo(b2.title));
        print(list);

        // Using comparing method
        list.sort(Comparator.comparing(b -> b.price));
        print(list);

        // Reverse Order
        list.sort(Comparator.comparing(Book::getPrice).reversed());
        print(list);

        // Multiple Level Sorting
        list.sort(Comparator.comparing((Book b) -> b.price).thenComparing(b -> b.rating));
        print(list);

    }

    public static void print(List<Book> list) {
        for (Book book : list) {
            System.out.println(book.title + " " + book.price + " " + book.rating);
        }
    }
}
