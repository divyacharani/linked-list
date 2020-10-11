package com.bridgelabz.linkedlist;

public class LinedListMain {

	public static void main(String[] args) {

		// Welcome message
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

		// To append elements
		myLinkedList.append(56);
		myLinkedList.append(70);

		// To insert between 56 and 70
		myLinkedList.insert(1, 30);

		// Linked list before deletion
		myLinkedList.printLinkedList();
		System.out.println();
		
		int element = myLinkedList.popLast();
		System.out.println(element+" deleted");
		
		//Linked list after deletion
		myLinkedList.printLinkedList();

	}
}
