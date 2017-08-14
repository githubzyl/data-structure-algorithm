package com.data.structure.stack;
/**
 * 栈(后进先出)
 * @author: zhaoyl
 * @since: 2017年8月11日  下午1:35:16
 * @history:
 */
public class StackX<T> {

	private int maxSize;//栈的最大容量
	private T[] stackArray;
	private int top;//栈顶
	
	@SuppressWarnings("unchecked")
	public StackX(int size){
		maxSize = size;
		stackArray = (T[]) new Object[maxSize];
		top = -1;//没有值
	}
	
	public void push(T j){
		stackArray[++top] = j;
	}
	
	public T pop(){
		return stackArray[top--];
	}
	
	public T peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == maxSize - 1;
	}
	
}
