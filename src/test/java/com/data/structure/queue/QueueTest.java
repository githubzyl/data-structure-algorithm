package com.data.structure.queue;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test() {
		Queue<Integer> queue = new Queue<>(5);
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		
		queue.remove();
		queue.remove();
		queue.remove();
		
		queue.insert(50);
		queue.insert(60);
		queue.insert(70);
		queue.insert(80);
		
		while(!queue.isEmpty()){
			Integer value = queue.remove();
			System.out.println(value);
		}
		
	}
	
	@Test
	public void testPriorityQueue() {
		PriorityQueue queue = new PriorityQueue(5);
		
		queue.insert(30);
		queue.insert(50);
		queue.insert(10);
		queue.insert(40);
		queue.insert(20);
		
		while(!queue.isEmpty()){
			long value = queue.remove();
			System.out.println(value);
		}
		
	}
	
	@Test
	public void sortArray() {
		int[] array = new int[5];
		array[0] = 20;
		array[1] = 40;
		array[2] = 10;
		array[3] = 30;
		array[4] = 30;
		PriorityQueue queue = new PriorityQueue(array.length);
		for(int i = 0 ; i < array.length ; i++){
			queue.insert(array[i]);
		}
		array = new int[5];
		for(int i = 0 ; i < 5 ; i++){
			array[i] = (int) queue.peekMin();
		}
		for(int k : array){
			System.out.println(k);
		}
	}

}
