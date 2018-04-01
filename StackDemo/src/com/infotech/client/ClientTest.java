package com.infotech.client;

import java.util.Stack;

public class ClientTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("isEmpty:"+stack.empty());
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.push(600);
		System.out.println(stack);
		System.out.println("-------------------");
		System.out.println("isEmpty:"+stack.empty());
		System.out.println("-------------------");
		
		Integer peek = stack.peek();
		System.out.println("Peek Element:"+peek);
		System.out.println("-------------------");
		
		int search = stack.search(200);
		System.out.println("Item 200 found at index:"+search);
		System.out.println("-------------------");
		Integer pop = stack.pop();
		System.out.println("Popped Element:"+pop);
		System.out.println(stack);
		
	}

}
