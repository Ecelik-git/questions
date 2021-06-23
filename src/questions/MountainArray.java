package questions;

public class MountainArray {

	public static void main(String[] args) {
		//this program will check if a given array is a mountain array
		int arr[]=new int[] {0,2,5,3,1};
		checkArray(arr);
		
		int arr1[]=new int[] {5,2,7,1,4};
		checkArray(arr1);

	}
	public static void checkArray(int arr[]) {
		int firstIndex = 0;
		int lastIndex = arr.length -1;
		int size = arr.length-1;
		while(firstIndex+1<size && arr[firstIndex]<arr[firstIndex+1]) {
			firstIndex++;
		}
		while(lastIndex>0 && arr[lastIndex]<arr[lastIndex-1]) {
			lastIndex--;
		}
		if(firstIndex>0 && firstIndex==lastIndex && lastIndex<size) {
			System.out.println("This is a mountain array");
		}else {
			System.out.println("This is not a mountain array");
		}
	}

}
