package com.data.algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 递归示例：变位字
 * 
 * @author: zhaoyl
 * @since: 2017年8月14日 下午4:59:17
 * @history:
 */
public class Anagram {

	static int size;
	static int count;
	static char[] arrChar = new char[100];

	public static void doAnagram(int newSize) {
		if (newSize == 1) {
			return;
		}
		for (int j = 0; j < newSize; j++) {
			doAnagram(newSize - 1);
			if (newSize == 2) {
				displayWord();
			}
			rotate(newSize);
		}
	}

	private static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		for (j = position + 1; j < size; j++) {
			arrChar[j-1] = arrChar[j];
		}
		arrChar[j-1] = temp;
	}

	private static void displayWord() {
		if (count < 99) {
			System.out.print(" ");
		}
		if (count < 9) {
			System.out.print(" ");
		}
		System.out.print(++count + " ");
		for (int j = 0; j < size; j++) {
			System.out.print(arrChar[j]);
		}
		System.out.print("   ");
		System.out.flush();
		if (count % 6 == 0) {
			System.out.println("");
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.print("Enter a word : ");
		String input = getString();
		size = input.length();
		count = 0;
		for (int j = 0; j < size; j++) {
			arrChar[j] = input.charAt(j);
		}
		doAnagram(size);
	}

	public static String getString() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String s = bufferedReader.readLine();
		return s;
	}

}
