package sortingAlgorithms;

public class InsertionSort {
	public static void main(String[] args) {
		
		int a[]={5,1,6,4,3,2};
		int temp,j;
		
		for(int i=1;i<a.length;i++){
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp){
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}
