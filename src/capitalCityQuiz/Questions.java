package capitalCityQuiz;

/**
 * This class contains the main method which makes use of the Quiz class.
 * 
 * @author Sadhana Yatapanage
 * <p>
 * Created on: 03-01-2018
 */

public class Questions {

	public static void main(String[] args) {

	       System.out.println("Capital City Quiz - Test your knowledge!" + 
	                "\n" + "Note: Type PASS to move onto next question." + "\n");
	        
	        int count = 0;
	        Quiz quiz = new Quiz();
	        
	        boolean question = quiz.quizoptions("Q1: What is the capital of Japan? ", "Tokyo");
	        if(question == true){
	            count += 1;
	        }

	        question = quiz.quizoptions("Q2: What is the capital of France? ", "Paris");
	        if(question == true){
	            count += 1;
	        }
	        
	        question = quiz.quizoptions("Q3: What is the capital of Thailand? ", "Bangkok");
	        if(question == true){
	            count += 1;
	        }
	        
	        question = quiz.quizoptions("Q4: What is the capital of Switzerland? ", "Bern");
	        if(question == true){
	            count += 1;
	        }
	        
	        question = quiz.quizoptions("Q5: What is the capital of Peru? ", "Lima");
	        if(question == true){
	            count += 1;
	        }
	        
	        System.out.printf("\n" + "Your final score is: %d / 5" + "\n", count);
	        
	 	   	quiz.closeScanner();
	    }
	}
