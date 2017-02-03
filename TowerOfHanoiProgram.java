/**
 * @author Varun Shrivastava
 * Aim : To implement Tower of Hanoi Program
 * Date: 23-01-2017
 */
import java.util.Scanner;

public class TowerOfHanoiProgram {
		//Result String append all the disk movements in it and return  it
		String result="";
		
		// Recursion Function for TOH
		public String TOH(int numberOfDisk, char A, char B, char C) {
		   if (numberOfDisk > 0) {
		      TOH((numberOfDisk- 1), A, C, B);				// Recursion Call 
		      System.out.println(A+" -> "+B);
		      result=result.concat(A+" -> "+B+" ");
		      TOH((numberOfDisk - 1), C, B, A);				// Recursion Call
		   }
		   return result;
		}
		
		//Main Function
		   public static void main(String[] args) {
			   try{
				   int numberOfDisc;
				   System.out.println("Enter number of plates:");
				   TowerOfHanoiProgram object=new TowerOfHanoiProgram();
				   Scanner scannerObject=new Scanner(System.in);
				   numberOfDisc=scannerObject.nextInt();
				   if(numberOfDisc>0){
					   String result=object.TOH((numberOfDisc ), 'A', 'B', 'C');
					   scannerObject.close();
				   }
				   else{
				   		System.out.println("Number Should be Greater than 0");
				   }
			   }
			   catch(Exception exceptionObject){
				   System.out.println(exceptionObject);
			   }
		   }
}