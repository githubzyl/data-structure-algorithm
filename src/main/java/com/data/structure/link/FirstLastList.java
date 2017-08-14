package com.data.structure.link;
/**
 * 双端链表
 * @author: zhaoyl
 * @since: 2017年8月14日  下午1:35:49
 * @history:
 */
public class FirstLastList {

	private FirstLastLink first;
	private FirstLastLink last;
	
	public FirstLastList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(long dData){
		FirstLastLink newLink = new FirstLastLink(dData);
		if(isEmpty()){
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(long dData){
		FirstLastLink newLink = new FirstLastLink(dData);
		if(isEmpty()){
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
	}
	
	public long deleteFirst(){
		long temp = first.dData;
		if(first.next == null){
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.print("List (first --> last): ");
		FirstLastLink current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}

class FirstLastLink {

	public long dData;
	public FirstLastLink next;
	
	public FirstLastLink(long dData){
		this.dData = dData;
	}
	
	public void displayLink(){
		System.out.print(dData + " ");
	}
	
}
