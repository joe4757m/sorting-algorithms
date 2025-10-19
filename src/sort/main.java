package sort;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
        int[] data = {64, 25, 32, 22, 14};
        
        // selection sort
        int[] arr1 = Arrays.copyOf(data, data.length);
        selection.selectionSort(arr1);
        System.out.println("Selection Sort: " + Arrays.toString(arr1));
        // insertion sort
        int[] arr2 = Arrays.copyOf(data, data.length);
        insertion.insertionSort(arr2);
        System.out.println("Insertion Sort: " + Arrays.toString(arr2));
        // bubble sort
        int[] arr3 = Arrays.copyOf(data, data.length);
        bubble.bubbleSort(arr3);
        System.out.println("Bubble Sort: " + Arrays.toString(arr3));
        // quick Sort
        int[] arr4 = Arrays.copyOf(data, data.length);
        quick.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr4));
        // merge Sort
        int[] arr5 = Arrays.copyOf(data, data.length);
        merge.mergeSort(arr5, 0, arr5.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(arr5));
}
}
