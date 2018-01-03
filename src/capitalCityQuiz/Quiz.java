package capitalCityQuiz;

import java.util.Scanner;

/**
 * The Quiz class asks the user a question and determines whether the user
 * answers it correctly. It allows the user to keep trying if the user gives
 * the incorrect answer. It also allows the user to pass if the user gives up. 
 * 
 * @author Sadhana Yatapanage
 * @since 03-01-2018
 */

public class Quiz {
	private Scanner scan;
	
	public Quiz() {
		scan = new Scanner(System.in);
	}
	
	/**
	 * This method asks the user a question. If the user provides the correct
	 * answer, it returns true. If the user provides an incorrect answer, the
	 * user can keep trying. If the user types "PASS", the answer is displayed.
	 * 
	 * @param question Question asked from the user.
	 * @param answer Answer to the question.
	 * @return Boolean which returns true if the user types the answer correctly.
	 */
	public boolean quizoptions(String question, String answer){
		System.out.print(question);
		String attempt = scan.nextLine();
		
        if(attempt.equals(answer)){
            System.out.println("Correct!");
            return true;
            }
        
        while(!attempt.equals(answer) && (!attempt.equals("PASS"))){
            System.out.println("Incorrect. Try again.");
            attempt = scan.nextLine();
            if(attempt.equals(answer)){
            	System.out.println("Correct!");
            	return true;
            }
        }
        
        if(attempt.equals("PASS")){
            System.out.println("Answer: " + answer);
        }
        return false;
	}
	
	public void closeScanner(){
		scan.close();
	}
}



