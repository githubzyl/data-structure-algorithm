package com.data.structure.stack.example;

import com.data.structure.stack.StackX;

/**
 * 栈实例：单词逆序
 * @author: zhaoyl
 * @since: 2017年8月11日  下午1:57:48
 * @history:
 */
public class Reverser {

	private String input;
	private String output;
	
	public Reverser(String in){
		input = in;
	}
	
	public String doRev(){
		int stackSise = input.length();
		StackX<Object> stack = new StackX<Object>(stackSise);
		
		for(int j = 0 ; j < input.length() ; j++){
			char ch = input.charAt(j);
			stack.push(ch);
		}
		output = "";
		while(!stack.isEmpty()){
			char ch = (char) stack.pop();
			output = output + ch;
		}
		return output;
	}
	
}
