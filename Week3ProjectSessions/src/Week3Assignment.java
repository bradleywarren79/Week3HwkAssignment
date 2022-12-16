
public class Week3Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int [] ages = {3, 9, 23, 64, 2, 8, 93, 20}; //adding the number 20 to the array.
		
//			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		System.out.println(ages[ages.length -1] - ages[0]);
//		 	b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
//			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		for(int number : ages) {
			sum += number;
		}
		System.out.println(sum / ages.length);
//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//			a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totalLetters = 0;
		for(String name : names) {
			totalLetters += name.length();
	}
		System.out.println(totalLetters);
		System.out.println(totalLetters / names.length);
		
		
//			b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String allNames = "";
		for(int i = 0; i<names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
//		3. How do you access the last element of any array?
		System.out.println("get(index) method by passing index = size – 1");
//		4. How do you access the first element of any array?
		System.out.println("get(index) method by passing index = 0");
		
//		5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = {3, 5, 3, 5, 4, 3};
		
		
//		6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int totalNames = 0;
		for(int i = 0; i < nameLengths.length; i++) { // for all the members in the nameLengths array, we're going to add those to totalNames
			totalNames += nameLengths[i];
			}
		System.out.println(totalNames);
		
		System.out.println(multiplyString("Hello", 3));
		
		String firstName = "James";
		String lastName = "Lawrence";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		int[]numbers = {1, 57, 3, 64};
		System.out.println(totalSumNumbers(numbers));
		
		double[] array = {23, 4, 17, 89};
		System.out.println(numAverage(array));
		
		double[] arrayTwo = {19, 24, 8, 56};
		System.out.println(numAverageTwo(array, arrayTwo));
		
		boolean isHotOutside = true;
		double moneyInPocket = 9;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		int pastTime = 10;
		System.out.println("I'm very tired");
		System.out.println(pastBedTime (pastTime));
	}
		
		
//		7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
//		I expect the method to return “HelloHelloHello”).
			
			public static String multiplyString(String stng, int num) {
			String result = "";
			for(int n = 0; n < num; n++) {
				result += stng;
			}
		return result;
	

		} //end of Main

		public static String repeatWord (String word, int num) { // (String word, int num) this declares the variables already. 
		String basket = "";
		for(int i = 0; i< num; i++) {
			basket += word;
		}
		return basket;
		}	
		
//		8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static void main1(String[] args) {
		String firstName = "James";
		String lastName = "Lawrence";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		}
		public static String createFullName(String fn, String ln) {
			String fullName = fn + " " + ln;
			return fullName;
		
}
				
//		9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		public static boolean totalSumNumbers(int[] numbers) {
			int total = 0;
			for(int number:numbers) {
				total += number;
			}
			if(total>100) {
				return true;
			}else {
				return false;
			}
		}

//		10. Write a method that takes an array of double and returns the average of all the elements in the array.
			public static double numAverage(double[] array) {
				double total = 0;
				for(double number : array) {
					total += number;					
				}
				return total / array.length;
			}
		
			
//		11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			public static boolean numAverageTwo(double[] array, double[] arrayTwo) {
				double sum = 0;
				for(double numbers : array) {
					sum += numbers / array.length;
				}
				double total = 0;
				for(double numbers : arrayTwo) {
					total += numbers / arrayTwo.length;
				}
				if(sum > total) {
					return true; 
				}else {
					return false; 
				}
			}
			
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			public static boolean willBuyDrink(boolean temp, double money) {
				if(temp == true && money > 10.50) {
					return true;
				}else {
					return false;
				}
			}
			
//		13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			public static boolean pastBedTime(int time) {
				if(time >= 11) {
					return true;
				}else {
					return false;
				}
			}
}


