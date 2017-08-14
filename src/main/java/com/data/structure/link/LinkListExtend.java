package com.data.structure.link;
/**
 * 单链表
 * @author: zhaoyl
 * @since: 2017年8月14日  下午1:36:01
 * @history:
 */
public class LinkListExtend {

	private LinkExtend first;
	
	public LinkExtend getFirst() {
		return first;
	}

	public void setFirst(LinkExtend first) {
		this.first = first;
	}
	
	public LinkListIterator getIterator(){
		return new LinkListIterator(this);
	}

	public LinkListExtend(){
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void displayList(){
		LinkExtend current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}

class LinkExtend {

	public long data;
	public LinkExtend next;
	
	public LinkExtend(long data){
		this.data = data;
	}
	
	public void displayLink(){
		System.out.print(data + " ");
	}
	
}
