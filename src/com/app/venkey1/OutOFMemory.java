package com.app.venkey1;

import java.util.LinkedList;

public class OutOFMemory {
	
	public static void main(String[] args) {
		
		String str="anilkumar";
		LinkedList<String> linkedlist= new LinkedList<>();
		
		while(true)
		{
			String str1=str+ "welcome to india";
			linkedlist.add(str1);
		}
		
	}

}
// this outofmemoryerror thrown by java virtualmachine when object cannot be allocated due to
//lack of memory space and also the garbage collector cannot free some space