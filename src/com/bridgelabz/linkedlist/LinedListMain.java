package com.bridgelabz.linkedlist;

public class LinedListMain {

	public static void main(String[] args) {

		// Welcome message
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		
		//To append elements
		myLinkedList.append(56);
		myLinkedList.append(30);
		myLinkedList.append(70);
		
		//To print the linked list
		myLinkedList.printLinkedList();

	}
}
