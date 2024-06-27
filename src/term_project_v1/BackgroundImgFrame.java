package term_project_v1;

import javax.swing.*;
import java.awt.*;

public class BackgroundImgFrame extends JFrame{
	
	public BackgroundImgFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setTitle("Ediz's Memory Cards");
		
		JPanel panel = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				
				ImageIcon img = new ImageIcon("Java Project Assets/background.jpg");
				g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), null);
			}
		};
		
		panel.setLayout(null);
		setContentPane(panel);
	}	

}
