package com.algorithms.pack1;

public class MyArrayList {
	private Object[] a = new Object[5];
	private int pos = 0;

	public void add(Object ele) {
		if (pos >= a.length) {
			IncreaseCapacity();
		}
		a[pos] = ele;
		pos++;
	}

	private void IncreaseCapacity() {
		Object[] temp = new Object[a.length + 3];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	public int size() {
		return pos;
	}

	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}

	public void add(int index, Object ele) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (pos >= a.length) {
			IncreaseCapacity();
		}
		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = ele;
		pos++;
	}

	public void remove(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i];
		}
		pos--;
		a[pos] = null;
	}

	public void clear() {
		a = new Object[5];
		pos = 0;
	}

	public String toString() {
		if (size() == 0)
			return "[]";
		String s = "[" + a[0];
		for (int i = 1; i < size(); i++) {
			s = s + "," + a[i];
		}
		return s += "]";
	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
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
		list.clear();
		System.out.println(list);
	}
}
