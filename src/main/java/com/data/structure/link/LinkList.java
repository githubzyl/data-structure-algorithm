package com.data.structure.link;

public class LinkList {

	private Link first;
	
	public LinkList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int iData, double dData){
		Link newLink = new Link(iData, dData);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link find(int key){
		Link current = first;
		while(current.iData != key){
			current.displayLink();
			if(current.next == null){
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	public Link delete(int key){
		Link current = first;
		Link previous = first;
		while(current.iData != key){
			current.displayLink();
			if(current.next == null){
				return null;
			}
			previous = current;
			current = current.next;
		}
		if(current == first){
			first = first.next;
		}else{
			previous.next = current.next;
		}
		return current;
	}
	
	public void displayList(){
		System.out.print("List (first --> last): ");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}

class Link {

	public int iData;
	public double dData;
	public Link next;
	
	public Link(int iData, double dData){
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink(){
		System.out.print("{" + iData + "," + dData + "}");
	}
	
}
