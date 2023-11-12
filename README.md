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
    list.add(4, "Annie");
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



