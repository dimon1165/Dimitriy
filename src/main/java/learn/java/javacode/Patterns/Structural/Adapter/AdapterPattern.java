package learn.java.javacode.Patterns.Structural.Adapter;

import learn.java.javacode.SupportClasses.Person;

import java.util.List;

/**
 * Created by dvorop on 21.02.2017.
 * У нас есть розетка и американская вилка. Мы можем использовать адаптер для того, чтобы
 * вилка вошла в розетку - это основной концепт адаптора.
 * Мы выбираем данный паттерн,
 * - когда мы хоитм, чтобы клиент мог иметь доступ к существующему интерфейсу.("Convert interface into another interface").
 * - если аппликация, которая нам досталась старая и имеет свои интерфесы и мы не хоти сильно изменять структуру.
 * - если мы хотим транслировать запросы клиента к аппликации эффективно.
 * Примером может быть Arrays -> List  - массивы появились раньше, чем коллекции и мы имеем возможность транслировать
 * массивы в листы - это и есть пример адаптора.
 * Он называется адаптер, потому, что он более адаптирует старый интерфес к новому, чем декорирует его и т.д.
 *
 */
public class AdapterPattern {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
    }
}
