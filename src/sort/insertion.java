package sort;

public class insertion {
	public static void insertionSort(int a[])
    {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;
         
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
          
            a[j + 1] = k;
        }
    }
}
