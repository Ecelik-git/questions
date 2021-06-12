package questions;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = scan.nextLine();
		countWord(str);
		scan.close();

	}
	
	public static void countWord(String str) {
		str=str.replace(",", "");
		String arr[] = str.split(" ");
		Map<String, Long> map01= Arrays.stream(arr).collect(Collectors.
				groupingBy(Function.identity(), Collectors.counting()));
		map01.forEach((key, value) -> System.out.println(key + "=" + value));
	}

}
