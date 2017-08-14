package com.data.algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 递归示例：三角数字
 * @author: zhaoyl
 * @since: 2017年8月14日  下午4:32:31
 * @history:
 */
public class Factorial {

	public static int factorial(int n){
		System.out.println("Entering : n =" + n);
		if(n == 0){
			System.out.println("Return 1");
			return 1;
		}else{
			int temp = n*factorial(n-1);
			System.out.println("Return " + temp);
			return temp;
		}
	}
	
	static int number;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number: ");
		number = getInt();
		int answer = factorial(number);
		System.out.println("Triangle=" + answer);
	}
	
	public static String getString() throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String s = bufferedReader.readLine();
		return s;
	}
	
	private static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}
	
}
