package com.data.structure.stack.example;
/**
 * 计算后缀表达式的值
 * @author: zhaoyl
 * @since: 2017年8月14日  上午9:21:00
 * @history:
 */
public class ParsePost {

	private ParsePostStack stack;
	private String input;
	
	public ParsePost(String s){
		input = s;
	}
	
	public int doParse(){
		stack = new ParsePostStack(20);
		char ch;
		int j;
		int num1, num2, interAns;
		for(j = 0 ; j < input.length() ; j++){
			ch = input.charAt(j);
			stack.displayStack("" + ch + " ");
			if(ch >= '0' && ch <= '9'){
				stack.push((int)(ch-'0'));
			}else{
				num2 = stack.pop();
				num1 = stack.pop();
				switch (ch) {
					case '+':
						interAns = num1 + num2;
						break;
					case '-':
						interAns = num1 - num2;
						break;
					case '*':
						interAns = num1 * num2;
						break;
					case '/':
						interAns = num1 / num2;
						break;
					default:
						interAns = 0;
						break;
				}
				stack.push(interAns);
			}
		}
		interAns = stack.pop();
		return interAns;
	}
	
}

class ParsePostStack{
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public ParsePostStack(int size){
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public void push(int j){
		stackArray[++top] = j;
	}
	
	public int pop(){
		return stackArray[top--];
	}
	
	public int peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int size(){
		return top+1;
	}
	
	public int peekN(int n){
		return stackArray[n];
	}
	
	public void displayStack(String s){
		System.out.print(s);
		System.out.print("Stack [bottom --> top]：");
		for(int j = 0 ; j < size() ; j++){
			System.out.print(peekN(j));
			System.out.print(' ');
		}
		System.out.println("");
	}
	
}
