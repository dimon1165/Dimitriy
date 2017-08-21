package learn.java.Patterns.structural.bridge;

/**
 * Created by dvorop on 11.07.2017.
 * Разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.
 * У вас есть класс геометрических Фигур, который имеет подклассы Квадрат и Треугольник.
 * Вы хотите расширить иерархию фигур по цвету, то есть иметь Красные и Синие фигуры.
 * Чтобы всё это объединить, вам придётся создать 4 комбинации подклассов вроде СиниеКвадраты и КрасныеТреугольники.
 * Паттерн Мост предлагает заменить наследование делегированием. Для этого нужно выделить одну из таких «плоскостей»
 * в отдельную иерархию и ссылаться на объект этой иерархии, вместо хранения его состояния и поведения внутри одного класса.
 */
public class BridgePatternMain {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
