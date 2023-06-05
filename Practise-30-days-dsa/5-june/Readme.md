# Hashing in Java: HashSet and HashMap

This repository provides examples and explanations of hashing in Java using the `HashSet` and `HashMap` data structures.

## HashSet

`HashSet` is an implementation of the `Set` interface in Java that uses hashing to store and manage a collection of unique elements. It is based on the `HashMap` data structure, where the elements are stored as keys, and the values are set to a constant `PRESENT`.

The key features of `HashSet` are:
- It does not allow duplicate elements.
- It does not guarantee the order of elements.
- It provides constant-time performance for basic operations such as add, remove, and contains (assuming a good hash function).

Usage example:
```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
set.add("apple");
set.add("banana");
set.add("orange");


## HashMap

`HashMap` is an implementation of the `Map` interface in Java that uses hashing to store and retrieve key-value pairs. It provides an efficient way to store and access elements based on their keys. Each key is mapped to a corresponding value in the `HashMap`.

The key features of `HashMap` are:
- It allows null values and at most one null key.
- It does not guarantee the order of entries.
- It provides constant-time performance for basic operations such as put, get, and remove (assuming a good hash function).

Usage example:
```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.put("banana", 5);
map.put("orange", 7);
