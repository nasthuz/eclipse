package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
		public int add(String numbers){
	    String[] nums = setSplit(numbers);
		List<Integer> data = new ArrayList<Integer>();
		convertArrayIntoInt(nums,data);
		int result = calculateSum(data);
		System.out.println("result = "  + result);
		return result;
	}
	
	
	private String[] setSplit(String str) {
		String delimeter;
		String data;
		String [] splitedNums = null;
		if (str.startsWith("//")) {
			int indexEnd = str.indexOf("\\");
			int indexLine = str.indexOf("n");
			delimeter = str.substring(2,indexEnd);
			data=str.substring(indexLine+1, str.length()); 			
			splitedNums = splitWithCustomDelimeter(data,delimeter);
		}else {
			System.out.println("The String is empty ");
		}
		return splitedNums;
		}

	
	private String[] splitWithCustomDelimeter(String str,String delimeter) {
		String [] splitedNums = str.split(delimeter);
		for (String i: splitedNums) {
			System.out.println("num = "  + i);
			}
		return splitedNums;
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
