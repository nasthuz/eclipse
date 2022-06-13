package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-> Input 2 numbers (example: 12;67): ");
		Scanner in = new Scanner(System.in);
		String inputValue = in.nextLine();
		
		StringCalculator calculator = new StringCalculator();
		calculator.add(inputValue);
	}
}
