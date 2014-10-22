import java.util.ArrayList;


public class Student {
	private int ID;
	private ArrayList<String> answers;
	public Student()
	{
		this.ID = 0;
		this.answers=new ArrayList<String>();
	}
	
	public void setID(int id)
	{
		this.ID =id;
	}
	public int getID()
	{
		return this.ID;
	}
	
	public void updateAns(String ans)
	{
		answers.add(ans);
	}
	
	public ArrayList<String> getAns()
	{
		return answers;
	}
	
	public void displayAns()
	{
		
		for(int i=0; i<answers.size(); i++)
		{
			System.out.print(answers.get(i) + " ");
		}
		
	}

}
