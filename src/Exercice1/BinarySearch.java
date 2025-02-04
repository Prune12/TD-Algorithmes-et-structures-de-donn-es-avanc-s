package Exercice1;

public class BinarySearch {

    // Méthode de recherche binaire récursive
    public static int binarySearch(int[] sortedArray, int target) {
        return binarySearchHelper(sortedArray, target, 0, sortedArray.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target, int low, int high) {
        if (low > high) {
            // La cible n'existe pas dans le tableau
            return -1;
        }
        int mid = low + (high - low) / 2; // éviter overflow
        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearchHelper(arr, target, low, mid - 1);
        } else {
            return binarySearchHelper(arr, target, mid + 1, high);
        }
    }

}

