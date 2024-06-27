package term_project_v1;

import javax.swing.*;

public class Card {
	
	public int id;
	public int value;
	public int state;
	public JButton button;
	
	public Card(int id, int value, int state, JButton button)
	{
		this.id = id;
		this.value = value;
		this.state = state;
		this.button = button;
	}

}
