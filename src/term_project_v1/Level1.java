package term_project_v1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Collections;

public class Level1 extends Game{
	
	private JButton[] cardsarray = new JButton[16];
	JLabel triesleft = new JLabel("Tries Left: ");
    ImageIcon noimage = new ImageIcon("Java Project Assets/Level1-InternetAssets/no_image.png");
    ImageIcon image1 = new ImageIcon("Java Project Assets/Level1-InternetAssets/1.png");
    ImageIcon image2 = new ImageIcon("Java Project Assets/Level1-InternetAssets/2.png");
    ImageIcon image3 = new ImageIcon("Java Project Assets/Level1-InternetAssets/3.png");
    ImageIcon image4 = new ImageIcon("Java Project Assets/Level1-InternetAssets/4.png");
    ImageIcon image5 = new ImageIcon("Java Project Assets/Level1-InternetAssets/5.png");
    ImageIcon image6 = new ImageIcon("Java Project Assets/Level1-InternetAssets/6.png");
    ImageIcon image7 = new ImageIcon("Java Project Assets/Level1-InternetAssets/7.png");
    ImageIcon image8 = new ImageIcon("Java Project Assets/Level1-InternetAssets/8.png");
	
	public Level1()
	{
		setTitle("Level 1");
		setSize(480,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.setSize(480,600);
		add(panel);
		
		JPanel display = new JPanel();
		display.setSize(480,120);
		panel.add(display, BorderLayout.NORTH);
		display.setBackground(new Color(250,230,75));
	
		Box display1 = Box.createVerticalBox();
		display1.setPreferredSize(new Dimension(480, 120));
		display.add(display1);
		
		JLabel level = new JLabel("LEVEL 1");
		level.setFont(new Font("Arial", Font.BOLD, 36)); 
		level.setForeground(Color.WHITE);
		level.setHorizontalAlignment(SwingConstants.CENTER);
		level.setAlignmentX(Component.CENTER_ALIGNMENT);
		display1.add(level);
		
	
		triesleft.setFont(new Font("Arial", Font.BOLD, 36)); 
		triesleft.setForeground(Color.WHITE);
		triesleft.setHorizontalAlignment(SwingConstants.CENTER);
		triesleft.setAlignmentX(Component.CENTER_ALIGNMENT);
		display1.add(triesleft);
		
		JPanel cards = new JPanel();
		cards.setSize(480,480);
		cards.setLayout(new GridLayout(4,4));
		panel.add(cards, BorderLayout.CENTER);
	
		for (int i = 0; i < 16; i++) 
		{
            JButton card = new JButton();
            card.setIcon(noimage);
            card.setPreferredSize(new Dimension(120, 120));
            card.addActionListener(new CardClicked(i, this));
            cards.add(card);
            cardsarray[i] = card;        
        }
		
		JMenuBar menubar = new JMenuBar();
		JMenu game = new JMenu("Game");
        menubar.add(game);
        
        JMenu about = new JMenu("About");
        menubar.add(about);
        
        JMenu exit = new JMenu("Exit");
        menubar.add(exit);
        
        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem hiscores = new JMenuItem("High Scores");
        JMenuItem exiting = new JMenuItem("Exit");
        JMenuItem aboutg = new JMenuItem("About Game");
        JMenuItem aboutd = new JMenuItem("About Developer");
        
        game.add(restart);
        
        restart.addActionListener(e -> {
            startgame();
        });
        
        game.add(hiscores);
        
        hiscores.addActionListener(e -> {
            HighScore hi = new HighScore();
            hi.setVisible(true);
            
        });
        about.add(aboutg);
        
        aboutg.addActionListener(e -> {
            AboutGame abou = new AboutGame();
            abou.setVisible(true);
            
        });
        
        about.add(aboutd);
        
        aboutd.addActionListener(e -> {
            AboutDev dev = new AboutDev();
            dev.setVisible(true);
            
        });
        
        exit.add(exiting);
        
        exiting.addActionListener(e -> {
            dispose();
        });
        
        game.addSeparator();
        
        setJMenuBar(menubar);
	}

	@Override
	public void startgame() {
		
		level = 1;
		
		chosen = false;
		clickable = true;
		
		foundcards = 0;
		
		score = 0;
		
		gameWon = false;
		
		for(int i=0; i<16; i++)
		{
			cardsarray[i].setIcon(noimage);
		}
		
		tries = 18;
		triesleft.setText("Tries Left: " + tries);
		
		cardList.clear();
		
		for (int i = 0; i < 16; i++) 
		{
			cardList.add(new Card(i, (i+2)/2, 0, null));
	    }
		
		Collections.shuffle(cardList);
		
		for (int i = 0; i < 16; i++) 
		{
			cardList.get(i).button = cardsarray[i];
	    }
		
	}

	@Override
	public void cardchoose(int id) {
	    if (tries > 0 && !gameWon) { 
	        if (clickable) {
	            clickable = false;

	            switch (cardList.get(id).value) {
	                case 1:
	                    cardList.get(id).button.setIcon(image1);
	                    break;
	                case 2:
	                    cardList.get(id).button.setIcon(image2);
	                    break;
	                case 3:
	                    cardList.get(id).button.setIcon(image3);
	                    break;
	                case 4:
	                    cardList.get(id).button.setIcon(image4);
	                    break;
	                case 5:
	                    cardList.get(id).button.setIcon(image5);
	                    break;
	                case 6:
	                    cardList.get(id).button.setIcon(image6);
	                    break;
	                case 7:
	                    cardList.get(id).button.setIcon(image7);
	                    break;
	                case 8:
	                    cardList.get(id).button.setIcon(image8);
	                    break;
	                default:
	                    break;
	            }

	            if (cardList.get(id).state == 0 && !chosen) {
	                cardList.get(id).state = 1;
	                chosen = true;
	                clickable = true;
	            } else if (cardList.get(id).state == 0 && chosen) {
	                boolean found = false;
	                for (int i = 0; i < cardList.size(); i++) {
	                    if (cardList.get(i).state == 1 && cardList.get(i).value == cardList.get(id).value) {
	                        cardList.get(id).state = 2;
	                        cardList.get(i).state = 2;
	                        found = true;
	                        foundcards++;
	                        score += 5;
	                        break;
	                    }
	                }
	                if (!found) {
	                    Timer timer = new Timer(1000, new ActionListener() {
	                        @Override
	                        public void actionPerformed(ActionEvent e) {
	                            cardList.get(id).button.setIcon(noimage);
	                            cardList.get(id).state = 0;

	                            for (int i = 0; i < cardList.size(); i++) {
	                                if (cardList.get(i).state == 1) {
	                                    cardList.get(i).button.setIcon(noimage);
	                                    cardList.get(i).state = 0;
	                                }
	                            }
	                            clickable = true;
	                        }
	                    });
	                    timer.setRepeats(false);
	                    timer.start();
	                    score -= 1;
	                    tries--;
		                triesleft.setText("Tries Left: " + tries);
	                } else {
	                    clickable = true;
	                }
	                chosen = false;
	               
	            }
	        }
	        if (foundcards == 8 && !gameWon) {  
	            gameWon = true; 
	            addscore(score);
	            if(Main_menu.getGamemode() == 1)
	            {
	            	L1NextLevel next = new L1NextLevel();
	            	next.setVisible(true);
	            }
	            else
	            {
	            	YouWon youwon = new YouWon();
	   	            youwon.setVisible(true);
	            }
	         
	        }
	    } else if (tries == 0) {
	        GameOver gameover = new GameOver();
	        gameover.setVisible(true);
	    }
	}

	@Override
	public void addscore(int score) {
		
		if(highScores.size() < 10)
		{
			highScores.add(score);
		}
		else
		{
			int minScore = Collections.min(highScores);
			if (score > minScore) 
			{
				highScores.remove(minScore);
				highScores.add(score);
	        }
		}
		
		
		highScores.sort(Collections.reverseOrder());
		
	}

}
