package SJB.TimeComplexity;

public class BinarySearch {

    // Binary search method (iterative)
    public int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if element is present at mid
            if (array[mid] == element)
                return mid;

            // If element is greater, ignore left half
            if (array[mid] < element)
                left = mid + 1;

            // If element is smaller, ignore right half
            else
                right = mid - 1;
        }

        // Element not present
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {12, 34, 55, 67, 88};  // Sorted array

        int elementToSearch = 88;

        int result = bs.binarySearch(array, elementToSearch);

        if (result != -1) {
            System.out.println("Element " + elementToSearch + " found at index " + result);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }
}
