package tennisGame;

import tennisGame.TennisScoring;
import tennisGame.TennisPenalties;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

// TennisStart builds a basic window using javax.swing. 
// The window includes buttons that implement an action 
// listener that calls methods from the TennisScoring Class.
// TennisStart includes TennisSCoring and Tennis Penalties.
//
// TODO: Clean up window, finish adding buttons, call game logic methods,
// 		 add more options in JMenu to enter preliminary match information,
//		 possible layout change.

public class TennisStart {
		
	public void startGameWindow() {
		//Create the frame layer.
		JFrame window = new JFrame("Tennis Game Score Controller");
		//Use flow layout manager for now
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 25, 25);
        //Set the layout manager.
        window.setLayout(layout);
        //Set the background color
        window.getContentPane().setBackground(Color.GREEN.darker());
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
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "Use this menu to build and run a match");
        menuBar2.add(penaltyMenu);
        //Group of JMenuItems
        JMenuItem penaltyItem1 = new JMenuItem("Minor penalty");
        penaltyMenu.add(penaltyItem1);
        penaltyMenu.addSeparator();
        JMenuItem penaltyItem2 = new JMenuItem("Major penalty");
        penaltyMenu.add(penaltyItem2);
        penaltyMenu.addSeparator();
        JMenuItem penaltyItem3 = new JMenuItem("Ending penalty");
        penaltyMenu.add(penaltyItem3);
        penaltyMenu.addSeparator();
                
        menu.add(menuItem);
        //Add a separator.
        menu.addSeparator();
        
      
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
       // window.add(label);
        
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(button4);
        window.add(penaltyMenu);
        window.add(menuBar1);
        window.add(menuBar2);
        
        
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
        System.out.println("Done!");
	}
	
	public void setGameAction() {
		
	}
}
