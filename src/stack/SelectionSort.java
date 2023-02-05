package stack;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {

		int a[] = { 11, 2, 31, 4, 52, 32, 6 };

		selectionSort(a);

		System.out.println(Arrays.toString(a));
	}

	private static void selectionSort(int[] a) {
		
		for (int i = 0 ; i < a.length - 1 ; i++) {
			int minIndex = i;
			
			for (int j = i + 1 ; j < a.length ; j++) {
				
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
			
		}
		
	}
}
