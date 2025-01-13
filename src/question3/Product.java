package question3;

public class Product {
    private int productId;
    private String productName;
    private int quantity;

    public Product(int productId, int quantity, String productName) {
        this.productId = productId;
        this.quantity = quantity;
        this.productName = productName;
    }

    public void updateQuantity(int quantityChange){
        if(quantityChange < 0){
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        quantity+=quantityChange;
        System.out.println("Update the quantity :"+productName +" : "+quantity);
    }

    public void displayMethod(){
        System.out.println("Product Id :"+ productId);
        System.out.println("Product Name :"+productName);
        System.out.println("Quantity :"+quantity);
    }
}
