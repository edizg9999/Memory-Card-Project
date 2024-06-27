package term_project_v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Instructions extends JFrame{
	
	public Instructions()
	{
		setTitle("Instructions");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250,210,120));
        panel.setLayout(new GridLayout(10,3));
        
		Box box1 = Box.createVerticalBox();
		panel.add(box1);
		
		Box box2 = Box.createVerticalBox();
		panel.add(box2);
		
		JLabel text = new JLabel("Instructions:");
		panel.add(text);
		JLabel text2 = new JLabel("There are 3 levels in the game, it gets gradually harder!");
		panel.add(text2);
		JLabel text3 = new JLabel("Match all pairs of cards to win!");
		panel.add(text3);
		
		JPanel okpanel = new JPanel();
		okpanel.setLayout(new GridLayout(1,3));
		okpanel.setBackground(new Color(250,210,120));
		panel.add(okpanel);
		
		Box box3 = Box.createVerticalBox();
		okpanel.add(box3);
		
		JButton ok = new JButton("OK");
		okpanel.add(ok);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		Box box4 = Box.createVerticalBox();
		okpanel.add(box4);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	

}
