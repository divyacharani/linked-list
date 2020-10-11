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

	// Method to append linked list
	public void append(K key) {
		Node<K> newNode = new Node<K>(key);
		if (tail == null) {
			tail = newNode;
		}
		if (head == null) {
			head = newNode;
		} else {
			Node<K> tempNode = tail;
			tempNode.setNext(newNode);
			tail = newNode;
		}
	}

	// Method to insert element at the givin index
	public void insert(int index, K key) {
		if (index == 0) {
			addFirst(key);
		} else if (index == getLength()) {
			append(key);
		} else if (index > getLength()) {
			System.out.println("Index is out of bound");
		} else if (index < getLength()) {
			Node<K> newNode = new Node<K>(key);
			Node<K> tempNode = head;
			for (int i = 0; i <= index - 2; i++) {
				tempNode = tempNode.getNext();
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
	}

	// Method to get length of linked list
	public int getLength() {
		int length = 0;
		Node<K> node = head;
		while (node.getNext() != null) {
			length++;
			node = node.getNext();
		}
		return length + 1;
	}

	// Method to delete first element
	public K pop() {
		Node<K> tempNode = head;
		head = head.getNext();
		return tempNode.getKey();
	}

	// Method to delete last element
	public K popLast() {
		K element = null;
		Node<K> tempNode = head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
			element = tempNode.getNext().getKey();
		}
		tail = tempNode;
		tempNode.setNext(null);
		return element;

	}

	// Method to search linked list with given key
	public int search(K key) {
		int index = 0;
		Node<K> tempNode = head;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key))
				break;
			tempNode = tempNode.getNext();
			index++;
		}
		return index;
	}

	// Method to add element after a given key
	public void insertAfterKey(K key1, K key2) {
		insert(search(key1)+1, key2);
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
