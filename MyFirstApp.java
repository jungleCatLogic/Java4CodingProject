package week04CodingAssignment;

import java.util.Arrays;

public class MyFirstApp {

	public static void main(String[] args) { 
		//
		//QUESTION 1
		//
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int value = ages[ages.length - 1] - ages[0];
		System.out.println(value);		
		int[] ages2 = new int[9];
		for (int i = 0; i < ages2.length; i++) {
			ages2[i] = i;
		}
		int value2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(value2);
		// below the index value x sets the length of the array as well as number of elements
		// the index variable x can be changed to any positive integer
		// thus the index value x is dynamic and works for arrays of different lengths
		int x = 998;
		int[] agesX = new int[x];
		for (int i = 0; i < agesX.length; i++) {
			agesX[i] = i;
		}
		int valueX = agesX[agesX.length - 1] - agesX[0];
		System.out.println(valueX);
		// below a loop is used to cycle through an entire array of integers 
		// the elements in the array are added to each other cumulatively
		// after cycling through the array, the average of the elements is calculated
		// finally, the average is printed to the console 
		int[] age3 = {3, 5, 8, 12, 16, 25, 48, 67};
		int sum = 0;
		for (int i = 0; i < age3.length; i++) {
			sum = sum + age3[i];
		}
		int average = sum / age3.length;
		System.out.println(average);
		//
		//QUESTION 2
		// below variables of type double are used to calculate a more accurate average 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sum2 = 0;
		for (int i = 0; i < names.length; i++) {
			sum2 = sum2 + names[i].length();
		}
		double average2 = sum2 / names.length;
		System.out.println(average2);
		// below a loop is used to concatenate all the names in the array
		String longName = "";
		for (String name : names) {
		longName = longName + name + " ";	
		}
		System.out.println(longName);
		//
		//QUESTION 3
		// the last element of an array is accessed by subtracting 1 from the length 
		// the .length property method is used to determine the array length
		// 1 is subtracted from the length because arrays are zero based 
		//
		//QUESTION 4 
		// the first element of an array is at the zero index because arrays are zero based
		// the array[0] command is used to access the first element in an array
		//
		//QUESTION 5
		//
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		//
		//QUESTION 6
		//
		int sumLength = 0;
		for (int length : nameLengths) {
			sumLength = sumLength + length;
		}
		System.out.println(sumLength);
		//
		//QUESTION 7 call & printout
		//
		System.out.println(makeString("Coffee", 9));
		//
		//QUESTION 8 call & printout
		//
		System.out.println(makeName("Jenny", "Alpha"));
		//
		//QUESTION 9 call & printout
		//
		int[] myIntArray = {234, 3, 234, 23, 86, 4, 23, 467, 89};
		System.out.println(isGreaterThan100(myIntArray));
		//
		//QUESTION 10 call & printout
		//
		double[] myDoublesArray = {34.5, 67.3, 78.2, 98.9, 76.4};
		System.out.println(findAverage(myDoublesArray));
		//
		//QUESTION 11 call & printout
		//
		double[] double1 = {2.5, 6.2, 7.34, 45.7, 82.4};  
		double[] double2 = {4.5, 67.3, 2.4, 1.5, 76.1};
		System.out.println(isFirstAveMore(double1, double2));
		//
		//QUESTION 12 call & printout
		//
		System.out.println(willBuyDrink(true, 15.59));
		//
		//QUESTION 13 call & printout
		//
		System.out.println(shoutOut("meow", 9));
	}	
	//
	//QUESTION 7 method
	// first the concatenated string is made by looping together the word n times
	public static String makeString(String word, int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			str = str + word;
		}
		return str;
	}
	// then in the main method the makeString method is called and the concatenated string is printed
	//
	//QUESTION 8 method
	//
	public static String makeName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	//
	//QUESTION 9 method
	//
	public static Boolean isGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum = sum + number; 
		}
		return sum > 100; 
	}
	//
	//QUESTION 10 method
	//
	public static double findAverage(double[] numbs) {
		double sum = 0;
		for (int i = 0; i < numbs.length; i++) {
			sum = sum + numbs[i];
		}
		double average = sum / numbs.length; 
		return average;
	}
	//
	//QUESTION 11 method
	//
	public static Boolean isFirstAveMore(double[] double1, double[] double2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double dub1 : double1) {
			sum1 = sum1 + dub1;
		}
		for (double dub2 : double2) {
			sum2 = sum2 + dub2;
		}

		double ave1 = sum1 / double1.length;
		double ave2 = sum2 / double2.length;
		return ave1 > ave2;
	}
	//
	//QUESTION 12 method
	//
	public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	//
	//QUESTION 13 method
	//the method called shout below will take a string userWord, repeat it n times with exclamation!
	//then it capitalizes the characters at indexes divisible by 3
	//the method will return the new string with intermittent capitalized letters
	public static String shoutOut(String userWord, int s) {
		String shoutWord = "";
		for (int i = 0; i < s; i++) {
			shoutWord = shoutWord + userWord + "!";
			}	
		String word = "";
		for (int index = 0; index < shoutWord.length(); index++) {
			if (index % 3 == 0) {
			word += Character.toUpperCase(shoutWord.charAt(index));
			} else {
				word += shoutWord.charAt(index);
			}
		}
		return word;
	}
}
