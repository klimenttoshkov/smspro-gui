package bg.netfinity;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class mainApp {
	
	JFrame mainFrame;
	
	JButton openButton;
	JButton sendButton;
	
	JTable pendingTable;
	JTable sentTable;

	mainApp() {
		JFrame mainFrame = new JFrame("smspro.bg Sender");

		mainFrame.setSize(800, 500);
		mainFrame.setLayout(null);

		JButton button = new JButton("Open Excel File");

		button.setBounds(150, 100, 100, 40);
		mainFrame.add(button);
	
		JTable table = new JTable();
		table.setBounds(0, 150, 800, 400);
		
		mainFrame.add(table);
		
		mainFrame.setVisible(true);
	}
	
	
}
