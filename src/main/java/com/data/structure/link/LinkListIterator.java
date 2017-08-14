package com.data.structure.link;
/**
 * 迭代器
 * @author: zhaoyl
 * @since: 2017年8月14日  下午2:23:54
 * @history:
 */
public class LinkListIterator {

	private LinkExtend current;
	private LinkExtend previous;
	private LinkListExtend linkList;
	
	public LinkListIterator(LinkListExtend linkList) {
		this.linkList = linkList;
		reset();
	}

	public void reset() {
		current = linkList.getFirst();
		previous = null;
	}
	
	public boolean atEnd(){
		return current.next == null;
	}
	
	public void nextLink(){
		previous = current;
		current = current.next;
	}
	
	public LinkExtend getCurrent(){
		return current;
	}
	
	public void insertAfter(long data){
		LinkExtend link = new LinkExtend(data);
		if(linkList.isEmpty()){
			linkList.setFirst(link);
			current = link;
		}else{
			link.next = current.next;
			current.next = link;
			nextLink();
		}
	}
	
	public void insertBefore(long data){
		LinkExtend link = new LinkExtend(data);
		if(previous == null){
			link.next = linkList.getFirst();
			linkList.setFirst(link);
			reset();
		}else{
			link.next = previous.next;
			previous.next = link;
			current = link;
		}
	}
	
	public long deleteCurrent(){
		long value = current.data;
		if(previous == null){
			linkList.setFirst(current.next);
			reset();
		}else{
			previous.next = current.next;
			if(atEnd()){
				reset();
			}else{
				current = current.next;
			}
		}
		return value;
	}

}
