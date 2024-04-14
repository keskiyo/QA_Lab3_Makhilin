package Application;

/**
 * @brief Содержит реализацию продукт класса.
 * @image html "D:/Учеба/3 год/6 семестр/Тестирование ПО Еремин/doc/images/image.png" width=500cm
 */
public class Product {
    /**
     * @brief Графф пример.
     * @dot
     * digraph G{
     * A->B;
     * B->C; 
     * C->A;
     * } 
     * @enddot
     */
    private String name;    ///< Название продукта.
    private double price;   ///< Цена продукта.
    private int amount;     ///< Количество продуктов.
    /**
    * @brief Пример формулы.
    * \f$(x_1,y_1)\f$
    */

    /**
     * @brief Содержит новый продукт с названием, ценой, количество.
     * @param name Название продукта.
     * @param price Цена продукта.
     * @param amount Количество продукта.
     */
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

   

    /**
     * @brief Вычисляет общую стоимость продукта на основе его цены и количества.
     * @return Общая стоимость продукта.
     */
    public double calculateTotal() {
        return this.price * this.amount;
    }

    /**
     * @brief Retrieves the name of the product.
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * @brief Sets the name of the product.
     * @param name The new name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @brief Retrieves the price of the product.
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * @brief Sets the price of the product.
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @brief Retrieves the amount of the product.
     * @return The amount of the product.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @brief Sets the amount of the product.
     * @param amount The new amount of the product.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @brief Generates a string representation of the product including its name, price, amount, and total price.
     * @return The string representation of the product.
     */
    @Override
    public String toString() {
        return String.format("%s - Price: $%.2f - Amount: %d - Total: $%.2f", this.name, this.price, this.amount, this.calculateTotal());
    }
}