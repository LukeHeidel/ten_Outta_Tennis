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


	
	
	//Create the frame layer publicly
	public JFrame splashScreen = new JFrame("Welcome");
	public JFrame prelimInfoScreen = new JFrame("Welcome");
	public JFrame gameScreen = new JFrame("Tennis Game Score Controller");

		//OLD CODE
	/**
	 * 
        // Create a demo label
        JLabel label = new JLabel("New Label");
        //Create the menu bar.
        JMenuBar menuBar1 = new JMenuBar();
        JMenuBar menuBar2 = new JMenuBar();
        //Build the first menu.
        JMenu menu = new JMenu("Game Setup");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "Use this menu to build and run a match");
        menuBar1.add(menu);
        //Group of JMenuItems
        JMenuItem menuItem = new JMenuItem("Insert Fields",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
        		KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
        		"This doesn't really do anything yet");
        menu.add(menuItem);
        //Add a separator.
        menu.addSeparator();

        //window.setJMenuBar(theJMenuBar);
     
        //Build frame buttons.
        JButton button1 = new JButton("Player 1:"); //Player 1 name
        JButton button2 = new JButton("Player 2:"); //Player 2 name
        JButton button3 = new JButton("+1"); //Score for p1
        JButton button4 = new JButton("+1"); //Score for p2 
      
        JMenu penaltyMenu = new JMenu("Penalty");
        penaltyMenu.setMnemonic(KeyEvent.VK_A);
        penaltyMenu.getAccessibleContext().setAccessibleDescription(
                "Use this menu to build and run a match");
        
        menuBar1.add(penaltyMenu);
        //Group of JMenuItems
        JMenuItem penaltyItem1 = new JMenuItem("Minor penalty",KeyEvent.VK_T);
        penaltyItem1.setAccelerator(KeyStroke.getKeyStroke(
        		KeyEvent.VK_1, ActionEvent.ALT_MASK));
        penaltyItem1.getAccessibleContext().setAccessibleDescription(
        		"This doesn't really do anything yet");
        penaltyMenu.add(penaltyItem1);
        penaltyMenu.addSeparator();
        JMenuItem penaltyItem2 = new JMenuItem("Major penalty",KeyEvent.VK_T);
        penaltyMenu.add(penaltyItem2);
        penaltyMenu.addSeparator();
        JMenuItem penaltyItem3 = new JMenuItem("Ending penalty",KeyEvent.VK_T);
        penaltyMenu.add(penaltyItem3);
        penaltyMenu.addSeparator();
           
      
        button1.setBackground(Color.GREEN.brighter());
        button1.setForeground(Color.WHITE);
        //button1.addActionListener(new TheEndListener());
        button2.setBackground(Color.GREEN.brighter());
        button2.setForeground(Color.WHITE);
        
        button3.setBackground(Color.YELLOW);
        button3.setForeground(Color.BLACK);
        
        button4.setBackground(Color.YELLOW);
        button4.setForeground(Color.BLACK);
        
        penaltyMenu.setBackground(Color.RED);
        penaltyMenu.setForeground(Color.ORANGE);
        
        //window.add(label);
        
        //window.add(button1);
        //window.add(button2);
        //window.add(button3);
        //window.add(button4);
        window.add(penaltyMenu);
        window.add(menuBar1);
        //window.add(menuBar2);
        
        
        window.pack();
        window.setSize(800, 600);
        window.setLayout(null);
        window.setVisible(true);
        
        menuBar1.setBounds(50, 50, 125, 25);
        button1.setBounds(50, 150, 100, 25);
        button2.setBounds(50, 200, 100, 25);
        button3.setBounds(600, 150, 52, 25);
        button4.setBounds(600, 200, 52, 25);
        menuBar2.setBounds(50, 250, 100, 25);
	 */

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
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 25, 25);
        //Set the layout manager.
        gameScreen.setLayout(layout);
        //Set the background color
        gameScreen.getContentPane().setBackground(Color.GREEN.darker());
        
        //Create the menu bar.
        JMenuBar menuBar = new JMenuBar();
        //Create some menus
        JMenu penaltyMenu = new JMenu("Penalty");
        //Group of JMenuItems
        JMenuItem penaltyItem1 = new JMenuItem("Minor penalty",KeyEvent.VK_T);
        JMenuItem penaltyItem2 = new JMenuItem("Major penalty",KeyEvent.VK_T);
        JMenuItem penaltyItem3 = new JMenuItem("Ending penalty",KeyEvent.VK_T);
        
        penaltyMenu.add(penaltyItem1);
        penaltyMenu.add(penaltyItem2);
        penaltyMenu.add(penaltyItem3);
        penaltyMenu.addSeparator();
        
        menuBar.add(penaltyMenu);
        
        //Propagate window objects
        gameScreen.add(menuBar);
        
        gameScreen.pack();
        gameScreen.setSize(800, 600);
        
        gameScreen.setVisible(true);
        
        System.out.println("Done!");
	}
	
	public void setGameAction() {
		
		
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
		}
		
	}
}
