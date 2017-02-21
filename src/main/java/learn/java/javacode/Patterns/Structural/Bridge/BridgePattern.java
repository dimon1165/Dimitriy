package learn.java.javacode.Patterns.Structural.Bridge;

import learn.java.javacode.Patterns.Structural.Bridge.withoutbridge.*;

/**
 * Created by dvorop on 21.02.2017.
 * Похож на адаптер с той разницей, что адаптер рабротает со старым кодым,а бридж с новым
 * Идея бриджа разделить абстракцию с реализацией. Для этого можно использовать такие техники как
 * Encapsulation, Composition, Inheritance.
 * Главная особенность - это то, что изменение в абстракции не влияют на клиента. Клиент не знает о абстракции
 * на заднем фоне.
 * Если мы не знаем какой наш продукт будет в конце, то реализация бриджа будет идеальной для такого случаяю
 * Пример может быть:
 * JDBC Driver
 *
 */
public class BridgePattern {
    public static void main(String[] args) {
        Circle circle = new BlueCyrcle();
        Square square = new RedSquare();
        Square greenSquare = new GreenSquare();
        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
