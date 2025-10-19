package sort;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
        int[] data = {64, 25, 32, 22, 14};
        
        // selection sort
        int[] arr1 = Arrays.copyOf(data, data.length);
        selection.selection(arr1);
        System.out.println("Selection Sort: " + Arrays.toString(arr1));
}
}