package com.bridgelabz.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSearchOperation {

	@Test
	public void givenKeyWhenSearchedShouldPassLinkedListResult() {
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

		// To append elements
		myLinkedList.append(56);
		myLinkedList.append(70);
		myLinkedList.append(25);
		myLinkedList.append(30);
		myLinkedList.append(10);
		myLinkedList.append(18);
		
		int index = myLinkedList.search(25);//Search key 25
		int expected = 2;
		assertEquals(expected,index);
	}

}
