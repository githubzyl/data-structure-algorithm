package com.data.structure.stack.example;

/**
 * 通过中缀原则解析算术表达式
 * @author: zhaoyl
 * @since: 2017年8月11日  下午4:13:40
 * @history:
 */
public class InfixExpression {

	private InfixExpressionStack stack;
	private String input;
	private String output = "";
	
	public InfixExpression(String in){
		input = in;
		int stackSize = input.length();
		stack = new InfixExpressionStack(stackSize);
	}
	
	public String doTranas(){
		for(int j = 0 ; j < input.length() ; j++){
			char ch = input.charAt(j);
			stack.displayStack("For " + ch + " ");
			switch (ch) {
				case '+': 
				case '-': getOper(ch, 1); break;
				case '*': 
				case '/': getOper(ch, 2); break;
				case '(': stack.push(ch); break;
				case ')': getParen(); break;
				default:
					output = output + ch;
					break;
			}
		}
		while(!stack.isEmpty()){
			stack.displayStack("while ");
			output = output + stack.pop();
		}
		stack.displayStack("End ");
		return output;
	}
	
	public void getOper(char opThis, int prec1){
		while(!stack.isEmpty()){
			char opTop = stack.pop();
			if('(' == opTop){
				stack.push(opTop);
				break;
			}else{
				int prec2;
				if('+' == opTop || '-' == opTop){
					prec2 = 1;
				}else{
					prec2 = 2;
				}
				if(prec2 < prec1){
					stack.push(opTop);
					break;
				}else{
					output = output + opTop;
				}
			}
		}
		stack.push(opThis);
	}
	
	public void getParen(){
		while(!stack.isEmpty()){
			char chx = stack.pop();
			if('(' == chx){
				break;
			}else{
				output = output + chx;
			}
		}
	}
	
	
}
class InfixExpressionStack{
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public InfixExpressionStack(int size){
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j){
		stackArray[++top] = j;
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int size(){
		return top+1;
	}
	
	public char peekN(int n){
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
