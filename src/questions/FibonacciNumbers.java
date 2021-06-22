package questions;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// A program to print Fibonacci numbers up to a given number
		Scanner scan = new Scanner(System.in);
		//ask users to enter a number
		System.out.println("Please enter a number to see Fib numbers");
		int num = scan.nextInt();
		
		
		//use the method to print Fibonacci series up to the number
		printFibonacci(num);
		
		scan.close();

	}
	public static void printFibonacci(int number) {
		//assign two numbers which are smallest fib numbers
		int number1 = 1, number2=2;
		//and print the numbers since they are part of fib series
		System.out.print(number1+" "+number2+" ");
		//to find the fib numbers up to a number, use for loop
		for(int i=0; i<=number; i++) {
			int fibNumber = number1+number2;
			number1 = number2;//after each loop number1 should increase to number2
			number2 = fibNumber;//and number2 should be the total which is fibNumber
			//if fibNumber is equal to or bigger then given number break the loop
			if(fibNumber==number || fibNumber>number) {
				break;
			}
			//print the fibnumbers
			System.out.print(fibNumber+" ");
		}
	}

}
