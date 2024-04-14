package Application;

/**
 * @brief Класс, представляющий автомобильный продукт, который является расширением класса Product.
 * @image html "D:/Учеба/3 год/6 семестр/Тестирование ПО Еремин/doc/images/image.png" width=500cm
 */
public class AvtoProduct extends Product {

    private int warrantyPeriod; /**< Период гарантии для автомобильного продукта в месяцах. */

    /**
     * @brief Конструктор для инициализации объекта AvtoProduct.
     * @param name Название продукта.
     * @param price Цена продукта.
     * @param amount Количество продукта.
     * @param warrantyPeriod Период гарантии продукта в месяцах.
     */
    public AvtoProduct(String name, double price, int amount, int warrantyPeriod) {
        super(name, price, amount);
        this.warrantyPeriod = warrantyPeriod;
    }
    /**
    * @brief Пример формулы.
    * \f$(x_1,y_1)\f$
    */

    /**
     * @brief Метод для получения периода гарантии автомобильного продукта.
     * @return Период гарантии в месяцах.
     */
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    /**
     * @brief Метод для установки периода гарантии автомобильного продукта.
     * @param warrantyPeriod Новый период гарантии в месяцах.
     */
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    /**
     * @brief Переопределенный метод toString для возврата строкового представления объекта AvtoProduct.
     * @return Строковое представление объекта AvtoProduct.
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" - Период гарантии: %d месяцев", this.warrantyPeriod);
    }
}
