package questions;

public class NumberPairs {

	public static void main(String[] args) {
		
		int num = 10;
		int arr[]= { 4, 6, 5, -10, 8, 5, 20 };
		//calling the method
		numberPairs(arr, num);
		

	}
	public static void numberPairs(int arr[], int num) {
		//using inner and outer for loop to check the pairs
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==num) {
					//print only if the pairs is 10
					System.out.println(arr[i]+"+"+arr[j]+"= "+num);
				}
			}
		}
		
	}

}
