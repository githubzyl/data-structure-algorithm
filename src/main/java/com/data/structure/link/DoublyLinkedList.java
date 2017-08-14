package com.data.structure.link;
/**
 * 双向链表
 * @author: zhaoyl
 * @since: 2017年8月14日  下午1:41:08
 * @history:
 */
public class DoublyLinkedList {

	private DoublyLink first;
	private DoublyLink last;
	
	public DoublyLinkedList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(long data){
		DoublyLink doublyLink = new DoublyLink(data);
		if(isEmpty()){
			last = doublyLink;
		}else{
			first.previous = doublyLink;
		}
		doublyLink.next = first;
		first = doublyLink;
	}
	
	public void insertLast(long data){
		DoublyLink doublyLink = new DoublyLink(data);
		if(isEmpty()){
			first = doublyLink;
		}else{
			last.next = doublyLink;
			doublyLink.previous = last;
		}
		last = doublyLink;
	}
	
	public DoublyLink deleteFirst(){
		DoublyLink temp = first;
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public DoublyLink deleteLast(){
		DoublyLink temp = last;
		if(first.next == null){
			first = null;
		}else{
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	public boolean insertAfter(long key, long data){
		DoublyLink current = first;
		while(current.data != key){
			current = current.next;
			if(current == null){
				return false;
			}
		}
		DoublyLink newLink = new DoublyLink(data);
		if(current == last){
			newLink.next = null;
			last = newLink;
		}else{
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}
	
	public DoublyLink deleteByKey(long key){
		DoublyLink current = first;
		while(current.data != key){
			current = current.next;
			if(current == null){
				return null;
			}
		}
		if(current == first){
			first = current.next;
		}else{
			current.previous.next = current.next;
		}
		if(current == last){
			last = current.previous;
		}else{
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public void displayForward(){
		System.out.print("List (first --> last): ");
		DoublyLink current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayBackground(){
		System.out.print("List (last --> first): ");
		DoublyLink current = last;
		while(current != null){
			current.displayLink();
			current = current.previous;
		}
		System.out.println("");
	}
	
	
	
}

class DoublyLink{
	
	public long data;
	public DoublyLink next;
	public DoublyLink previous;
	
	public DoublyLink(long data){
		this.data = data;
	}
	
	public void displayLink() {
		System.out.print(data + " ");
	}
	
}