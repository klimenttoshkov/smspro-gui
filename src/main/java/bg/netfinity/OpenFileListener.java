package bg.netfinity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class OpenFileListener implements ActionListener {

	@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileChooser = new JFileChooser();	
			fileChooser.showOpenDialog(null);
		}

}
