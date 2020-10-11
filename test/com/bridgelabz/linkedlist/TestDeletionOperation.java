package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeletionOperation {

	@Test
	public void givenKeyAfterInsertionShouldPassLinkedListResult() {
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		// To append elements
		myLinkedList.append(56);
		myLinkedList.append(30);
		myLinkedList.append(40);
		myLinkedList.append(70);
		
		//To delete key 40
		myLinkedList.deleteKey(40);

		int result = myLinkedList.getLength();
		int expected = 3;
		assertEquals(expected, result);
	}
}
