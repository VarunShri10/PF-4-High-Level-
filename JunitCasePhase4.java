/**
 * @author Varun Shrivastava
 * Aim : To implement JUnit Test Cases for All Programs of Phase4 Project
 * Date: 23-01-2017
 */

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitCasePhase4 {

	

	@Test							// Test  Tower Of Hanoi Program
	public void testTowerOfHanoi() {
		TowerOfHanoiProgram objectTestCase1=new TowerOfHanoiProgram();
		String testCaseResult1=objectTestCase1.TOH(1, 'A', 'B', 'C');		//Positive Test Case 
		String expectedTestCaseResult1="A -> B ";
		assertEquals(expectedTestCaseResult1, testCaseResult1);
		
		TowerOfHanoiProgram objectTestCase2=new TowerOfHanoiProgram();
		String testCaseResult2=objectTestCase2.TOH(2, 'A', 'B', 'C');		//Positive Test Case
		String expectedTestCaseResult2="A -> C A -> B C -> B ";
		assertEquals(expectedTestCaseResult2, testCaseResult2);
		
		TowerOfHanoiProgram objectTestCase3=new TowerOfHanoiProgram();
		String testCaseResult3=objectTestCase3.TOH(3, 'A', 'B', 'C');		//Positive Test Case
		String expectedTestCaseResult3="A -> B A -> C B -> C A -> B C -> A C -> B A -> B ";
		assertEquals(expectedTestCaseResult3, testCaseResult3);
		
		TowerOfHanoiProgram objectTestCase4=new TowerOfHanoiProgram();	//Negative Test Case
		String testCaseResult4=objectTestCase4.TOH(-4, 'A', 'B', 'C');
		String expectedTestCaseResult4="";
		assertEquals(expectedTestCaseResult4, testCaseResult4);
		
	}
	
	@Test							// Test  Permutation of String  Program
	public void testPermutationString() {
		PermutationStringProgram objectTestCase1=new PermutationStringProgram();
		Set<String > testCaseResult1=objectTestCase1.testBefore("abc");				// Positive Test Case
		Set<String>	expectedTestCaseResult1 = new HashSet<String>(Arrays.asList("abc","acb","bac","bca","cba","cab"));
		assertEquals(testCaseResult1, expectedTestCaseResult1);
		
		Set<String > testCaseResult2=objectTestCase1.testBefore("abcd");				// Positive Test Case
		Set<String>	expectedTestCaseResult2 = new HashSet<String>(Arrays.asList("abcd","abdc","acbd","acdb","adbc","adcb","bacd","badc","bcad","bcda","bdac","bdca","cabd","cadb","cbad","cbda","cdab","cdba","dabc","dacb","dbac","dbca","dcab","dcba"));
		assertEquals(testCaseResult2, expectedTestCaseResult2);
		
		
	}

	@Test							// Test  N Queens  Program
	public void testNQueensProgram() {
		NQueensProblem objectTestCase1=new NQueensProblem();
		int testCaseResult1[][]=objectTestCase1.solveNQ(4);
		int expectedTestCaseResult1[][]={{0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0}};		//Positive Test Case
		for(int i=0;i<4;i++)
		assertArrayEquals(expectedTestCaseResult1[i],testCaseResult1[i]);
		
		int testCaseResult2[][]=objectTestCase1.solveNQ(3);
		int expectedTestCaseResult2[][]={{0,0,0},{0,0,0},{0,0,0},{0,0,0}};				//Negative Test Case
		for(int i=0;i<3;i++)
		assertArrayEquals(expectedTestCaseResult2[i],testCaseResult2[i]);
		
		
	}
}
