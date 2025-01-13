package question3;

public class ProductInventoryManagement {
    public static void main(String[] args) {

        Product product1 = new Product(1,20,"ABC");
        Product product2 = new Product(2,10,"Laptop");

       try{
           product1.updateQuantity(10);
           product2.updateQuantity(-20);
       } catch (IllegalArgumentException e){
           System.out.println("Error Update Quantity :"+e.getMessage());
       }

       try{
           product1.updateQuantity(-5);
       }catch (IllegalArgumentException e){
           System.out.println("Error Update Quantity :"+e.getMessage());
       }

       product1.displayMethod();
       product2.displayMethod();


    }
}
