package term_project_v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighScore extends JFrame{
	
	public HighScore()
	{
		setTitle("High Scores");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
        JTextArea highScoresArea = new JTextArea();
        highScoresArea.setEditable(false);
        highScoresArea.setFont(new Font("Arial", Font.PLAIN, 18));
        add(new JScrollPane(highScoresArea), BorderLayout.CENTER);
        
        StringBuilder scoresText = new StringBuilder("High Scores:\n");
        for (int score : Game.getHighScores()) {
            scoresText.append(score).append("\n");
        }
        highScoresArea.setText(scoresText.toString());
	
		
	}
	

}
