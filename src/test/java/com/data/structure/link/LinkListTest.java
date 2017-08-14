package com.data.structure.link;

import org.junit.Test;

public class LinkListTest {

	@Test
	public void test() {
		LinkList linkList = new LinkList();
		linkList.insertFirst(22, 2.99);
		linkList.insertFirst(44, 4.99);
		linkList.insertFirst(66, 6.99);
		linkList.insertFirst(88, 8.99);
		
		linkList.displayList();
		
		Link f = linkList.find(44);
		if(f != null){
			System.out.println("Found link with key " + f.iData);
		}else{
			System.out.println("Can not find link");
		}
		
		Link d = linkList.find(12);
		if(d != null){
			System.out.println("Deleted link with key " + d.iData);
		}else{
			System.out.println("Can not delete link");
		}
		
//		while(!linkList.isEmpty()){
//			Link alink = linkList.deleteFirst();
//			System.out.print("Deleted ");
//			alink.displayLink();
//			System.out.println("");
//		}
//		linkList.displayList();
	}

}
