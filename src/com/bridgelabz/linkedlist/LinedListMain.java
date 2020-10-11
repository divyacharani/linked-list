package com.bridgelabz.linkedlist;

public class LinedListMain {

	public static void main(String[] args) {

		// Welcome message
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

		// To append elements
		myLinkedList.append(56);
		myLinkedList.append(30);
		myLinkedList.append(40);
		myLinkedList.append(70);

		//Linked list
		myLinkedList.printLinkedList();
		System.out.println("Size before deletion is "+myLinkedList.getLength());

		//To delete 40 when key 30 is given
		myLinkedList.deleteKey(40);
		System.out.println();
		System.out.println("Size after deletion is "+myLinkedList.getLength());
		System.out.println("After deletion");
		myLinkedList.printLinkedList();
		
		
	}
}
