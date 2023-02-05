package stack;

public class BubbleSort {
	public static void main(String[] args) {
		
		int a[] = {11,2,31,4,52,6};
		
		bubbleSort(a);
		
		for (int i = 0 ; i < a.length ; i++ ) {
			
			System.out.print(a[i] + "\t");
			
		}
		
	}

	private static void bubbleSort(int[] a) {
		
		for (int i = 0 ; i < a.length - 1 ; i++) {
			for (int j = 0 ; j < a.length - i - 1; j++) {
				
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} 
			}
		}
		
	}
}
