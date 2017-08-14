package com.data.structure.link;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void test() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(22);
		list.insertFirst(44);
		list.insertFirst(66);
		
		list.insertLast(11);
		list.insertLast(33);
		list.insertLast(55);
		
		list.displayForward();
		list.displayBackground();
		
		list.deleteFirst();
		list.deleteLast();
		list.deleteByKey(11);
		
		list.displayForward();
		
		list.insertAfter(22, 77);
		list.insertAfter(33, 88);
		
		list.displayForward();
	}

}
