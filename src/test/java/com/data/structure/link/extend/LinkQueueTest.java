package com.data.structure.link.extend;

import org.junit.Test;

public class LinkQueueTest {

	@Test
	public void test() {
		LinkQueue<Integer> linkQueue = new LinkQueue<>();
		
		linkQueue.insert(20);
		linkQueue.insert(40);
		
		linkQueue.displayQueue();
		
		linkQueue.insert(60);
		linkQueue.insert(80);
		
		linkQueue.displayQueue();
		
		linkQueue.remove();
		linkQueue.remove();
		
		linkQueue.displayQueue();
	}

}
