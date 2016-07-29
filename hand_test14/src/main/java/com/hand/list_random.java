package com.hand;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class list_random {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>( );
		
		Map<Integer,Object> map=new HashMap<Integer,Object>();
		int j=0;
		int a[]=new int[50];
		for(int i=0;i<50;i++)
		{
			a[i]=(int)(Math.random()*100);
			list.add(a[i]);
			j=a[i]/10;
			map.put(j, a[i]);
		}
		System.out.println("随机生成的50个数为：");
		java.util.Iterator<Integer> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
