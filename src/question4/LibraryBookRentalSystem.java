package question4;

public class LibraryBookRentalSystem {
    public static void main(String[] args) {

        Book book1 = new Book(1,"Java");
        Book book2 = new Book(2,"C++");


        try{
            book1.rentBook();
            book2.rentBook();
        }catch (IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            book2.rentBook();
            book2.rentBook();
            book2.rentBook();
        }catch(IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }

        book1.bookDetails();
        book2.bookDetails();

    }
}
