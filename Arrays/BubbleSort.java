import java.util.Scanner;

public class BubbleSort {
    
    // Function to perform Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Function to count swaps for ascending order
    static int countSwapsAscending(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
    
    // Function to count swaps for descending order
    static int countSwapsDescending(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
    
    // Function to find minimum swaps required
    static int minSwaps(int[] arr) {
        int ascSwaps = countSwapsAscending(arr.clone());
        int descSwaps = countSwapsDescending(arr.clone());
        
        return Math.min(ascSwaps, descSwaps);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Perform Bubble Sort
        bubbleSort(arr);
        
        // Calculate and print the minimum swaps required
        System.out.println(minSwaps(arr));
        scanner.close();
    }
}
