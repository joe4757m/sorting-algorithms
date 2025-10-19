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
}
}