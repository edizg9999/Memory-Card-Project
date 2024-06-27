package term_project_v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L2NextLevel extends JFrame{
	
	public L2NextLevel()
	{
		setTitle("You Won!");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,255,0));
        panel.setLayout(new GridLayout(10,3));
        
		Box box1 = Box.createVerticalBox();
		panel.add(box1);
		
		Box box2 = Box.createVerticalBox();
		panel.add(box2);
		
		JLabel text = new JLabel("You Won!");
		panel.add(text);
		JLabel text2 = new JLabel("Congratulations");
		panel.add(text2);
		
		JPanel okpanel = new JPanel();
		okpanel.setLayout(new GridLayout(1,3));
		okpanel.setBackground(new Color(0,255,0));
		panel.add(okpanel);
		
		Box box3 = Box.createVerticalBox();
		okpanel.add(box3);
		
		JButton ok = new JButton("NEXT LEVEL");
		okpanel.add(ok);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Level3 level3 = new Level3();
				level3.setVisible(true);
				level3.startgame();
			}
		});
		
		Box box4 = Box.createVerticalBox();
		okpanel.add(box4);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	

}
