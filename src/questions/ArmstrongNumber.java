package questions;

import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is an Armstrong: ");
		int num = scan.nextInt();
		isArmstrong(num);
		
		scan.close();

	}
	public static void isArmstrong(int num) {
		String str = String.valueOf(num);
		String arr[]=str.split("");
		int sum = 0;
		for(String w: arr) {
			sum += Math.pow(Integer.valueOf(w), 3);
		}
		String result = num==sum? num+" is an armstrong number":num+" is not an armstrong number";
		System.out.println(result);
		
	}

}
