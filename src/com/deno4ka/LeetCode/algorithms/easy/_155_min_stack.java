package com.deno4ka.LeetCode.algorithms.easy;

import java.util.LinkedList;

public class _155_min_stack {

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	getMin() -- Retrieve the minimum element in the stack.
Example:
	MinStack minStack = new MinStack();
	minStack.push(-2);
	minStack.push(0);
	minStack.push(-3);
	minStack.getMin();   --> Returns -3.
	minStack.pop();
	minStack.top();      --> Returns 0.
	minStack.getMin();   --> Returns -2.
*/

	private LinkedList<Integer> queue;

	/** initialize your data structure here. */
	public _155_min_stack() {
		queue = new LinkedList<>();
	}

	public void push(int x) {
		queue.add(x);
	}

	public void pop() {
		queue.removeLast();
	}

	public int top() {
		return queue.getLast();
	}

	public int getMin() {
		return queue.stream().min(Integer::compare).get();
	}

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */