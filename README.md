# Algorithms
Inserton Sort:
```java
Before insertion sort:
12 9 13 5 6 
Sorting...
array[0]: 9 <=> array[1]: 12
array[2]: 5 <=> array[3]: 13
array[1]: 5 <=> array[2]: 12
array[0]: 5 <=> array[1]: 9
array[3]: 6 <=> array[4]: 13
array[2]: 6 <=> array[3]: 12
array[1]: 6 <=> array[2]: 9
After insertion sort:
5 6 9 12 13 
```
Time Complexity: O(n^2)  
Auxiliary Space: O(1)  

---  

MergeSort:  
```java
Before merge sort: 7 9 1 5 6 4 
Sorting...
The left array: 7 9 1 The right array: 5 6 4 
The left array: 7 The right array: 9 1 
The left array: 9 The right array: 1 
Result: 1 9 
Result: 1 7 9 
The left array: 5 The right array: 6 4 
The left array: 6 The right array: 4 
Result: 4 6 
Result: 4 5 6 
Result: 1 4 5 6 7 9 
After merge sort: 1 4 5 6 7 9 
```   
Time Complexity: O(nlogn)  
Auxiliary Space: O(n)  