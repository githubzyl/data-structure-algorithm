package com.data.structure.link;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class LinkListExtendTest {

	@Test
	public void test() throws IOException {
		LinkListExtend linkListExtend = new LinkListExtend();
		LinkListIterator iterator = linkListExtend.getIterator();
		long value;
		
		iterator.insertAfter(20);
		iterator.insertAfter(40);
		iterator.insertAfter(60);
		iterator.insertBefore(80);
		
		while(true){
			System.out.print("Enter first letter of show, reset, ");
			System.out.print("next, get ,before, after, delete: ");
			System.out.flush();
			char choice = getChar();
			switch (choice) {
				case 's':
					if(!linkListExtend.isEmpty()){
						linkListExtend.displayList();
					}else{
						System.out.println("List is empty");
					}
					break;
				case 'r':
					iterator.reset();
					break;
				case 'n':
					if(!linkListExtend.isEmpty() && !iterator.atEnd()){
						iterator.nextLink();
					}else{
						System.out.println("Can not got to next link");
					}
					break;
				case 'g':
					if(!linkListExtend.isEmpty()){
						value = iterator.getCurrent().data;
						System.out.println("Returned " + value);
					}else{
						System.out.println("List is empty");
					}
					break;
				case 'b':
					System.out.println("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iterator.insertBefore(value);
					break;
				case 'a':
					System.out.println("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iterator.insertAfter(value);
					break;
				case 'd':
					if(!linkListExtend.isEmpty()){
						value = iterator.deleteCurrent();
						System.out.println("Deleted " + value);
					}else{
						System.out.println("Can not delete");
					}
					break;
				default:
					System.out.println("Invalid entry");
					break;
			}
		}
	}
	
	@Test
	public void testIterator(){
		LinkListExtend linkListExtend = new LinkListExtend();
		LinkListIterator iterator = linkListExtend.getIterator();
		
		iterator.insertAfter(21);
		iterator.insertAfter(40);
		iterator.insertAfter(30);
		iterator.insertAfter(7);
		iterator.insertAfter(45);
		
		linkListExtend.displayList();
		
		iterator.reset();
		LinkExtend link = iterator.getCurrent();
		if(link.data % 3 == 0){
			iterator.deleteCurrent();
		}
		while(!iterator.atEnd()){
			iterator.nextLink();
			link = iterator.getCurrent();
			if(link.data % 3 == 0){
				iterator.deleteCurrent();
			}
		}
		linkListExtend.displayList();
	}
	
	public static String getString() throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String s = bufferedReader.readLine();
		return s;
	}

	private static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	
	private static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}

}
