import java.util.ArrayList;


public class Question {
	
private String quest;
private String answer;
private ArrayList<String> choices = new ArrayList<String>();

public Question(){ 
	quest = null;
	answer = null;
	choices = null;
}

public String getQuest() {
	return quest;
}
public void setQuest(String quest) {
	this.quest = quest;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

public ArrayList<String> getChoices() {
	return choices;
}

public void setChoices(ArrayList<String> choices) {
	this.choices = choices;
}

public void displayChoices() {
	int num =1;
	for(int i=0; i<choices.size(); i++)
	{
		num += i;
		System.out.println(num + ". "+choices.get(i) );
	}
	
}


}