package com.algorithms.pack1;

public class MyLinkedList {
	class Node {
		Object ele;
		Node next;

		public Node(Object ele, Node next) {
			super();
			this.ele = ele;
			this.next = next;
		}
	}

	private Node first = null;
	private int count = 0;

	public void add(Object ele) {
		if (first == null) {
			first = new Node(ele, null);
			count++;
			return;
		}
		Node curr = first;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(ele, null);
		count++;
		return;
	}

	public int size() {
		return count;
	}

	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}

	public void add(int index, Object ele) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			first = new Node(ele, first);
			count++;
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = new Node(ele, curr.next);
		count++;
	}

	public void clear() {
		first = null;
		count = 0;
	}

	public void remove(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			first = first.next;
			count--;
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
	}

	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		Node curr = first;
		String s = "[" + curr.ele;
		while (curr.next != null) {
			curr = curr.next;
			s = s + "," + curr.ele;
		}
		return s += "]";
	}

	public void reverse() {
		Node curr = first;
		Node next = null;
		Node prev = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		first = prev;
	}

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add("Asish");
		list.add(10.5);
		list.add(true);
		list.add('a');
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		list.add(0, "Sutar");
		list.add(4, "Annie");
		System.out.println(list);
		list.remove(0);
		list.remove(5);
		System.out.println(list);
		list.reverse();
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
