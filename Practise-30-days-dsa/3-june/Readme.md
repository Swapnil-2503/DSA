# Searching Algorithms

This repository contains implementations of various searching algorithms in different programming languages. The algorithms included are:

1. Linear Search
2. Binary Search
3. Hashing
4. Interpolation Search
5. Jump Search
6. Exponential Search
7. Ternary Search

## Linear Search

Linear search is a simple searching algorithm that sequentially checks each element in a list until a match is found or the end of the list is reached. It is suitable for small lists or when the elements are not in any specific order. 

## Binary Search

Binary search is an efficient searching algorithm that works on sorted lists. It repeatedly divides the search space in half by comparing the middle element with the target value. If the middle element is equal to the target, the search is successful. Otherwise, the search continues in the left or right half, eliminating the other half.

## Hashing

Hashing is a technique that uses a hash function to map keys to positions in a data structure called a hash table. By computing the hash value of the key, the algorithm can quickly locate the desired element in constant time on average. Hashing is often used for large datasets and enables fast lookup operations.

## Interpolation Search

Interpolation search is an improvement over binary search for uniformly distributed data. Instead of always dividing the search space in half, it estimates the position of the target by using the value of the elements. It narrows down the search space more quickly by making intelligent guesses.

## Jump Search

Jump search is similar to binary search but instead of dividing the search space by half, it jumps a fixed number of steps ahead in the list and checks if the target is within that range. If not, it jumps again. This algorithm is useful for large sorted lists.

## Exponential Search

Exponential search begins with a small range and exponentially increases it until the target value is within that range. Once the range is found, a binary search is performed on that range for the exact match. It is efficient for unbounded or infinite-sized lists.

## Ternary Search

Ternary search divides the search space into three parts instead of two, reducing the search space by two-thirds in each iteration. It is useful for searching in ordered lists when the position of the target is not known in advance.
