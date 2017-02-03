/**
 * @author Varun Shrivastava
 * Aim : To implement N Queens Program
 * Date: 23-01-2017
 */
import java.util.Scanner;

public class NQueensProblem {
	// This variable denotes number of Queens  
    static int NumberOfQueens = 0;
 
    //This Function Display Solution
    void printSolution(int matrix[][]) {
        for (int outerIndex = 0; outerIndex < NumberOfQueens; outerIndex++) {
            for (int innerIndex = 0; innerIndex < NumberOfQueens; innerIndex++){
                System.out.print(" " + matrix[outerIndex][innerIndex] + " ");
            }
            System.out.println();
        }
    }
 
    //This Function Check Position of Assignment of Resultant Matrix
    boolean isSafe(int matrix[][], int row, int column) {
        int outerIndex, innerIndex;
 
        //checks for row
        for (outerIndex = 0; outerIndex < column; outerIndex++){
            if (matrix[row][outerIndex] == 1){
                return false;
            }
        }
        
        //checks upper diagonal
        for (outerIndex=row, innerIndex=column; outerIndex>=0 && innerIndex>=0; outerIndex--, innerIndex--){
            if (matrix[outerIndex][innerIndex] == 1){
                return false;
            }
        }
 
        //checks lower diagonal
        for (outerIndex=row, innerIndex=column; innerIndex>=0 && outerIndex<NumberOfQueens; outerIndex++, innerIndex--){
            if (matrix[outerIndex][innerIndex] == 1){
                return false;
            }
        }
        return true;
    }
 
    //This Function Assign Value for Resultant Matrix
    boolean solveNQUtil(int matrix[][], int column)
    {
        if (column >= NumberOfQueens)
            return true;
 
        for (int index = 0; index < NumberOfQueens; index++)
        {
            if (isSafe(matrix, index, column))											//Back Tracking Part
            {
                matrix[index][column] = 1;
 
                if (solveNQUtil(matrix, column + 1) == true){
                    return true;
                }
                matrix[index][column] = 0; 
            }
        }
        return false;
    }
 
    //
    int[][] solveNQ(int inputNumber)
    {
    	NumberOfQueens=inputNumber;
        int matrix[][] = new int[NumberOfQueens][NumberOfQueens];
       
        if (solveNQUtil(matrix, 0) == false)
        {
            System.out.print("Solution does not exist");
            printSolution(matrix);
            return matrix;
        }
 
        printSolution(matrix);
        return matrix;
    }
 
   
   //Main Function
    public static void main(String args[])
    {
    	try{
    		Scanner scannerObject = new Scanner (System.in);
    		
    		NumberOfQueens = scannerObject.nextInt();
    		NQueensProblem Queen = new NQueensProblem();
    		Queen.solveNQ(NumberOfQueens);
    		scannerObject.close();
    	}
    	catch(Exception exceptionObject){
    		System.out.println(exceptionObject);
    	}
    }
}
    