package calculator;

import java.util.Iterator;

class StringCalculator {
	
    public int add(String input) {
        if(input == ""){
        	return 0;
        }else{
        	String delimiter = ",";
        	String []inputNumbers = splitNumbers(input,delimiter);
        	return sumofinputs(inputNumbers);
        } 		
    }
    
	private int sumofinputs(String[] inputNumbers) {
		int sum = 0;
		for(String number : inputNumbers) {
			sum += parsingint(number);
		}
		return sum;
	}

	private String[] splitNumbers(String input, String delimiter) {
			return input.split(delimiter);
	}

	private int parsingint(String input) {
		return Integer.parseInt(input);
	}
	
    
    
}