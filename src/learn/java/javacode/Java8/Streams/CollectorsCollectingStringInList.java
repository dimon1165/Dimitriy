package learn.java.javacode.Java8.Streams;

import learn.java.javacode.SupportClasses.People;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * How to read from file with streams
 */

public class CollectorsCollectingStringInList {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList<>();
        // Try with resources
        try(
            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    CollectorsCollectingStringInList.class.getResourceAsStream("people.txt")));
            //Тут использован новый метод для BufferReader - lines();, который возвращает стрим линий из файла
            Stream<String> stream = reader.lines();
        ){
            stream.map(line -> {
                // как раздклять линии
                String [] s = line.split(" ");
                // парсим то, что было взято из файла
                People people = new People(s[0].trim(), Integer.parseInt(s[1]));
                //добаляем в коллекцию
                peoples.add(people);
            return people;
            }).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Теперь мы можем на основе результата прошлой операции отсортировать лист и уведеть по старшинству
        Stream<People> stream = peoples.stream();

        //Найти младшего из листа,который старше 20.
        //Так как функция min может вернуть null мы присваеваем все к Optional
        Optional<People> optional=
                stream.filter(people -> people.getAge() >=20)
                .min(Comparator.comparing(People::getAge));
        System.out.println(optional);

        //Чтобы повторно использовать стрим его необходимо еще раз открыть через peoples.stream()
        //Здесь мы выводим по старшинству
        Optional<People> optional1 =
                peoples.stream()
                        .max(Comparator.comparing(People::getAge));
        System.out.println(optional1);

        //Для того, чтобы собрать результат операции в коллекцию необходимо использовать collectors
        //Здесь мы также используем группирование людей по возрастам
        Map<Integer, List<People>> integerListMap =
                peoples.stream()
                        .collect(Collectors.groupingBy(People::getAge));
        System.out.println(integerListMap);
 
        // Также можно использовать downstream processing
        Map<Integer, Long> ListMap =
                peoples.stream()
                        .collect(Collectors.groupingBy(People::getAge,Collectors.counting()));
        System.out.println(ListMap);

        //по порядку, но с записью имен в TreeSet
        Map<Integer, Set<String>> listMap =
        peoples.stream()
                .collect(Collectors.groupingBy(People::getAge,
                        Collectors.mapping(People::getName,Collectors.toCollection(TreeSet::new))));
        System.out.println(listMap);
    }
}
