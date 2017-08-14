package com.data.structure.link.extend;

/**
 * 双端链表实现的队列
 * @author: zhaoyl
 * @since: 2017年8月14日  上午11:05:27
 * @history:
 */
public class LinkQueue<T> {

	private QueueLinkList<T> linkList;
	
	public LinkQueue(){
		linkList = new QueueLinkList<>();
	}
	
	public void insert(T data){
		linkList.insertLast(data);
	}
	
	public T remove(){
		return linkList.deleteFirst();
	}
	
	public boolean isEmpty(){
		return linkList.isEmpty();
	}
	
	public void displayQueue(){
		System.out.print("Queue (front --> rear): ");
		linkList.displayList();
	}
	
}

class QueueLinkList<T>{
	
	private QueueLink<T> first;
	private QueueLink<T> last;
	
	public QueueLinkList(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertLast(T data){
		QueueLink<T> newLink = new QueueLink<>(data);
		if(isEmpty()){
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
	}
	
	public T deleteFirst(){
		T temp = first.data;
		if(first.next == null){
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	
	public void displayList(){
		System.out.print("List (first --> last): ");
		QueueLink<T> current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class QueueLink<T>{
	
	public T data;
	public QueueLink<T> next;
	
	public QueueLink(T data){
		this.data = data;
	}
	
	public void displayLink(){
		System.out.print(data + " ");
	}
	
}
