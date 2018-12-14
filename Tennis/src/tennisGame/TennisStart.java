package tennisGame;

import tennisGame.TennisScoring;
import tennisGame.TennisPenalties;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.JTextField;

// TennisStart builds a basic window using javax.swing. 
// The window includes buttons that implement an action 
// listener that calls methods from the TennisScoring Class.
// TennisStart includes TennisSCoring and Tennis Penalties.
//
// TODO: Clean up window, finish adding buttons, call game logic methods,
// 		 add more options in JMenu to enter preliminary match information,
//		 possible layout change.

public class TennisStart extends JFrame implements ActionListener {
	
	private boolean startGame = true;
	private boolean exitGame = true;
	
	private static final int NUMBER_OF_CHARS = 40;
	private static final int GENDER = 1;
	private JTextField playerOneName;
	private JTextField playerTwoName;
	private JTextField gender;
	private JTextField playerOneCountry;
	private JTextField playerTwoCountry;
	private JTextField stadiumName;
	private JTextField location;
	private JTextField fieldType;
	
    int playerOneGameScore = 0;
	int playerTwoGameScore = 0; 
	
	protected int requiredSets;
	
	Canvas canvas = new Canvas();
	TennisScoring scoring = new TennisScoring();
	
	JLabel PlayerOneSet1; 
    JLabel PlayerOneSet2; 
    JLabel PlayerOneSet3;
    JLabel PlayerOneSet4;
    JLabel PlayerOneSet5;
    JLabel GameSetOne;
    
    JLabel PlayerTwoSet1;
    JLabel PlayerTwoSet2;
    JLabel PlayerTwoSet3;
    JLabel PlayerTwoSet4;
    JLabel PlayerTwoSet5;
    JLabel GameSetTwo;

	
	
	//Create the frame layer publicly
	public JFrame splashScreen = new JFrame("Welcome");
	public JFrame prelimInfoScreen = new JFrame("Welcome");
	public JFrame gameScreen = new JFrame("Tennis Game Score Controller");


	public void startSplashScreen() {
		//Use flow layout manager for now
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 5, 25);
        //Set the layout manager.
        splashScreen.setLayout(layout);
        //Set the background color
        splashScreen.getContentPane().setBackground(Color.GREEN.darker());
        
        JButton viewLog = new JButton("View game log");
        JButton startNewGame = new JButton("Start a new game");
        JButton exit = new JButton("Exit program");
        
        viewLog.addActionListener(this);
        startNewGame.addActionListener(this);
        exit.addActionListener(new TheEndListener());
        
        splashScreen.add(viewLog);
        splashScreen.add(startNewGame);
        splashScreen.add(exit);
        
