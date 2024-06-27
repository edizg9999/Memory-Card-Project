package term_project_v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardClicked implements ActionListener{
	
	private int cardId;
	private Game game;

	public CardClicked(int cardId, Game game)
	{
		this.cardId = cardId;
		this.game = game;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			game.cardchoose(cardId);

	}

}
