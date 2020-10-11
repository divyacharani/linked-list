package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionOperation {

	@Test
	public void givenKeyAfterInsertionShouldPassLinkedListResult() {
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		// To append elements
		myLinkedList.append(56);
		myLinkedList.append(30);
		myLinkedList.append(70);
		myLinkedList.insertAfterKey(30, 40);
		
		int result = myLinkedList.search(40)-myLinkedList.search(30);
		int expected = 1;
		assertEquals(expected,result);
	}

}
