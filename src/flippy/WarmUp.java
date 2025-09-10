package flippy;

import java.util.Arrays;

public class WarmUp {
	
	/**
	 * Counts how many cards are hearts
	 * 
	 * @param cards an array of cards
	 * @return the number of cards that are hearts
	 * @author Taha
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
	
		
	/**
	 * Reverses the order of elements in an array of Strings. 
	 * @param array1
	 * @return nothing is returned the @param is changed itself.
	 */
	public static void reverseArray (String[]array1){
		String[] temp = new String[array1.length];
		int beginningToEnd= 0;
		/**
		*beginningToEnd is used to index from 0 upto the length of the array-1 so that array1's 
		*last value becomes temp's first value and so on
		*/
		for(int i=array1.length-1; i>=0;i--){
			temp[beginningToEnd]=array1[i];
			beginningToEnd++;
			/**
			 * beginningToEnd goes from 0 to length-1 while i goes from length-1
			 *  to 0 that's how String array 'temp' becomes the reverse of 'array1'
			 */
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
