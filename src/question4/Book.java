package question4;

public class Book {
    private int bookId;
    private String title;
    private boolean isAvailable;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    public void bookDetails(){
        System.out.println("Book Id :"+bookId);
        System.out.println("Book Name :"+title);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void rentBook(){
        if(!isAvailable){
            throw new IllegalStateException("Book is currently unavailable.");
        }
        isAvailable=false;
        System.out.println("Book Rented :"+title);
    }

    public void returnBook(){
        isAvailable=true;
        System.out.println("Book Returned :"+title);
    }

}
