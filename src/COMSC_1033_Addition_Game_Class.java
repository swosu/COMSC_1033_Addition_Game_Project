import java.util.Scanner;
public class COMSC_1033_Addition_Game_Class {
	public static void main(String[] args) {
		System.out.println("Hello Class!");
		// This is my development 1412 branch.
		
		// Outline for addition problem.
		int score = 0;
		int hardness = 10;
		
		// Round 1
		//	Generate 2 random numbers
		int number1 = (int)(Math.random() * hardness);
		int number2 = (int)(Math.random() * hardness);
		int correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println("What is " + number1 + " + " + number2 + "?");
		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct
		if(studentAnswer == correctAnswer){
			//		IF correct
			//			Tell them it was correct
			System.out.println("Answer correct.");
			//			Give them points
			score += hardness;
			
			//			Make the next question harder
			hardness *= 10;
		}

		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		// Round 2
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		// Round 3
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		// Round 4
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//	Calculate total points.
		// 	Display final score



	}
}