        splashScreen.pack();
        splashScreen.setSize(800, 600);
        splashScreen.setVisible(true);
	}
	
	public void prelimInfoScreen() {
		//Use flow layout manager for now
        GridLayout layout = new GridLayout(15, 2, 25, 25);
        //Set the layout manager.
        prelimInfoScreen.setLayout(layout);
        //Set the background color
        prelimInfoScreen.getContentPane().setBackground(Color.GREEN.darker());
        //JButton to commit preliminary fields
        JButton commit = new JButton("Commit information");
        commit.addActionListener(this);
        //New Labels for the fields
        JLabel welcomeLabel = new JLabel("Please enter the preliminary match information before continuing...");
        JLabel empty1 = new JLabel("");
        JLabel empty2 = new JLabel("");
        JLabel stadiumNameLabel = new JLabel("Stadium, Arena, or Court name: ");
        JLabel locationLabel = new JLabel("Stadium, Arena, or Court location: ");
        JLabel fieldTypeLabel = new JLabel("Stadium, Arena, or Court surface type: ");
        
        JLabel playerOneNameLabel = new JLabel("Enter player one's name: ");
        JLabel playerTwoNameLabel = new JLabel("Enter player two's name: ");
        JLabel playerOneCountryLabel = new JLabel("Enter player one's country: ");
        JLabel playerTwoCountryLabel = new JLabel("Enter player two's country: ");
        JLabel genderLabel = new JLabel("Male or Female Match: (M or F)");
        
        
        
        stadiumName = new JTextField(NUMBER_OF_CHARS);
        location = new JTextField(NUMBER_OF_CHARS);
        fieldType = new JTextField(NUMBER_OF_CHARS);
        playerOneName = new JTextField(NUMBER_OF_CHARS);
        playerTwoName = new JTextField(NUMBER_OF_CHARS);
        playerOneCountry = new JTextField(NUMBER_OF_CHARS);
        playerTwoCountry = new JTextField(NUMBER_OF_CHARS);
        gender = new JTextField(GENDER);
        
        prelimInfoScreen.add(welcomeLabel,BorderLayout.NORTH);
        prelimInfoScreen.add(empty1,BorderLayout.NORTH);
        
        prelimInfoScreen.add(stadiumNameLabel, BorderLayout.CENTER);
        prelimInfoScreen.add(stadiumName, BorderLayout.WEST);
        prelimInfoScreen.add(locationLabel,BorderLayout.CENTER);
        prelimInfoScreen.add(location, BorderLayout.WEST);
        prelimInfoScreen.add(fieldTypeLabel,BorderLayout.CENTER);
        prelimInfoScreen.add(fieldType, BorderLayout.WEST);
        
        prelimInfoScreen.add(playerOneNameLabel,BorderLayout.CENTER);
        prelimInfoScreen.add(playerOneName, BorderLayout.WEST);
        prelimInfoScreen.add(playerOneCountryLabel,BorderLayout.CENTER);
        prelimInfoScreen.add(playerOneCountry, BorderLayout.WEST);
        
        prelimInfoScreen.add(playerTwoNameLabel,BorderLayout.CENTER);
        prelimInfoScreen.add(playerTwoName, BorderLayout.WEST);
        prelimInfoScreen.add(playerTwoCountryLabel,BorderLayout.CENTER);
        prelimInfoScreen.add(playerTwoCountry, BorderLayout.WEST);
        
        prelimInfoScreen.add(genderLabel,BorderLayout.EAST);
        prelimInfoScreen.add(gender, BorderLayout.WEST);
        
        prelimInfoScreen.add(empty2,BorderLayout.NORTH);
        prelimInfoScreen.add(commit,BorderLayout.WEST);
                
        prelimInfoScreen.pack();
        prelimInfoScreen.setSize(1280, 720);
        prelimInfoScreen.setVisible(true);
        
	}

	public void startGameWindow() {
		//Use flow layout manager for now
        //Set the layout manager.
        
        //Set the background color
        gameScreen.getContentPane().setBackground(Color.GREEN.darker());
        
        //Create the menu bar.
        JMenuBar menuBar = new JMenuBar();
        //Create some menus.
        JMenu penaltyMenu = new JMenu("Penalty");
        //Group of JMenuItems.
        JMenuItem penaltyItem1 = new JMenuItem("Minor penalty",KeyEvent.VK_T);
        JMenuItem penaltyItem2 = new JMenuItem("Major penalty",KeyEvent.VK_T);
        JMenuItem penaltyItem3 = new JMenuItem("Ending penalty",KeyEvent.VK_T);
        
        //Group of JButtons.
        JButton playerOneScoreInc = new JButton("Player One +1");
        JButton playerTwoScoreInc = new JButton("Player Two +1");
        //JButton Listeners.
       
        
        //Group of JLables.
        JLabel playerOneLabel = new JLabel("Player One: " + playerOneName.getText());
        JLabel playerTwoLabel = new JLabel("Player Two: " + playerTwoName.getText());
        
        JLabel Set1 = new JLabel("Set 1: ");
        JLabel Set2 = new JLabel("Set 2: ");
        JLabel Set3 = new JLabel("Set 3: ");
        JLabel Set4 = new JLabel("Set 4: ");
        JLabel Set5 = new JLabel("Set 5: ");
        JLabel GameSet = new JLabel("GameSet:");
        
        PlayerOneSet1 = new JLabel("");
        PlayerOneSet2 = new JLabel("");
        PlayerOneSet3 = new JLabel("");
        PlayerOneSet4 = new JLabel("");
        PlayerOneSet5 = new JLabel("");
        GameSetOne = new JLabel("" + playerOneGameScore);
        
        PlayerTwoSet1 = new JLabel("");
        PlayerTwoSet2 = new JLabel("");
        PlayerTwoSet3 = new JLabel("");
        PlayerTwoSet4 = new JLabel("");
        PlayerTwoSet5 = new JLabel("");
        GameSetTwo = new JLabel("" + scoring.playerOneGameScore);
        
        penaltyMenu.add(penaltyItem1);
        penaltyMenu.add(penaltyItem2);
        penaltyMenu.add(penaltyItem3);
        penaltyMenu.addSeparator();
        
        menuBar.add(penaltyMenu);
        
        playerOneScoreInc.addActionListener(this);
        playerTwoScoreInc.addActionListener(this);
        //Propagate window objects
        gameScreen.add(menuBar);
        
        gameScreen.add(playerOneLabel);
        gameScreen.add(playerTwoLabel);
        
        gameScreen.add(playerOneScoreInc);
        gameScreen.add(playerTwoScoreInc);
        
        gameScreen.add(GameSet);
        gameScreen.add(GameSetOne);
        gameScreen.add(GameSetTwo);
        
        
        if (gender.getText().equals("F")) 
        {
        	requiredSets = 2;
        	
        	gameScreen.add(Set1);
        	gameScreen.add(Set2);
        	gameScreen.add(Set3);
        	
        	gameScreen.add(PlayerOneSet1);
        	gameScreen.add(PlayerOneSet2);
        	gameScreen.add(PlayerOneSet3);
        	
        	gameScreen.add(PlayerTwoSet1);
        	gameScreen.add(PlayerTwoSet2);
        	gameScreen.add(PlayerTwoSet3);
        	
        	
    		
        }
        else 
        {
        	requiredSets = 3;
        	
        	gameScreen.add(Set1);
        	gameScreen.add(Set2);
        	gameScreen.add(Set3);
        	gameScreen.add(Set4);
        	gameScreen.add(Set5);
        	
        	gameScreen.add(PlayerOneSet1);
        	gameScreen.add(PlayerOneSet2);
        	gameScreen.add(PlayerOneSet3);
        	gameScreen.add(PlayerOneSet4);
        	gameScreen.add(PlayerOneSet5);
        	
        	gameScreen.add(PlayerTwoSet1);
        	gameScreen.add(PlayerTwoSet2);
        	gameScreen.add(PlayerTwoSet3);
        	gameScreen.add(PlayerTwoSet4);
        	gameScreen.add(PlayerTwoSet5);
        	
        	
        }
        
        gameScreen.pack();
        gameScreen.setSize(1280, 720);
        gameScreen.setLayout(null);
        gameScreen.setVisible(true);
        
        //Initialize font.
        playerOneLabel.setFont(new Font("",Font.PLAIN,16));
        playerTwoLabel.setFont(new Font("",Font.PLAIN,16));
        
        playerOneLabel.setBounds(100,280,250,25);
        playerTwoLabel.setBounds(100,360,250,25);
        
        Set1.setBounds(225,250,250,25);
        Set2.setBounds(375,250,250,25);
        Set3.setBounds(500,250,250,25);
        Set4.setBounds(625,250,250,25);
        Set5.setBounds(750,250,250,25);
        
        PlayerOneSet1.setBounds(225,280,250,25);
        PlayerOneSet2.setBounds(375,280,250,25);
        PlayerOneSet3.setBounds(500,280,250,25);
        PlayerOneSet4.setBounds(625,280,250,25);
        PlayerOneSet5.setBounds(750,280,250,25);
        
        PlayerTwoSet1.setBounds(225,360,250,25);
        PlayerTwoSet2.setBounds(375,360,250,25);
        PlayerTwoSet3.setBounds(500,360,250,25);
        PlayerTwoSet4.setBounds(625,360,250,25);
        PlayerTwoSet5.setBounds(750,360,250,25);
        
        GameSet.setBounds(900,250,250,25);
        GameSetOne.setBounds(900,280,250,25);
        GameSetTwo.setBounds(900,360,250,25);
        
        
        
        playerOneScoreInc.setBounds(1000,280,150,25);
        playerTwoScoreInc.setBounds(1000,360,150,25);

        
        System.out.println("Done!");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		switch(actionCommand) 
		{
		case "Start a new game":
			splashScreen.dispose();
			prelimInfoScreen();
			break;
			
		case "Commit information":
			if((stadiumName.getText().equals("")) || (location.getText().equals("")) || (fieldType.getText().equals("")) || (playerOneName.getText().equals(""))
					|| (playerTwoName.getText().equals("")) || (playerOneCountry.getText().equals("")) || (playerTwoCountry.getText().equals("")) || (gender.getText().equals("")))
			{
				JOptionPane.showMessageDialog(prelimInfoScreen,
					    "Empty fields exist, please enter the all the preliminary match information before continuing...");
				System.out.println("Empty fields exist");	
			}
			else if (gender.getText().equals("Gamer")) 
			{
				JOptionPane.showMessageDialog(prelimInfoScreen,
					    "This says a lot about our society...");
			}
			else if(!(gender.getText().equals("M")) && (!(gender.getText().equals("F"))))
			{
				System.out.println(gender.getText());
				System.out.println("Invalid gender");
				JOptionPane.showMessageDialog(prelimInfoScreen,
					    "Please enter valid character, 'M' or 'F'.");
			}
			else if ((gender.getText().equals("M") ||(gender.getText().equals("F"))))
			{
				System.out.println("Triggered valid sequence");
				if(gender.getText().equals("M"))
					
					System.out.println("Male match");
				else if(gender.getText().equals("F"))
					System.out.println("Female match");
				prelimInfoScreen.dispose();
				startGameWindow();
			}
			break;
			
		case "Player One +1":
			scoring.PlayerOneScoring();
			playerOneGameScore = scoring.playerOneGameScore;
			GameSetOne = new JLabel("" + playerOneGameScore);
			gameScreen.add(GameSetOne);
			break;
			
		case "Player Two +1":
			scoring.PlayerTwoScoring();
			playerTwoGameScore = scoring.playerTwoGameScore;
			GameSetTwo = new JLabel("" + playerTwoGameScore);
			gameScreen.add(GameSetTwo);
			break;
			
		}
		
	}
}
