package com.data.structure.link.extend;

import org.junit.Test;

public class LinkStackTest {

	@Test
	public void test() {
		LinkStack<Integer> linkStack = new LinkStack<>();
		linkStack.push(20);
		linkStack.push(40);
		
		linkStack.displayStack();
		
		linkStack.push(60);
		linkStack.push(80);
		
		linkStack.displayStack();
		
		linkStack.pop();
		linkStack.pop();
		
		linkStack.displayStack();
	}

}
