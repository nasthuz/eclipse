package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
		public int add( String numbers){
		String[] nums = numbers.split(",");
		List<Integer> data = new ArrayList<Integer>();
		convertArrayIntoInt(nums,data);
		
		int firstNumber = data.get(0);
		int secondNumber = data.get(1);
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
