import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Results extends IClickerService {
 private HashMap<Integer, ArrayList> map;
 private ArrayList<String> answers= new ArrayList<String>();
 public Results()
 {
	 map = new HashMap();
	 
 }
 public Results(Student[] S, Question[] Q)
 {
	 super(S,Q);
	 map = new HashMap();
	 populateMap(S);
 }
private void populateMap(Student[] s) {
	for (int i=0; i<s.length; i++)
	{
		map.put(s[i].getID(), null);
	}
}
public void updateResults(Student[] s)	
{
	for (int i=0; i<s.length; i++)
	{
		map.put(s[i].getID(), s[i].getAns());
	}
}
public void displayResults(Student[] s)
{
	for (int i=0; i<s.length; i++)
	{
		System.out.print(s[i].getID() + " ");
		
		s[i].displayAns();
		System.out.println();
	}
}
}

