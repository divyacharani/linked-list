package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNode {

	@Test
	public void givenIntegersLinkedLisTestShouldAssertTrue() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		firstNode.setNext(secondNode);
		boolean result = firstNode.getNext().equals(secondNode);
		assertTrue(result);

	}
}
