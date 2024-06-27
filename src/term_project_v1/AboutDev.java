package term_project_v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDev extends JFrame{
	
	public AboutDev()
	{
		setTitle("About the Developer");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250,210,120));
        panel.setLayout(new GridLayout(10,3));
        
		Box box1 = Box.createVerticalBox();
		panel.add(box1);
		
		Box box2 = Box.createVerticalBox();
		panel.add(box2);
		
		JLabel text = new JLabel("	Ediz Güneş");
		panel.add(text);
		JLabel text2 = new JLabel("	20220702099");
		panel.add(text2);
		
		JPanel okpanel = new JPanel();
		okpanel.setLayout(new GridLayout(1,3));
		okpanel.setBackground(new Color(250,210,120));
		panel.add(okpanel);
		
		Box box3 = Box.createVerticalBox();
		okpanel.add(box3);
		
		Box box4 = Box.createVerticalBox();
		okpanel.add(box4);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	

}
