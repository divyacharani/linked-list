package com.bridgelabz.linkedlist;

public class LinedListMain {

	public static void main(String[] args) {

		// Welcome message
		System.out.println("Welcome to linked list program");
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

		// To append elements
		myLinkedList.append(56);
		myLinkedList.append(70);
		myLinkedList.append(25);
		myLinkedList.append(30);
		myLinkedList.append(10);
		myLinkedList.append(18);

		//Linked list
		myLinkedList.printLinkedList();
		System.out.println();

		int index = myLinkedList.search(25);
		if(index!= myLinkedList.getLength()-1)
		System.out.println("The index of given key is "+index);
		else
			System.out.println("There is no node with given key");
	}
}
