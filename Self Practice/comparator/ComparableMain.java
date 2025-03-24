package com.comparator;
import java.util.*;

class Book implements Comparable<Book> {
    int bookId;
    String title;
    double price;

    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Implement compareTo() method to sort by price, then by title
    @Override
    public int compareTo(Book other) {
        if (this.price != other.price) {
            // Sort by price (ascending)
            return Double.compare(this.price, other.price);
        } else {
            // If price is same, sort by title (alphabetically)
            return this.title.compareTo(other.title);
        }
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Price: " + price;
    }
}

public class ComparableMain {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java Programming", 500.0));
        books.add(new Book(102, "Data Structures", 300.0));
        books.add(new Book(103, "Algorithms", 500.0));

        // Sorting using Comparable
        Collections.sort(books);

        // Printing the sorted list
        System.out.println("Sorted Books:");
        for (Book b : books) {
            System.out.println(b);
        }

	}

}
