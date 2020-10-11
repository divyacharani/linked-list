package com.bridgelabz.linkedlist;

public class LinedListMain {

	public static void main(String[] args) {

		// Welcome message
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.addFirst(70);
		myLinkedList.addFirst(30);
		myLinkedList.addFirst(56);
		myLinkedList.printLinkedList();

	}
}
