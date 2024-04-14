package Application;

 import java.util.ArrayList;
 import java.util.List;

/**
 * @brief Contains the implementation of the Cart class.
 * @image html "D:/Учеба/3 год/6 семестр/Тестирование ПО Еремин/doc/images/image.png" width=500cm
 */
 public class Cart {
 
     private List<Product> products; ///< The list of products in the cart.
 
     /**
      * @brief Constructs a new Cart object with an empty list of products.
      */
     public Cart() {
         this.products = new ArrayList<>();
     }
 
     /**
      * @brief Adds a product to the cart.
      * @param product The product to add.
      */
     public void addProduct(Product product) {
         this.products.add(product);
     }
     /**
    * @brief Пример формулы.
    * \f$(x_1,y_1)\f$
    */
     /**
      * @brief Removes a product from the cart based on the product name.
      * @param productName The name of the product to remove.
      */
     public void removeProduct(String productName) {
         for (Product product : products) {
             if (product.getName().equals(productName)) {
                 this.products.remove(product);
                 break;
             }
         }
     }
 
     /**
      * @brief Calculates the total cost of all products in the cart.
      * @return The total cost of all products.
      */
     public double calculateTotalCost() {
         double totalCost = 0;
         for (Product product : products) {
             totalCost += product.calculateTotal();
         }
         return totalCost;
     }
 
     /**
      * @brief Converts the cart to a string representation.
      * @return The string representation of the cart.
      */
     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         for (Product product : products) {
             sb.append(product.toString()).append("\n");
         }
         sb.append("Total Cost: $").append(calculateTotalCost());
         return sb.toString();
     }
 }
