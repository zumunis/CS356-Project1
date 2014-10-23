/* Zaki U Munis
 * Assignment 1
 * CS 356
 * Oct 22, 2014
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class SimulationDriver {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numofStudents, numofQuestions;
		System.out.println("This is an IClicker Service");
		System.out.println("Please Enter the number of questions");
		numofQuestions = in.nextInt();
		
		System.out.println("Please Enter the number of Students taking the quiz");
		numofStudents = in.nextInt();
		
		Student[] StuArray = new Student[numofStudents];
		initializeStudents(StuArray);
		Question[] QArray = new Question[numofQuestions];
		initializeQuestions(QArray);
		
		IClickerService Quiz = new IClickerService();
		Quiz = new IClickerService(StuArray, QArray);
		Quiz.play();
		
		Results R = new Results(StuArray, QArray);
		R.updateResults(StuArray);
		R.displayResults(StuArray);
		

	}
	
	private static void initializeQuestions(Question[] qArray) {
		Scanner in = new Scanner(System.in);
		String quest = null;
		String ans = null;
		String choices = null;
		int num=1;
		for(int i=0; i<qArray.length; i++)
		{
			num += i;
			qArray[i] = new Question();
			System.out.println("Please Enter the Question " + num);
			quest = in.nextLine();
			System.out.println("Please Enter the possible answers for Question" + num +" separated by space ");
			choices = in.nextLine();
			System.out.println("Please Enter the correct answer for Question " + num);
			ans = in.nextLine();
			SetupQuestion(qArray[i], quest, ans, choices);
		}
		
	}

	private static void SetupQuestion(Question Q, String quest,
			String ans, String choices) {
		Q.setQuest(quest);
		Q.setAnswer(ans);
		String[] temp = choices.split("\\s");
		ArrayList<String> temp1 = new ArrayList<String>();
		for (int i=0; i<temp.length; i++)
		{
			temp1.add(temp[i]);
		}
		Q.setChoices(temp1);
	}

	private static void initializeStudents(Student[] S)
	{
		int uniqueID = 0;
		for(int i=0; i<S.length; i++)
		{	
			S[i]= new Student();
		}
		for(int i=0; i<S.length; i++)
		{	
			uniqueID = generateID(S);	
			S[i].setID(uniqueID);
		}
		
	}

	private static int generateID(Student[] S) {
		
		Random rand = new Random();
	    int id =rand.nextInt((9999999-1000000)+1)+1000000;
	    while(!Unique(id,S))
	    {
	    	id =rand.nextInt((1000000-9999999)+1)+1000000;
	    }
	    return id;
		
	}
	
	private static boolean Unique(int id, Student[] s)
	{
		for(int i=0; i<s.length; i++)
		{
			if(s[i].getID()==id)
				return false;
		}
		return true;
	}

}
