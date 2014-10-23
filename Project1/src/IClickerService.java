import java.util.Scanner;


public class IClickerService {
	private Student[] students = null;
	private Question[] questions = null;
	public IClickerService()
	{
		students = null;
		questions = null;
	}
	
	public IClickerService(Student[] S, Question[] Q)
	{	
		students = new Student[S.length];
		questions = new Question[Q.length];
			
		for(int i=0; i<S.length; i++)
		{
			students[i]= new Student(); 
		}
		
		for(int i=0; i<S.length; i++)
		{
			students[i].setID(S[i].getID()); 
		}
		
		for(int i=0; i<Q.length; i++)
		{
			questions[i]= new Question();
		}
		for(int i=0; i<Q.length; i++)
		{
			questions[i].setQuest(Q[i].getQuest());
			questions[i].setAnswer(Q[i].getAnswer());
			questions[i].setChoices(Q[i].getChoices());
		}
	}
	
	public void play(Student[] S, Question[] Q)
	{
		String reply = null;
		Scanner in = new Scanner(System.in);
		for(int j=0; j<S.length; j++)
		{
			System.out.println();
			System.out.println("Student-ID: " +S[j].getID() + " is taking the quiz");
			for(int i=0; i<Q.length; i++)
			{
				System.out.printf("%s\n",Q[i].getQuest());
				Q[i].displayChoices();
				reply = in.next();
				S[j].updateAns(reply);
			}
		}
	}

}
