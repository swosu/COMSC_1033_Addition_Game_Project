import java.util.Scanner;

public class MethodsAndLoopsPractice {
	public static void main(String[] args) {
		 
		// call the addition game.
		AdditionGameMethod();

	}
	public static void AdditionGameMethod() {
		System.out.println("Hello, inside addition game method.");
		int roundCount = 2;
		int hardness = 5;
		int hardnessStepSize = 5;
		int score = 0;
		boolean isAnswerCorrect;
		
		for(int counter = 1; counter <= roundCount; counter=counter+1){
			System.out.println("Inside the for loop. Round: " + counter);
			
			
			// Call the get and check answer method
			isAnswerCorrect = getAndCheckAnswerMethod(hardness);
			
			if(isAnswerCorrect){
				System.out.print("Your score was " + score);
				score = score + hardness;
				System.out.println(" and is now " + score);
				if(counter < roundCount){
					System.out.print("Your hardness was " + hardness);
					hardness = hardness * hardnessStepSize;
					System.out.println(" and is now " + hardness);
				}
				
			}else{
				if((hardness > 5) && (counter < roundCount)){
					System.out.println("Your hardness was " + hardness);
					hardness = hardness / hardnessStepSize;
					System.out.println(" and is now " + hardness);
				}
			}
		}
		System.out.print("\nThe game is complete.");
		System.out.println(" Your final score is: " + score);
	}
	public static boolean getAndCheckAnswerMethod(int hardness) {
		System.out.println("Inside get and check answer method.");
		
		int randomNumber1 = (int)(Math.random()*hardness);
		int randomNumber2 = (int)(Math.random()*hardness);
		//System.out.println("Please add these two numbers and provide an integer response:");
		System.out.println("\nWhat is " + randomNumber1 + " plus " + randomNumber2 + "?");
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		int correctAnswer = randomNumber1 + randomNumber2;
		if (studentAnswer == correctAnswer){
			System.out.println("Good work, your answer was correct.");
			return true;
		}else {
			System.out.println("Good try, but the correct answer was " + correctAnswer);
			return false;
		}
		
	}
}
