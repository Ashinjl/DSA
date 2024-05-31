# Easy Level Bubble Sort Practice Problems

## 1. Sort an Array of Integers
**Problem:** Write a function to sort an array of integers in ascending order using Bubble Sort.

**Example Input:** `[64, 34, 25, 12, 22, 11, 90]`

**Example Output:** `[11, 12, 22, 25, 34, 64, 90]`

## 2. Sort an Array in Descending Order
**Problem:** Modify your Bubble Sort algorithm to sort an array of integers in descending order.

**Example Input:** `[5, 1, 4, 2, 8]`

**Example Output:** `[8, 5, 4, 2, 1]`

## 3. Sort Strings Lexicographically
**Problem:** Write a function to sort an array of strings in lexicographical order using Bubble Sort.

**Example Input:** `["apple", "orange", "banana", "grape"]`

**Example Output:** `["apple", "banana", "grape", "orange"]`

## 4. Count Number of Swaps in Bubble Sort
**Problem:** Write a function to sort an array using Bubble Sort and count the number of swaps required.

**Example Input:** `[4, 3, 2, 1]`

**Example Output:** `6` (The array is sorted in 6 swaps.)

## 5. Check if Array is Already Sorted
**Problem:** Before performing Bubble Sort, check if the array is already sorted. If it is, return immediately.

**Example Input:** `[1, 2, 3, 4, 5]`

**Example Output:** `[1, 2, 3, 4, 5]` (No sorting needed.)

## 6. Sort an Array of Floating Point Numbers
**Problem:** Write a function to sort an array of floating point numbers in ascending order using Bubble Sort.

**Example Input:** `[3.2, 2.5, 1.8, 4.6, 3.3]`

**Example Output:** `[1.8, 2.5, 3.2, 3.3, 4.6]`

## 7. Sort Only Even Numbers in an Array
**Problem:** Write a function that sorts only the even numbers in an array in ascending order using Bubble Sort, while leaving odd numbers in their original positions.

**Example Input:** `[5, 3, 2, 8, 1, 4]`

**Example Output:** `[5, 3, 2, 4, 1, 8]`

## Example Implementations

### 1. Sort an Array of Integers

```java
public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Swap array[j] and array[j + 1]
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

public static void main(String[] args) {
    int[] data = {64, 34, 25, 12, 22, 11, 90};
    bubbleSort(data);
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
}
```

## sorting 

**selection sort**