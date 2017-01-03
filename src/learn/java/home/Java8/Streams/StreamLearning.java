package learn.java.home.Java8.Streams;

import learn.java.home.SupportClasses.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Stream:
 * - это Java typed interface;
 * - объект над которым можно вполнять операции;
 * - объект, который не хранит накакой информации;
 * - объект, который не должен изменять информацию с которой работает;
 * - объект, который позволяет сделать различные операции в "one pass" (за один запуск)
 *
 * Это не коллекция (хотя может быть похож) потому, что люди которые разрабатывали его не хотели изменять
 * Collection API.
 * Дает возможность оперировать эффективно как с большими так и с маленькими блоками информации.
 * Это значит, что информация может быть обработана параллельно в разных потоках автоматически
 * без написания дополнительного кода.
 *
 * Операции стрима, которые возвращают стрим называются интермидиат.
 */
public class StreamLearning {
    public static void main(String[] args) {
        // Для инициализации юзера
        Person Dmitriy = new Person();
        Dmitriy.setAddress("Ivana Franka,2");
        Dmitriy.setAge("29");
        Dmitriy.setEmail("dimon116523@gmail.com");
        Dmitriy.setName("Dmytro");
        Dmitriy.setWeight("90");
        Dmitriy.setSureName("Voropai");
        //Заполняем персону
        List<String> person = new ArrayList<>();
        person.add(Dmitriy.getName());
        person.add(Dmitriy.getSureName());
        person.add(Dmitriy.getAddress());
        person.add(Dmitriy.getEmail());
        person.add(Dmitriy.getAge());
        person.add(Dmitriy.getWeight());

        // 1. Для создания стрима можно использовать метод stream.
        Stream<String> stream = person.stream();
        // Далее можно использовать personStream для оперции forEach например
        stream.forEach(p -> System.out.println(p));
        //Steam filtering and printout
        Stream<String> streamZero = person.stream();
        Predicate<String> lPredicate = Predicate.isEqual("Dmytro");
        streamZero
                .filter(lPredicate)
                .forEach(s -> System.out.println(s));

        System.out.println();

        // 2. Другой вариант стрима:
        // Заносим данные в стрим
        Stream<String> stream2 = Stream.of(Dmitriy.getName(),
                Dmitriy.getSureName(),
                Dmitriy.getAddress(),
                Dmitriy.getEmail(),
                Dmitriy.getAge(),
                Dmitriy.getWeight());
        //Для того, чтобы отфильтровть этот лист необходимо создать предикат класс
        Predicate<String> predicate1 = s -> s.length() > 8;
        stream2
                .filter(predicate1)
                .forEach(s -> System.out.println(s));

        System.out.println();

        //Можем так же найти информацию, которая равна заданной
        //А также можем чейнить в фильтре условия
        //Можно стрим листа сортировать и результат записывать в другой лист
        Stream<String> stream3 = Stream.of(Dmitriy.getName(),
                Dmitriy.getSureName(),
                Dmitriy.getAddress(),
                Dmitriy.getEmail(),
                Dmitriy.getAge(),
                Dmitriy.getWeight());
        Predicate<String> predicate2 = Predicate.isEqual("Voropai");
        List<String> streamList = new ArrayList<>();
        stream3
                .peek(System.out::println)
                .filter(predicate2.or(predicate1))
                .forEach(streamList::add);
        System.out.println("The size of steamList is " +streamList.size());
    }
}