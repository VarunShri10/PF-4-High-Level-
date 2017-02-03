/**
 * @author Varun Shrivastava
 * Aim : To implement Permutation of String Program
 * Date: 23-01-2017
 */
import java.util.*;

public class PermutationStringProgram {
	//Result Set add all permutations of String in it
	static Set <String> permutationStringSet = new HashSet<String>();
	
	// This Recursive Function add Permutation String in Set
	 private static void permutationFunction(String fixedString, String word) {
	        if (word.isEmpty()) {
	            System.out.println(fixedString + word);
	            permutationStringSet.add(fixedString + word);
	        } 
	        else {
	            for (int i = 0; i < word.length(); i++) {
	                permutationFunction(fixedString + word.charAt(i),
	                word.substring(0, i) + word.substring(i + 1, word.length()));
	            }
	        }
	    }
	 
	 // This Functions Checks validity 
	 public Set<String> testBefore(String inputString){
		 	permutationStringSet.clear();
		 	inputString=inputString.trim();
		    Boolean testInputString=inputString.matches("");
		    System.out.println("Boolean Result : "+testInputString);
		    if(!testInputString)
		    permutationFunction("", inputString);
		    return permutationStringSet;
	 }
	 
	//Main Function
    public static void main(String args[]) {
    	try{
    		Scanner scannerObject = new Scanner(System.in);
    		String inputString = scannerObject.nextLine();
    		inputString=inputString.trim();
    		Boolean testString=inputString.matches("");
    		if(!testString)
    			permutationFunction("", inputString);
    		scannerObject.close();
    	}
    	catch(Exception exceptionObject){
    		System.out.println(exceptionObject);
    	}
    }
   
   
    
}