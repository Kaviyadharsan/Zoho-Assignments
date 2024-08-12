public class Main1 {
    public static void main(String[] args) {
        // Creating products
        Product laptop = new ElectronicsProduct("Laptop", 999.99, "Dell", "Inspiron 15");
        Product tShirt = new ClothingProduct("T-Shirt", 19.99, "M", "Red");
        Product book = new BookProduct("The Alchemist", 10.99, "Paulo Coelho", "Fiction");

        // Adding products to the shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(tShirt);
        cart.addProduct(book);

        // Displaying product details
        cart.displayProducts();

        // Calculating total price
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }
}

