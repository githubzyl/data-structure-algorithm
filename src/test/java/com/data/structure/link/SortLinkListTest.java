package com.data.structure.link;

import org.junit.Test;

public class SortLinkListTest {

	@Test
	public void test() {
		SortLinkList sortLinkList = new SortLinkList();
		
		sortLinkList.insert(20);
		sortLinkList.insert(40);
		
		sortLinkList.displayList();
		
		sortLinkList.insert(10);
		sortLinkList.insert(30);
		sortLinkList.insert(50);
		
		sortLinkList.displayList();
		
		sortLinkList.remove();
		
		sortLinkList.displayList();
		
	}
	
	@Test
	public void testSortArray(){
		int size = 10;
		SortLink[] links = new SortLink[size];
		for(int j = 0 ; j < size; j++){
			int n = (int) (Math.random()*99);
			SortLink link = new SortLink(n);
			links[j] = link;
		}
		System.out.print("Unsorted Array: ");
		for(int j = 0 ; j < size ; j++){
			System.out.print(links[j].data + " ");
		}
		System.out.println("");
		SortLinkList sortLinkList = new SortLinkList(links);
		for(int j = 0 ; j < size; j++){
			links[j] = sortLinkList.remove();
		}
		System.out.print("Sorted Array: ");
		for(int j = 0 ; j < size; j++){
			System.out.print(links[j].data + " ");
		}
	}
	
}
