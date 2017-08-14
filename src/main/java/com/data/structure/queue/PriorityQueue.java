package com.data.structure.queue;

/**
 * 优先级队列（先进先出）
 * 
 * @author: zhaoyl
 * @since: 2017年8月11日 下午3:19:06
 * @history:
 */
public class PriorityQueue {

	private int maxSize;
	private long[] queueArray;
	private int nItems;

	public PriorityQueue(int size) {
		maxSize = size;
		queueArray = new long[size];
		nItems = 0;
	}

	public void insert(long item) {
		int j;
		if(nItems == 0){
			queueArray[nItems++] = item;
		}else{
			for(j = nItems - 1; j >= 0 ; j--){
				if(item > queueArray[j]){
					queueArray[j+1] = queueArray[j];
				}else{
					break;
				}
			}
			queueArray[j+1] = item;
			nItems++;
		}
	}

	public long remove() {
		return queueArray[--nItems];
	}

	public long peekMin() {
		return queueArray[nItems-1];
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	public int size() {
		return nItems;
	}
	
}
