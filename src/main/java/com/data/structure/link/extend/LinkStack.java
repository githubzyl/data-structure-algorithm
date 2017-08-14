package com.data.structure.link.extend;

/**
 * 单链表实现的栈
 * @author: zhaoyl
 * @since: 2017年8月14日  上午11:05:27
 * @history:
 */
public class LinkStack<T> {

	private StackLinkList<T> linkList;
	
	public LinkStack(){
		linkList = new StackLinkList<>();
	}
	
	public void push(T data){
		linkList.insertFirst(data);
	}
	
	public T pop(){
		return linkList.deleteFirst();
	}
	
	public boolean isEmpty(){
		return linkList.isEmpty();
	}
	
	public void displayStack(){
		System.out.print("Stack (top --> bottom): ");
		linkList.displayList();
	}
	
}

class StackLinkList<T>{
	
	private StackLink<T> first;
	
	public StackLinkList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(T data){
		StackLink<T> newLink = new StackLink<>(data);
		newLink.next = first;
		first = newLink;
	}
	
	public T deleteFirst(){
		StackLink<T> temp = first;
		first = first.next;
		return temp.data;
	}
	
	
	public void displayList(){
		System.out.print("List (first --> last): ");
		StackLink<T> current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class StackLink<T>{
	
	public T data;
	public StackLink<T> next;
	
	public StackLink(T data){
		this.data = data;
	}
	
	public void displayLink(){
		System.out.print(data + " ");
	}
	
}
