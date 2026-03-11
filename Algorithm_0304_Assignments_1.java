public class Algorithm_0304_Assignments_1 {

    // 1. Linear Scan (Array Sum) -> 預期 O(n)
    public static long linearScanSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 2. Insertion Sort -> 預期 O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // 3. Merge Sort -> 預期 O(n log n)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]; i++;
            } else {
                arr[k] = R[j]; j++;
            }
            k++;
        }
        while (i < n1) { arr[k] = L[i]; i++; k++; }
        while (j < n2) { arr[k] = R[j]; j++; k++; }
    }

    // 產生隨機陣列供測試使用
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 10000); 
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 50000, 100000}; 

        System.out.println("=== Assignment 1: 演算法時間複雜度實證 ===");
        
        for (int size : sizes) {
            System.out.println("\n[資料量 n = " + size + "]");
            int[] originalArray = generateRandomArray(size);
            long startTime, endTime;

            // Linear Scan
            startTime = System.currentTimeMillis();
            linearScanSum(originalArray);
            endTime = System.currentTimeMillis();
            System.out.println("Linear Scan 耗時: " + (endTime - startTime) + " ms");

            // Merge Sort
            int[] arrMerge = originalArray.clone();
            startTime = System.currentTimeMillis();
            mergeSort(arrMerge, 0, arrMerge.length - 1);
            endTime = System.currentTimeMillis();
            System.out.println("Merge Sort 耗時: " + (endTime - startTime) + " ms");

            // Insertion Sort
            int[] arrInsertion = originalArray.clone();
            startTime = System.currentTimeMillis();
            insertionSort(arrInsertion);
            endTime = System.currentTimeMillis();
            System.out.println("Insertion Sort 耗時: " + (endTime - startTime) + " ms");
        }
    }
}