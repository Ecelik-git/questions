package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindRepeatedChars {
	/*
	Find the repeated characters in a String.
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scan.nextLine();
		String arr[]= str.split("");
		
		findRepeatedChars(arr);
		
		scan.close();

	}
	private static void findRepeatedChars(String arr[]) {
		List<String> result = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					result.add(arr[i]);
				}
			}
		}
		System.out.println(result);
		
	}

}
