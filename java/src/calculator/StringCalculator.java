package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
		public static int add( String numbers){
		int firstNumber = 0;
		int secondNumber =0;
		String[] nums = numbers.split(",");
		List<Integer> data = new ArrayList<Integer>();
		convertArrayIntoInt(nums,data);

		firstNumber = data.get(0);
		secondNumber = data.get(1);
		int result = firstNumber + secondNumber;
		System.out.println("result = "  + result);
		return result;
	}


	private static void convertArrayIntoInt(String[] stringData, List<Integer> intData) {
		for (String i: stringData) {
			if(i != null && !i.isEmpty()) {
				intData.add(Integer.parseInt(i));
			}else {
				intData.add(0);
			}
		}
	}
}