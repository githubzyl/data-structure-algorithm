package com.data.structure.link;

/**
 * 有序链表
 * 
 * @author: zhaoyl
 * @since: 2017年8月14日 下午1:08:15
 * @history:
 */
public class SortLinkList {

	private SortLink first;

	public SortLinkList() {
		first = null;
	}
	
	public SortLinkList(SortLink[] links){
		first = null;
		for(int j = 0 ; j < links.length ; j++){
			insert(links[j]);
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(long data) {
		SortLink newLink = new SortLink(data);
		SortLink previous = null;
		SortLink current = first;
		while(current != null && data > current.data){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			first = newLink;
		}else{
			previous.next = newLink;
		}
		newLink.next = current;
	}
	
	public void insert(SortLink link){
		SortLink previous = null;
		SortLink current = first;
		while(current != null && link.data > current.data){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			first = link;
		}else{
			previous.next = link;
		}
		link.next = current;
	}

	public SortLink remove() {
		SortLink temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.print("List (first --> last): ");
		SortLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

}

class SortLink {

	public long data;
	public SortLink next;

	public SortLink(long data) {
		this.data = data;
	}

	public void displayLink() {
		System.out.print(data + " ");
	}

}
