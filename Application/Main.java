package Application;

/**
 * @brief Содержит реализацию основного класса.
 * @image html "D:/Учеба/3 год/6 семестр/Тестирование ПО Еремин/doc/images/image.png" width=500cm
 */
public class Main {
    /**
     * @brief Основной способ создания товаров, обновления цен и количества, а также управления корзиной.
     * @param args Аргументы командной строки, передаваемые программе.
     */
    public static void main(String[] args) {
        // Создание различных продуктов
        AvtoProduct product1 = new AvtoProduct("Приора", 345000, 3, 24);
        VeloProduct product2 = new VeloProduct("Велик", 45000, 5, "Giant");
        Product product3 = new Product("Ручка", 23, 12);
        /**
    * @brief Пример формулы.
    * \f$(x_1,y_1)\f$
    */
        // Отображение исходных продуктов
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        // Обновление цены и количества товара 1
        product1.setPrice(299999);
        product1.setAmount(4);
        System.out.println("Обновленная цена для 1 продукта: $" + product1.getPrice());
        System.out.println("Обновленное количество для 1 продукта: " + product1.getAmount());
        System.out.println("Конечная сумма для 1 продукта: $" + product1.calculateTotal());

        // Создание корзины и добавление туда продуктов
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Показывает содержание в корзине
        System.out.println("\nКорзина:");
        System.out.println(cart);

        // Удаляет продукт 2 из корзины
        cart.removeProduct(product2.getName());
        System.out.println("\nОбновленная корзина:");
        System.out.println(cart);
    }
}