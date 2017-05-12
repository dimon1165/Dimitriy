package learn.java.javacode.Collections;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
	public static void main(String[] args) {
//		Конструктор листа может назначать базовую длинну - 10 элементов к примеру
		List<String> stringList = new ArrayList<String>(4);
		Collections.synchronizedList(stringList);
		stringList.add("September");
		stringList.add("October");
		stringList.add("November");
		stringList.add("December");
		stringList.add("January");
		stringList.add("October");

		List<Integer> listInt = new LinkedList<>();
		listInt.add(45);
		listInt.add(4523);
		listInt.add(451);
//		размер 
		System.out.println(stringList.size());

		System.out.println("\n");
		System.out.println("----------------------------COLLECTIONS BEGIN-------------------------------");
//		COLLECTIONS:
//		Reverse order
		Collections.reverse(stringList);
		System.out.println("reverse"+ "\n" + stringList);
//		Sorting
		Collections.sort(stringList);
		System.out.println("sort"+ "\n" + stringList);

//		returns min element
//		gets minim element in collection and takes it index
//		then removes it
		int elem = Collections.min(listInt);
		int indx = listInt.indexOf(elem);
		listInt.remove(indx);
		System.out.println("min= "+ Collections.min(listInt)+"\n");

//		max
		elem = Collections.max(listInt);
		System.out.println("max= "+ Collections.max(listInt)+"\n");

		System.out.println("----------------------------COLLECTIONS END-------------------------------");
		System.out.println("\n");


//		получить по индексу элемент
		System.out.println(stringList.get(3));
		
//		проверить есть ли в листе значение true/false
		System.out.println(stringList.contains("October"));
		
//		очистить массив
//		stringList.clear();
//		System.out.println(stringList);
		
//		удаление элемета из массива
		stringList.remove(3);
		System.out.println(stringList);

//		возвращает индекс элемента
		System.out.println(stringList.indexOf("October"));
		
//		возвращает индекс последний раз встречающегося элемента
		System.out.println(stringList.lastIndexOf("October"));
		
		
//      удалит все встретившиеся значения October
//		для этого был создан доп класс который импл. интерфейс
//		и переопределил методж те�?т
			ForRemoveIfArrayLists<String> filter = new ForRemoveIfArrayLists<>();
			filter.localvariable = "October";
			stringList.removeIf(filter);
			System.out.println(stringList);
			
//		foreach в коллекции
//		a - здесь как переменная в которую записваю значения массива
//		или for(String a : stringList){System.out.println(a);}
		stringList.forEach((a)->System.out.println(a));	

//		Set element
		stringList.set(1, "October");
		System.out.println(stringList);
		
//		Использование листитератора
		ListIterator<String> listIterator = stringList.listIterator();
		System.out.println(listIterator.next());
		System.out.println(listIterator.hasNext());
		System.out.println(listIterator.previousIndex());
		
//		Сортировка
		java.util.Collections.sort(stringList);		
		System.out.println(stringList);
		
//		Если объявлено List<String> stringList = new ArrayList<String>(4);
//		то методы ArryList не будут видны
		ArrayList<String> stringList1 = new ArrayList<String>(4);
		stringList1.add("September");
		stringList1.add("October");
		stringList1.add("November");
		stringList1.add("December");
		stringList1.add("January");
		stringList1.add("October");
		stringList1.ensureCapacity(10);
		stringList1.trimToSize();
		System.out.println(stringList1);
		
	}
}
