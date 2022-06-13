package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
		public static int add(String numbers){
	    String[] nums = numbers.split(",|\r?\n|\r");
		List<Integer> data = new ArrayList<Integer>();
		convertArrayIntoInt(nums,data);
		int result = calculateSum(data);
		
		System.out.println("result = "  + result);
		return result;
	}
	
	
	private static void convertArrayIntoInt(String[] stringData, List<Integer> intData) {
		for (String i: stringData) {
			if(i != null && !i.trim().isEmpty()) {
				intData.add(Integer.parseInt(i));
			}else {
				intData.add(0);
			}
		}
	}
	
	private static int calculateSum(List<Integer> data) {
		int result = 0;
		for (int i: data) {
			result += i;
		}
		return result;
	}
}