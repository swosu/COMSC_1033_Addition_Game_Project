<<<<<<< HEAD
import java.util.Scanner;
public class COMSC_1033_Addition_Game_Class {
	public static void main(String[] args) {
		// This is the master branch.

		// Outline for addition problem.
		int score = 0;
		int hardness = 10;
		
		// Round 1
		//	Generate 2 random numbers
		int number1 = (int)(Math.random() * hardness);
		int number2 = (int)(Math.random() * hardness);
		int correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please enter integers only.");

		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct

		//		IF correct
		if(studentAnswer == correctAnswer){
			//		IF correct
			//			Tell them it was correct
			System.out.println("Your answer was correct.");
			//			Give them points
			score += hardness;
			System.out.println("Your score is now: " + score);
			//			Make the next question harder
			hardness *= 10;
			System.out.println("The next hardness will be: " + hardness);
		}else{
			//		IF not correct
			//			Tell them it was wrong
			System.out.println("Your answer was not correct.");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if (hardness > 10){
				hardness /= 10;
				System.out.println("Your hardness is now: " + hardness);
			}else{
				System.out.println("Your hardness is at the lowest level");
				System.out.println("Your hardness is now: " + hardness);
			}
			
			
		}

		System.out.println("End of round 1.");
		
		// Round 2
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardness);
		number2 = (int)(Math.random() * hardness);
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please enter integers only.");
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		if(studentAnswer == correctAnswer){
			//		IF correct
			//			Tell them it was correct
			System.out.println("Your answer was correct.");
			//			Give them points
			score += hardness;
			System.out.println("Your score is now: " + score);
			//			Make the next question harder
			hardness *= 10;
			System.out.println("The next hardness will be: " + hardness);
		}else{
			//		IF not correct
			//			Tell them it was wrong
			System.out.println("Your answer was not correct.");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if (hardness > 10){
				hardness /= 10;
				System.out.println("Your hardness is now: " + hardness);
			}else{
				System.out.println("Your hardness is at the lowest level");
				System.out.println("Your hardness is now: " + hardness);
			}
			
			
		}

		System.out.println("End of round 2.");
		
		// Round 3
//		Generate 2 random numbers
		number1 = (int)(Math.random() * hardness);
		number2 = (int)(Math.random() * hardness);
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please enter integers only.");
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		if(studentAnswer == correctAnswer){
			//		IF correct
			//			Tell them it was correct
			System.out.println("Your answer was correct.");
			//			Give them points
			score += hardness;
			System.out.println("Your score is now: " + score);
			//			Make the next question harder
			hardness *= 10;
			System.out.println("The next hardness will be: " + hardness);
		}else{
			//		IF not correct
			//			Tell them it was wrong
			System.out.println("Your answer was not correct.");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if (hardness > 10){
				hardness /= 10;
				System.out.println("Your hardness is now: " + hardness);
			}else{
				System.out.println("Your hardness is at the lowest level");
				System.out.println("Your hardness is now: " + hardness);
			}
			
			
		}

		System.out.println("End of round 3.");
		// Round 4
//		Generate 2 random numbers
		number1 = (int)(Math.random() * hardness);
		number2 = (int)(Math.random() * hardness);
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please enter integers only.");
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		if(studentAnswer == correctAnswer){
			//		IF correct
			//			Tell them it was correct
			System.out.println("Your answer was correct.");
			//			Give them points
			score += hardness;
			System.out.println("Your score is now: " + score);
			//			Make the next question harder
			hardness *= 10;
			System.out.println("The next hardness will be: " + hardness);
		}else{
			//		IF not correct
			//			Tell them it was wrong
			System.out.println("Your answer was not correct.");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if (hardness > 10){
				hardness /= 10;
				System.out.println("Your hardness is now: " + hardness);
			}else{
				System.out.println("Your hardness is at the lowest level");
				System.out.println("Your hardness is now: " + hardness);
			}
			
			
		}

		System.out.println("End of round 4.");
		System.out.println("Your final score is: " + score);

	}
}
=======
import java.util.Scanner;
public class COMSC_1033_Addition_Game_Class {
	
	//These are variables used throughout all methods
	public static int numberOfRounds		= 4;
	public static int score 				= 0;
	public static int hardnessOfQuestion 	= 10;
	public static int correctAnswer;
	public static Scanner input 			= new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		for(int i=1;i<numberOfRounds+1;i++){
			
			outputMessage("Round " + i + ". Begin.");
			
			if ( correctAnswer() ){			
				outputMessage("Answer was correct.");			
				increaseScoreByHardness(hardnessOfQuestion);
				outputScore();
				increaseHardnessByFactor(10);			
			}else{
				outputMessage("Answer was not correct");			
				outputCorrectAnswer();
				
				if(hardnessOfQuestion>10){
					decreaseHardnessByFactor(10);
				}
			}			
			
			if(i<numberOfRounds){
				outputMessage("End of round " + i);		
			}else{
				outputMessage("End of final round");
			}
		}	//End For Loop
		
		outputMessage("Thanks for playing!");
		outputMessage("Out of " + numberOfRounds + " total rounds...");
		outputFinalScore();
		
	}	//End Main Method
	
	public static boolean correctAnswer(){
		int number1 = randNumByHardness(hardnessOfQuestion);		
		int number2 = randNumByHardness(hardnessOfQuestion);
				
		int correctAnswer = number1 + number2;
		
		System.out.println("What is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		int studentAnswer = input.nextInt();
		
		if(studentAnswer == correctAnswer){
			return true;
		}else{
			return false;
		}		
	}
	
	public static int randNumByHardness(int hardness){
		return (int)(Math.random() * hardness);
	}
	
	public static void increaseHardnessByFactor(int number){
		hardnessOfQuestion *= number;
	}
	
	public static void decreaseHardnessByFactor(int number){
		hardnessOfQuestion /= number;
	}
	
	public static void increaseScoreByHardness(int hardness){
		score += hardness;
	}
	
	public static void outputScore(){
		System.out.println("Your current score is: " + score);
	}
	
	public static void outputFinalScore(){
		System.out.println("Your final score is: " + score);
		if(score==0){
			System.out.println("Were you even trying?");
		}
	}
	
	public static void outputHardness(){
		System.out.println("Current hardness is: " + hardnessOfQuestion);
	}
	
	public static void outputMessage(String message){
		System.out.println(message);
	}
	
	public static void outputCorrectAnswer(){
		System.out.println("The correct answer was: " + correctAnswer);
	}
}
>>>>>>> 9355a84ac7d231ec2bccd2c8448bfdfe8354840f
