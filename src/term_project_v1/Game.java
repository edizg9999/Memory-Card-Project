package term_project_v1;

import javax.swing.*;
import java.awt.*;

import java.util.*;
import java.util.List;

public abstract class Game extends JFrame{

	protected static int level;
	protected List<Card> cardList = new ArrayList<>();
	protected static int tries;
	protected static int foundcards;
	
	protected static int score;
	protected static ArrayList<Integer> highScores = new ArrayList<>();
	
	public static ArrayList<Integer> getHighScores() {
		return highScores;
	}
	public static void setHighScores(ArrayList<Integer> highScores) {
		Game.highScores = highScores;
	}

	protected static boolean chosen;
	protected static boolean clickable;
	protected static boolean gameWon;
	
	public static boolean isClickable() {
		return clickable;
	}
	public static void setClickable(boolean clickable) {
		Game.clickable = clickable;
	}
	public abstract void startgame();
	public abstract void cardchoose(int id);
	
	public abstract void addscore(int score);

}
