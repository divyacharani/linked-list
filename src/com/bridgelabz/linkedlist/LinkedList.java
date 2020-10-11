package com.bridgelabz.linkedlist;

public class LinkedList<K> {

	Node<K> head;
	Node<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Method to add element at first
	public void addFirst(K key) {
		Node<K> newNode = new Node<K>(key);
		if (tail == null) {
			tail = newNode;
		}
		if (head == null) {
			head = newNode;
		} else {
			Node<K> tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}
	}

	// Method to print linked list
	public void printLinkedList() {
		System.out.println("Linked List");
		Node<K> node = head;
		while (node.getNext() != null) {
			System.out.print(node.getKey());
			if (!(node.equals(tail))) {
				System.out.print("->");
			}
			node = node.getNext();
		}
		System.out.print(node.getKey());
	}
}
