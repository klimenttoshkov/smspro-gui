package bg.netfinity;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;


public class MainApp {

	JFrame mainFrame;

	JButton openButton;
	JButton sendButton;

	JTable pendingTable;
	JTable sentTable;

	MainApp() {
		JFrame mainFrame = new JFrame("smspro.bg Sender");

		mainFrame.setSize(810, 900);
		mainFrame.setLayout(null);

		// Open Button
		openButton = new JButton("Open Excel File");
		openButton.setBounds(5, 5, 200, 40);
		openButton.addActionListener(new OpenFileListener());
		mainFrame.add(openButton);

		// Send Button
		sendButton = new JButton("Send messages");
		sendButton.setBounds(210, 5, 200, 40);
		sendButton.setEnabled(false);
		mainFrame.add(sendButton);

		// Pending Table
		pendingTable = new JTable();
		pendingTable.setBounds(5, 50, 800, 400);
		mainFrame.add(pendingTable);

		// Sent Table
		pendingTable = new JTable();
		pendingTable.setBounds(5, 460, 800, 400);
		mainFrame.add(pendingTable);

		mainFrame.setVisible(true);
	}


}
