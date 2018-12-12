package tennisGame;

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
        JMenuBar menuBar = new JMenuBar();
        //Build the first menu.
        JMenu menu = new JMenu("Game Setup");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "Use this menu to build and run a match");
        menuBar.add(menu);
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
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        
      
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.BLACK);
        //button1.addActionListener(new TheEndListener());
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setForeground(Color.BLACK);
        
       // window.add(label);
        
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(button4);
        window.add(button5);
        window.add(menuBar);
        
        
        window.pack();
        window.setSize(500, 400);
        window.setLayout(null);
        window.setVisible(true);
        System.out.println("Done!");
	}
}
