package term_project_v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LevelSelector extends JFrame{
	
	public LevelSelector()
	{
		setTitle("Select Level");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        
        JButton l1 = new JButton("LEVEL 1");
        panel.add(l1);
        l1.setBackground(new Color(250,230,75));
        
        l1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Level1 level1 = new Level1();
				level1.setVisible(true);
				level1.startgame();
			}
		});
        
        JButton l2 = new JButton("LEVEL 2");
        panel.add(l2);
        l2.setBackground(new Color(250,200,55));
        
    
        
        l2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Level2 level2 = new Level2();
				level2.setVisible(true);
				level2.startgame();
			}
		});
        
 
        
        JButton l3 = new JButton("LEVEL 3");
        panel.add(l3);
        l3.setBackground(new Color(250,170,35));

        l3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Level3 level3 = new Level3();
				level3.setVisible(true);
				level3.startgame();
			}
		});

        getContentPane().add(panel, BorderLayout.CENTER);
	}

}
