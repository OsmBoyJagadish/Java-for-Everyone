package sortingAlgorithms;

public class QuickSort {
	public static void main(String[] args) {
		int arr[]={15, 9, 7, 13, 12, 16, 4, 18, 11};
		int length=arr.length;
		
		QuickSort qs = new QuickSort();
		qs.quickRecursion(arr, 0, length-1);
		qs.display(arr);
	}
	
	int partition(int arr[], int low, int high){
		int pivot= arr[(low+high)/2];
		while(low<=high){
			while(arr[low]<pivot){
				low++;
			}
			while(arr[high]>pivot){
				high--;
			}
			if(low<=high){
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	void quickRecursion(int arr[], int low, int high){
		int pi = partition(arr,low,high);
		if(low<pi-1){
			quickRecursion(arr, low, pi-1);
		}
		if(pi<high){
			quickRecursion(arr, pi, high);
		}
	}
	
	void display(int arr[]){
		for(int i:arr){
			System.out.println(i + " ");
		}
	}
}
