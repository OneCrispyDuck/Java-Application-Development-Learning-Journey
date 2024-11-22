package com.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BOOK MANAGEMENT SYSTEM DEMO ===\n");

        // SECTION 1: Creating multiple Book objects
        System.out.println("--- Creating Multiple Book Objects ---");
        // Using default constructor
        Book book1 = new Book(); 
        // Using parameterized constructor
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0547928227", 12.99, 300);
        // Creating another book for comparison
        Book book3 = new Book("1984", "George Orwell", "978-0451524935", 9.99, 328);
        // Creating a duplicate book for equality testing
        Book book4 = new Book("1984", "George Orwell", "978-0451524935", 9.99, 328);
        // Creating a book according to expected outcome
        @SuppressWarnings("unused")
        Book book5 = new Book("Java Programming all in one", "Doug Lowe", "971-6358492200", 13, 555 );

        // SECTION 2: Using both constructors
        System.out.println("\n--- Demonstrating Different Constructors ---");
        System.out.println("Book1 (Default Constructor): " + book1);
        System.out.println("Book2 (Parameterized Constructor): " + book2);

        // SECTION 3: Using all getter/setter methods
        System.out.println("\n--- Using Getters and Setters ---");
        // Demonstrating setters
        System.out.println("Setting values for Book1...");
        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        book1.setISBN("978-0743273565");
        book1.setPrice(14.99);
        book1.setNumberOfPages(180);

        // Demonstrating getters
        System.out.println("\nRetrieving values from Book1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("Number of Pages: " + book1.getNumberOfPages());

        // SECTION 4: Comparing books using equals()
        System.out.println("\n--- Comparing Books Using equals() ---");
        // Compare different books
        System.out.println("Comparing book1 with book2 (different books):");
        System.out.println("book1.equals(book2): " + book1.equals(book2));

        // Compare identical books
        System.out.println("\nComparing book3 with book4 (same ISBN):");
        System.out.println("book3.equals(book4): " + book3.equals(book4));

        // Compare with null
        System.out.println("\nComparing book1 with null:");
        System.out.println("book1.equals(null): " + book1.equals(null));

        // Compare with different object type (String)
        String notABook = "not a book";
        System.out.println("Comparing book1 with different type (String):");
        System.out.println("book1.equals(notABook): " + book1.equals(notABook));


        // SECTION 5: Displaying book information
        System.out.println("\n--- Displaying Book Information ---");
        // Using toString() method
        System.out.println("Book1 toString():");
        System.out.println(book1);

        // Custom formatted display
        System.out.println("\nCustom formatted display for Book2:");
        displayBookDetails(book2);

        // Display price comparison
        System.out.println("\nPrice Comparison:");
        System.out.println("Book1 price: $" + book1.getPrice());
        System.out.println("Book2 price: $" + book2.getPrice());
        System.out.println("Price difference: $" + 
            Math.abs(book1.getPrice() - book2.getPrice()));
    }

    // Helper method to display book details in a formatted way
    private static void displayBookDetails(Book book) {
        System.out.println("╔════════════════════════════");
        System.out.println("║ Title: " + book.getTitle());
        System.out.println("║ Author: " + book.getAuthor());
        System.out.println("║ ISBN: " + book.getISBN());
        System.out.println("║ Price: $" + book.getPrice());
        System.out.println("║ Pages: " + book.getNumberOfPages());
        System.out.println("╚════════════════════════════");
    }
}