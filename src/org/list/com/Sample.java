package org.list.com;

import java.util.*;
public class Sample{
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		
		
		for(int i=0;i<li.size();i++)
	   {
	      System.out.println(li.get(i));
		}
		
//		for(Integer x:li)
//		{
//			System.out.println(x);
//		}
	}
}

