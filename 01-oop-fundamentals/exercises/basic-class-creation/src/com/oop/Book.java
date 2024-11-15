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

    // Methods
    public void 
}