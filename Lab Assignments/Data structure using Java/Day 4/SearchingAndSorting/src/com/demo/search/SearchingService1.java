package com.demo.search;

public class SearchingService1 {

    public static int sequentialSearch(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchNonRecursive(String[] arr, String search) {
        int low = 0;
        int high = arr.length - 1;
        int cnt = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            cnt++;
            if (arr[mid].equalsIgnoreCase(search)) {
                System.out.println("Comparisons: " + cnt);
                return mid;
            }

            if (search.compareToIgnoreCase(arr[mid]) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Comparisons: " + cnt);
        return -1;
    }

    public static int binarySearchRecursive(String[] arr, String search, int low, int high) {
        System.out.println("Binary Search called: " + low + "--------" + high);

        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].equalsIgnoreCase(search)) {
                return mid;
            } else if (search.compareToIgnoreCase(arr[mid]) < 0) {
                return binarySearchRecursive(arr, search, low, mid - 1);
            } else {
                return binarySearchRecursive(arr, search, mid + 1, high);
            }
        }
        return -1;
    }
}
