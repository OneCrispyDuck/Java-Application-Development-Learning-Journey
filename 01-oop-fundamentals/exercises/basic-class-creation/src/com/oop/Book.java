package com.oop;

public class Book {
    // Fields (attributes)
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int numberOfPages;

    // Default Constructor (No-arg Constructor)
    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.price = 0.0;
        this.numberOfPages = 0;
    }


    // Constructor (Parameterized Constructor/Attribute Constructor)
    public Book(String title, String author, String isbn, double price, int numberOfPages){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    // Methods: Getter, Setter, Operational, Utility
    
    // Method: Getter/Setter pairs (Title)
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //Method: Getter/Setter pairs (Author)
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    //Method: Getter/Setter pairs (isbn)
    public String getISBN(){
        return isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    //Method: Getter/Setter pairs (price)
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Method: Getter/Setter pairs (numberOfPages) 
    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    //Method: toString() (Override Method) [Why override?: Converts object to readable string format for printing/display]
    @Override
    public String toString() {
        return "Title: " + title + 
               "\nAuthor: " + author + 
               "\nISBN: " + isbn + 
               "\nPrice: $" + price + 
               "\nPages: " + numberOfPages;
    }

    //Method: equals method (Boolean: For object comparrison)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Check if comparing the same object with itself 
        return true; // If same memory location, they're identical
        if (obj == null || getClass() != obj.getClass()) // Check if the passed object is null OR if it's not a Book class
        return false; // If either condition is true, they can't be equal
        Book book = (Book) obj; // Cast the object to Book type since we now know it's a book
        return isbn.equals(book.isbn); // Comparing books based on ISBN (Assumes ISBN is the unique identifier)
    }

    // Display info method
    public void displayInfo(){
        System.out.println("Book Detials");
        System.out.println("Title "+ title);
        System.out.println("Author "+author);
        System.out.println("ISBN "+isbn);
        System.out.println("Price: $"+price);
        System.out.println("Number of pages: "+ numberOfPages);

    }

}
