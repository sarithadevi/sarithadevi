package org.list.com;

import java.util.LinkedList;

public class LinkedListLength {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		
		int siz = li.size();
		System.out.println(siz);
		
	}

}
