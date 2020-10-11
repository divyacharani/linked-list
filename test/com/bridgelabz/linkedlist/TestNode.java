package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNode {

	@Test
	public void givenIntegersLinkedLisTestShouldAssertTrue() {
		Node<Integer> firstNode = new Node<Integer>(30);
		Node<Integer> secondNode = new Node<Integer>(70);
		firstNode.setNext(secondNode);
		boolean result = firstNode.getNext().equals(secondNode);
		assertTrue(result);

	}
}
