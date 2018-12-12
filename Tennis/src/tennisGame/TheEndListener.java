package tennisGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheEndListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Something Happened!");
		System.exit(0);
	}

}
