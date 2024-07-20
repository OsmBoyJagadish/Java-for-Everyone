package sortingAlgorithms;

public class BubbleSort {
	
	public static void printArray(int arr[]){
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]={8,4,9,2,1};
		for(int i = 0; i<arr.length; i++){
			int flag=0;
			for(int j = 0; j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
		printArray(arr);
	}
}
