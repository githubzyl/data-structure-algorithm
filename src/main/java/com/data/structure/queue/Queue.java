package com.data.structure.queue;

/**
 * 队列（先进先出）
 * 
 * @author: zhaoyl
 * @since: 2017年8月11日 下午3:19:06
 * @history:
 */
public class Queue<T> {

	private int maxSize;
	private T[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		maxSize = size;
		queueArray = (T[]) new Object[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(T t) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queueArray[++rear] = t;
		nItems++;
	}

	public T remove() {
		T temp = queueArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public T peekFront() {
		return queueArray[front];
	}

	public T peekRear(){
		return queueArray[rear];
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
