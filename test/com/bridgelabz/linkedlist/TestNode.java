package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNode {

	@Test
	public void givenIntegersLinkedLisTestShouldAssertTrue() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && firstNode.getNext().getNext().equals(thirdNode);
		assertTrue(result);

	}
}
