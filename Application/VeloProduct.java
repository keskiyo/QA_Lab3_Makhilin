package Application;

/**
 * @brief Класс, представляющий велосипедный продукт, который является расширением класса Product.
 * @image html "D:/Учеба/3 год/6 семестр/Тестирование ПО Еремин/doc/images/image.png" width=500cm
 */
public class VeloProduct extends Product {

    private String brand; /**< Бренд велосипедного продукта. */

    /**
     * @brief Конструктор для инициализации объекта VeloProduct.
     * @param name Название продукта.
     * @param price Цена продукта.
     * @param amount Количество продукта.
     * @param brand Бренд велосипедного продукта.
     */
    public VeloProduct(String name, double price, int amount, String brand) {
        super(name, price, amount);
        this.brand = brand;
    }

   /**
    * @brief Пример формулы.
    * \f$(x_1,y_1)\f$
    */

    /**
     * @brief Метод для получения бренда велосипедного продукта.
     * @return Бренд велосипедного продукта.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @brief Метод для установки бренда велосипедного продукта.
     * @param brand Новый бренд велосипедного продукта.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @brief Переопределенный метод toString для возврата строкового представления объекта VeloProduct.
     * @return Строковое представление объекта VeloProduct.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" - Бренд: %s", this.brand);
    }
}