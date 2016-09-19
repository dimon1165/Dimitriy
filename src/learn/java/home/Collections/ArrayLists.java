package learn.java.home.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
	public static void main(String[] args) {
//		Кон�?труктор ли�?та может назначать базовую длинну - 10 �?лементов к примеру
		List<String> stringList = new ArrayList<String>(4);
		stringList.add("September");
		stringList.add("October");
		stringList.add("November");
		stringList.add("December");
		stringList.add("January");
		stringList.add("October");
//		размер 
		System.out.println(stringList.size());
		
//		получить по индек�?у �?лемент
		System.out.println(stringList.get(3));
		
//		проверить е�?ть ли в ли�?те значение true/false
		System.out.println(stringList.contains("October"));
		
//		очи�?тить ма�?�?ив
//		stringList.clear();
//		System.out.println(stringList);
		
//		удаление �?лемета из ма�?�?ива
		stringList.remove(3);
		System.out.println(stringList);

//		возвращает индек�? �?лемента
		System.out.println(stringList.indexOf("October"));
		
//		возвращает индек�? по�?ледний раз в�?тречающего�?�? �?лемента 
		System.out.println(stringList.lastIndexOf("October"));
		
		
//      удалит в�?е в�?третившие�?�? значени�? October
//		дл�? �?того был �?оздан доп кла�?�? который импл. интерфей�?
//		и переопределил методж те�?т
			ForRemoveIfArrayLists<String> filter = new ForRemoveIfArrayLists<>();
			filter.localvariable = "October";
			stringList.removeIf(filter);
			System.out.println(stringList);
			
//		foreach в коллекции
//		a - зде�?ь как переменна�? в которую запи�?ваю�?�? значени�? ма�?�?ива
//		или for(String a : stringList){System.out.println(a);}
		stringList.forEach((a)->System.out.println(a));	

//		Set element
		stringList.set(1, "October");
		System.out.println(stringList);
		
//		И�?пользование ли�?титератора
		ListIterator<String> listIterator = stringList.listIterator();
		System.out.println(listIterator.next());
		System.out.println(listIterator.hasNext());
		System.out.println(listIterator.previousIndex());
		
//		Сортировка
		java.util.Collections.sort(stringList);		
		System.out.println(stringList);
		
//		Е�?ли объ�?влено List<String> stringList = new ArrayList<String>(4);
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
