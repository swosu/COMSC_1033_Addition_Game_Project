
# Addition Game Redux

## Introduction 
We've already done the addition game.  Let's make it better.

## Project Outline
1.	Create variables used throughout our file
2.	In the main method, use a for loop to loop through the number of rounds defined in the beginning of the file.
3.	If the answer is correct, increase the score by 10, otherwise leave it alone and continue to the next round.
4.	After the final round, output the score.

##  References & Literature
*   Liang, Y. (2014). *Introduction to Java programming: Comprehensive version* (Tenth ed.). 

## Source Code
```java
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

```

## Console Output
```
Round 1. Begin.
What is 4 + 1?
Please answer in integers only.
5
Answer was correct.
Score is: 10
End of round 1
Round 2. Begin.
What is 66 + 69?
Please answer in integers only.
135
Answer was correct.
Score is: 110
End of round 2
Round 3. Begin.
What is 335 + 798?
Please answer in integers only.
1133
Answer was correct.
Score is: 1110
End of round 3
Round 4. Begin.
What is 3348 + 3870?
Please answer in integers only.
7218
Answer was correct.
Score is: 11110
End of final round
Thanks for playing!
Out of 4 total rounds...
Final score is: 11110
```

## Command Prompt Output
```

C:\Users\LAB\Desktop\workspace\addition_game_redux>git checkout -b dev
M       README.md
Switched to a new branch 'dev'

C:\Users\LAB\Desktop\workspace\addition_game_redux>git add .

C:\Users\LAB\Desktop\workspace\addition_game_redux>git commit -m "Starting the R
EADME.md with some basic info"
[dev 2c8805c] Starting the README.md with some basic info
 1 file changed, 3 insertions(+), 1 deletion(-)

C:\Users\LAB\Desktop\workspace\addition_game_redux>git add .

C:\Users\LAB\Desktop\workspace\addition_game_redux>git commit -m "Cleaned up com
mits and created randnumbyhardness method"
On branch dev
nothing to commit, working directory clean

C:\Users\LAB\Desktop\workspace\addition_game_redux>git commit -am "added correct
answer method"
On branch dev
nothing to commit, working directory clean

C:\Users\LAB\Desktop\workspace\addition_game_redux>git status
On branch dev
nothing to commit, working directory clean

C:\Users\LAB\Desktop\workspace\addition_game_redux>git add .

C:\Users\LAB\Desktop\workspace\addition_game_redux>git status
On branch dev
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        modified:   bin/COMSC_1033_Addition_Game_Class.class
        modified:   src/COMSC_1033_Addition_Game_Class.java


C:\Users\LAB\Desktop\workspace\addition_game_redux>git commit -m "finished conve
rting addition game using methods and for loops"
[dev b92175c] finished converting addition game using methods and for loops
 2 files changed, 97 insertions(+), 201 deletions(-)
 rewrite bin/COMSC_1033_Addition_Game_Class.class (99%)
 rewrite src/COMSC_1033_Addition_Game_Class.java (96%)

C:\Users\LAB\Desktop\workspace\addition_game_redux>git add .

C:\Users\LAB\Desktop\workspace\addition_game_redux>git commit -am "added a cheek
y message"
[dev b8631a7] added a cheeky message
 2 files changed, 3 insertions(+)

C:\Users\LAB\Desktop\workspace\addition_game_redux>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

C:\Users\LAB\Desktop\workspace\addition_game_redux>git merge dev
Updating e36d4ea..b8631a7
Fast-forward
 README.md                                |   4 +-
 bin/COMSC_1033_Addition_Game_Class.class | Bin 2908 -> 3083 bytes
 src/COMSC_1033_Addition_Game_Class.java  | 264 ++++++++++---------------------
 3 files changed, 88 insertions(+), 180 deletions(-)

C:\Users\LAB\Desktop\workspace\addition_game_redux>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jonathan-irvin
Password for 'https://jonathan-irvin@github.com':
To https://github.com/jonathan-irvin/addition_game_redux.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/jonathan-irvin/addition_g
ame_redux.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

C:\Users\LAB\Desktop\workspace\addition_game_redux>git fetch origin master
remote: Counting objects: 1, done.
remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (1/1), done.
From https://github.com/jonathan-irvin/addition_game_redux
 * branch            master     -> FETCH_HEAD
   e36d4ea..424a9a5  master     -> origin/master

C:\Users\LAB\Desktop\workspace\addition_game_redux>git merge origin/master
Already up-to-date!
Merge made by the 'recursive' strategy.

C:\Users\LAB\Desktop\workspace\addition_game_redux>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jonathan-irvin
Password for 'https://jonathan-irvin@github.com':
Counting objects: 16, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (16/16), done.
Writing objects: 100% (16/16), 3.95 KiB | 0 bytes/s, done.
Total 16 (delta 5), reused 0 (delta 0)
To https://github.com/jonathan-irvin/addition_game_redux.git
   424a9a5..2e1cdfa  master -> master

C:\Users\LAB\Desktop\workspace\addition_game_redux>
```

## Summary
We made the addition game better by incorporating for loops and methods.
>>>>>>> 9355a84ac7d231ec2bccd2c8448bfdfe8354840f
