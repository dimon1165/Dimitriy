package learn.java.home.Collections;

import java.util.TreeSet;

public class TreeSetLearn {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("10");
		treeSet.add("14");
		treeSet.add("11");
		treeSet.add("15");
		treeSet.add("18");
		treeSet.add("32");
		treeSet.add("/u01");
		treeSet.add("/u001");
		System.out.println(treeSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
//		Возвращает �?лемент из ма�?�?ива больший, чем 
//		заданное чи�?ло
		System.out.println(treeSet.ceiling("17"));
		
//		Возвращает �?лемент из ма�?�?ива меньший, чем 
//		заданное чи�?ло
		System.out.println(treeSet.floor("17"));
		
//		Возвращает в�?е �?лементы из ма�?�?ива меньший, чем 
//		заданное чи�?ло
		System.out.println(treeSet.headSet("15"));
		
//		Возвращает в�?е �?лементы из ма�?�?ива больше, чем 
//		заданное чи�?ло
		System.out.println(treeSet.tailSet("15"));
	}
}
