package term_project_v1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_menu {
	
	private static int gamemode;
	
	public static int getGamemode() {
		return gamemode;
	}

	public static void setGamemode(int gamemode) {
		Main_menu.gamemode = gamemode;
	}

	public static void main(String[] args)
	{
		BackgroundImgFrame frame = new BackgroundImgFrame();
        frame.setVisible(true);
		
		JButton startbutton = new JButton("Start Game");
		startbutton.setSize(200,100);
		startbutton.setBounds(300, 200, 150, 40);
		frame.add(startbutton);
		
		startbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gamemode = 1;
				Level1 level1 = new Level1();
				level1.setVisible(true);
				level1.startgame();
			}
		});
		
		JButton selectbutton = new JButton("Select Level");
		selectbutton.setSize(200,100);
		selectbutton.setBounds(300, 250, 150, 40);
		frame.add(selectbutton);
		
		selectbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gamemode = 2;
				LevelSelector levels = new LevelSelector();
				levels.setVisible(true);
				
			}
		});
		
		JButton instbutton = new JButton("Instructions");
		instbutton.setSize(200,100);
		instbutton.setBounds(300, 300, 150, 40);
		frame.add(instbutton);
		
		instbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Instructions instructions = new Instructions();
				instructions.setVisible(true);
				
			}
		});
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.setSize(200,100);
		exitbutton.setBounds(300, 350, 150, 40);
		frame.add(exitbutton);
		
		exitbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		JLabel menutitle = new JLabel();
		frame.add(menutitle);
		
		menutitle.setText("Ediz's Memory Cards");
		menutitle.setBounds(165, 75, 450, 100);
		menutitle.setForeground(new Color(250,210,120));
		
		Font titlefont = new Font("Impact", Font.BOLD, 50);
		
		menutitle.setFont(titlefont);
		
	

	}

}
