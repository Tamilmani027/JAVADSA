package SJB.TimeComplexity;

public class SelectionSort {
    public void selectionsort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minindex])
                    minindex = j;
            }
            // Swap
            int temp = array[i];
            array[i] = array[minindex];
            array[minindex] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort st = new SelectionSort();
        int[] array = {12, 34, 55, 67, 88,78,78,56,4,977,88};

        // Sort the array
        st.selectionsort(array);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
