package task1;

/**
 * Класс, описывающий корзину товаров в магазине
 */
public class OneProduct {
    // Количество товаров
    private int productCount;

    // Цена
    private double price;

    // Скидка
    private double discount;

    public OneProduct(int productCount, double price, double discount) {
        this.productCount = productCount;
        this.price = price;
        this.discount = discount;
    };

    public void Counter() {
        double sum = this.productCount * this.price;
        System.out.printf("Общая сумма покупки без скидки: %.2f\n", sum);
        double sumDiscount = sum - (sum * this.discount / 100);
        System.out.printf("Общая сумма покупки со скидкой: %.2f\n", sumDiscount);
    };
}
