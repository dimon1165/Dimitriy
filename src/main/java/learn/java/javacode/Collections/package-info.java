/**
 * Created by dvorop on 13.02.2017.
 *  Collection extends iterable interface.
 *  The structure of collections:
 *
 *  All collections interfaces extends common interface Collection:
 *  1. LIST - has order, indexing
 *
 *  1.1 ArrayList  - can be any type including null. Indexed, not synchronized.
 *  If it is not enough space in array new capacity calculating by formula: (oldcapacity*3)/2 +1
 *  Low when insert or delete elements in center of arraylist.
 *
 *  1.2 linkedList
 *  Только что созданный объект list, содержит свойства header и size.
 *  header — псевдо-элемент списка. Его значение всегда равно null, a свойства next и prev
 *  всегда указывают на первый и последний элемент списка соответственно.
 *  Так как на данный момент список еще пуст, свойства next и prev указывают сами на себя (т.е. на элемент header). Размер списка size равен 0.
 *  Удаление элементов
 *  Удалять элементы из списка можно несколькими способами:
 *  — из начала или конца списка с помощью removeFirst(), removeLast() за время O(1);
 *  — по индексу remove(index) и по значению remove(value) за время O(n).
 *
 *  2. Set(elements appears only once in collection)
 *  2.0.1 HashSet
 *
 *  2.1 SortedSet ( SortedSet - sort order).
 *  2.1.1 TreeSet
 *
 *  3. Queue (order - first in first out)
 *  3.0.1 PriorityQueue
 *
 *  3.1 Deque(doable ended que has an order - first in first out/first in last out).
 *  3.1.1 LinkedList
 *  3.1.2 ArrayDeque
 *
 *  4. Map(Key unique/value)
 *
 *  4.0.1 HashMap
 *  Oснован на хэш-таблицах, реализует интерфейс Map (что подразумевает хранение данных в виде пар ключ/значение).
 *  Ключи и значения могут быть любых типов, в том числе и null. Данная реализация не дает гарантий
 *  относительно порядка элементов с течением времени.
 *  4.1 SortedMap
 *  4.1.1 TreeMap
 *
 *  Which collection to choose - see pict. - "Collection decision diagram.png"
 *
 */
package learn.java.javacode.Collections;