/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package task1;

public class Main {
    
    public static void main(String[] args) {
        OneProduct product1 = new OneProduct(3, 10.99, 0.75);
        OneProduct product2 = new OneProduct(99, 12312.93, 42.575);
        OneProduct product3 = new OneProduct(23, 0.89, 59.1);

        product1.Counter();
        product2.Counter();
        product3.Counter();
    }
}
