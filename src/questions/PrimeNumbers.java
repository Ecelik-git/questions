package questions;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// A program to check if the given number is prime number
		Scanner scan = new Scanner(System.in);
		//ask users to enter a number
		System.out.println("Please enter a number to check Primeness");
		int num = scan.nextInt();
		//print the result of the method
		primeNumbers(num);
		
		scan.close();

	}
	public static void primeNumbers(int number) {
		//we need to count the factors of the numbers
		//if it is more than 1 in our case, it is not a prime
		//because u used number/2 in for loop
		int count = 0;
		for(int i=1; i<=number/2; i++) {
			if(number/i==0) {
				count++;
			}
		}
		String result = count>1 ? number +" is not a prime number": number +" is a prime number";
		System.out.println(result);
	}

}
