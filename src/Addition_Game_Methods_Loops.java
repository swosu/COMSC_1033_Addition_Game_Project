import java.util.Scanner;

public class Addition_Game_Methods_Loops {
	public static void main(String[] args) {
		
		// call the addition game method.
		additionGameMethod();
		
		// call the method to test  isAnswerCorrectMethod
		//boolean testOutput = isAnswerCorrectMethod(5);
		
		System.out.println("Everything completed.");
	}
	public static void additionGameMethod() {
		System.out.println("Inside the addition game method.");
		int hardness = 5;
		int score = 0;
		int roundCount = 2;
		boolean isAnswerCorrect;
		
		for(int counter=1; counter<=roundCount; counter = counter + 1){
			System.out.println("Inside for loop. Round: " + counter );
			isAnswerCorrect = isAnswerCorrectMethod(hardness);
			
		}
		return;
	}
	public static boolean isAnswerCorrectMethod(int hardness) {
		System.out.println("Inside check answer method");
		System.out.println("The variable hardness is: " + hardness);
		return false;
	}
}
