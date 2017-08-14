package com.data.structure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.data.structure.stack.example.InfixExpression;
import com.data.structure.stack.example.ParsePost;
import com.data.structure.stack.example.Reverser;

public class StackXTest {

	@Test
	public void test() {
		StackX<Integer> stack = new StackX<Integer>(10);
		stack.push(20);
		stack.push(40);
		stack.push(60);
		stack.push(80);
		
		while(!stack.isEmpty()){
			long value = stack.pop();
			System.out.println(value);
		}
	}
	
	@Test
	public void testReverser() throws IOException{
		String input, output;
		while(true){
			System.out.println("Enter a string:");
			System.out.flush();
			input = getString();
			if("".equals(input)){
				break;
			}
			Reverser reverser = new Reverser(input);
			output = reverser.doRev();
			System.out.println("Reversed:" + output);
		}
	}
	
	@Test
	public void testInfixExpression() throws IOException{
		String input, output;
		while(true){
			System.out.println("Enter infix:");
			System.out.flush();
			input = getString();
			if("".equals(input)){
				break;
			}
			InfixExpression expression = new InfixExpression(input);
			output = expression.doTranas();
			System.out.println("Postfix is " + output + "\n");
		}
	}
	
	@Test
	public void testParsePost() throws IOException{
		String input;
		int output;
		while(true){
			System.out.println("Enter infix:");
			System.out.flush();
			input = getString();
			if("".equals(input)){
				break;
			}
			InfixExpression expression = new InfixExpression(input);
			input = expression.doTranas();
			ParsePost parsePost = new ParsePost(input);
			output = parsePost.doParse();
			System.out.println("Postfix is " + output + "\n");
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String s = bufferedReader.readLine();
		return s;
	}

}
