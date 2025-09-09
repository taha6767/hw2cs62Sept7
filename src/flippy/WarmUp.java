package flippy;

import java.util.Arrays;

public class WarmUp {
	
	/**
	 * Counts how many cards are hearts
	 * 
	 * @param cards an array of cards
	 * @return the number of cards that are hearts
	 */
	public static int countHearts(Card[] cards ){
		int tempCount =0;
		for(int i=0; i<cards.length;i++){
			if(cards[i].getSuit().equals("hearts")){tempCount++;}
		}
		return tempCount;
	}
	
	/**
	 * Add the elements of two arrays of the same length.  The function assumes that 
	 * the arrays are of the same length
	 * 
	 * @param array1
	 * @param array2
	 * @return a new array that is the element-wise sum of the input arrays 
	 */
	public static double[] addArraysSameLength(double[] array1, double[] array2){
		double[] resultAdd = new double[array1.length];
		for(int i=0;i<array1.length;i++){
			resultAdd[i]= array1[i]+array2[i];
		}
		return resultAdd;
	}
	
		
	// TODO: write the reverseArray method, including method header and JavaDoc comments
	public static void reverseArray (String[]array1){
		String[] temp = new String[array1.length];
		int beginningToEnd= 0;
		//beginningToEnd is used to index from 0 upto length so array1's last value becomes temp's first value and so on
		for(int i=array1.length-1; i>=0;i--){
			temp[beginningToEnd]=array1[i];
			beginningToEnd++;
		}
		for(int i=0; i<temp.length;i++){
			array1[i]=temp[i];
		}
		
		
	}

	public static void main(String[] args){
		String[] words = {"I", "love", "my", "CS", "classes", "!"};
		
		System.out.println("Before: " + Arrays.toString(words));
		reverseArray(words);
		System.out.println("After: " + Arrays.toString(words));
	   
	}
}
