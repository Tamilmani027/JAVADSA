package SJB.TimeComplexity;

public class LinearSearch {

    // Linear search method
    public int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;  // Return index if found
        }
        return -1;  // If element not found
    }

    // Main method
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] array = {12, 34, 55, 67, 88};

        int elementToSearch = 55;

        int result = ls.linearSearch(array, elementToSearch);

        if (result != -1) {
            System.out.println("Element " + elementToSearch + " found at index " + result);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }
}
