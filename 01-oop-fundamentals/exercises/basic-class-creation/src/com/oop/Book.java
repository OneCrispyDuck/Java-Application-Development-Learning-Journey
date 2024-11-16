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

    public void setTitle(String Title){
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
    public int numberOfPages(){
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    //Method: Operational Methods (Buiness Logic)
    
}
