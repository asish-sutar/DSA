# MyArrayList

MyArrayList is a simple Java implementation of a dynamic array (similar to ArrayList in Java) with basic operations like add, get, remove, clear, etc.

## Usage

You can use this `MyArrayList` class in your Java projects to dynamically manage a list of objects. 


### Example
```

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
    list.add(4, "abhi");
    System.out.println(list);
    list.remove(0);
    list.remove(5);
    System.out.println(list);
    list.clear();
    System.out.println(list);
}
```
## Methods

- `add(Object ele)`: Add an element to the end of the list.
- `add(int index, Object ele)`: Add an element at a specific index.
- `remove(int index)`: Remove an element at a specific index.
- `clear()`: Clear the entire list.
- `size()`: Get the current size of the list.
- `get(int index)`: Get the element at a specific index.
- `toString()`: Convert the list to a string for easy printing.


# MyLinkedList

`MyLinkedList` is a simple Java implementation of a singly linked list with basic operations like add, get, remove, clear, and reverse.

## Usage

You can use this `MyLinkedList` class in your Java projects to manage a linked list of objects.

### Example

```
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
    list.add(4, "ajju");
    System.out.println(list);
    list.remove(0);
    list.remove(5);
    System.out.println(list);
    list.reverse();
    System.out.println(list);
    list.clear();
    System.out.println(list);
}
```




# Searching Algorithms

This Java project includes implementations of two common searching algorithms: Linear Search and Binary Search.

## Linear Search

The `LinearSearch` class provides a method `LinearSearchAlgo` that performs a linear search on an array to find the position of a specified element. If the element is found, it returns the index; otherwise, it returns -1.

## Binary Search

The `BinarySearch` class provides a method `binarySearch` that performs a binary search on a sorted array. It returns the index of the element if found; otherwise, it returns -1.

## Usage

You can use these searching algorithms in your Java projects to efficiently find elements in arrays.

### Example

```
public class SearchingAlgorithms {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // Linear Search
        System.out.println("Linear Search for 1: " + LinearSearch.LinearSearchAlgo(a, 1));
        System.out.println("Linear Search for 10: " + LinearSearch.LinearSearchAlgo(a, 10));

        // Binary Search
        System.out.println("Binary Search for 1: " + BinarySearch.binarySearch(a, 1));
    }
}
```
