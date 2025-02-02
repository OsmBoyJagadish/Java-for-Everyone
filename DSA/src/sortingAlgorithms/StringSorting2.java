package sortingAlgorithms;

public class StringSorting2 {
	// By Selection Sort
	public static void main(String[] args) {
		String a[] = { "Jagadish", "Sanu", "Adi", "Shivam", "Ritesh" };
		String temp;
		int min;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[min]) < 0) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}