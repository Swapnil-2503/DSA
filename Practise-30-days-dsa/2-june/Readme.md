
# Sorting Algorithms

This repository provides a theoretical overview of various sorting algorithms. Sorting algorithms are an essential topic in computer science, and understanding them is crucial for efficient data manipulation and analysis.

## Table of Contents

- [Bubble Sort](#bubble-sort)
- [Insertion Sort](#insertion-sort)
- [Selection Sort](#selection-sort)
- [Merge Sort](#merge-sort)
- [Quick Sort](#quick-sort)
- [Heap Sort](#heap-sort)
- [Radix Sort](#radix-sort)

## Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass-throughs are repeated until the list is sorted.

**Time Complexity**: O(n^2) in the worst and average case.

## Insertion Sort

Insertion Sort is an efficient comparison-based sorting algorithm that builds the final sorted array one element at a time. It iterates through the input array, comparing each element with the elements before it and inserting it into its correct position.

**Time Complexity**: O(n^2) in the worst and average case.

## Selection Sort

Selection Sort is a simple comparison-based sorting algorithm. It divides the input into a sorted and an unsorted region. It repeatedly selects the smallest element from the unsorted region and swaps it with the first element of the unsorted region.

**Time Complexity**: O(n^2) in the worst and average case.

## Merge Sort

Merge Sort is a divide-and-conquer sorting algorithm. It divides the input into smaller parts, recursively sorts them, and then merges them to obtain a sorted output. It is known for its stability and has a guaranteed time complexity of O(n log n).

**Time Complexity**: O(n log n) in the worst and average case.

## Quick Sort

Quick Sort is a divide-and-conquer sorting algorithm that selects a "pivot" element and partitions the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. It then recursively sorts the sub-arrays. Quick Sort has good average-case performance and is widely used in practice.

**Time Complexity**: O(n log n) in the average case, but can degrade to O(n^2) in the worst case.

## Heap Sort

Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It builds a max-heap from the input array and repeatedly extracts the maximum element from the heap, placing it at the end of the sorted array.

**Time Complexity**: O(n log n) in the worst and average case.

## Radix Sort

Radix Sort is a non-comparative sorting algorithm that sorts the elements by grouping them by significant places. It starts from the least significant digit and moves towards the most significant digit. It can handle sorting of integers, strings, and other data types.

**Time Complexity**: O(d * (n + k)), where d is the number of digits and k is the range of possible values.


