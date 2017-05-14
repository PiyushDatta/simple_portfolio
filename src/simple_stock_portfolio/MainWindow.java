package simple_stock_portfolio;

import javax.swing.*;
import java.awt.*;

// Where the main run function for the application will lie
public class MainWindow extends JFrame{
	public void init(){

		// Initial window
		JFrame startFrame = new JFrame("P.D");
		startFrame.setSize(1200, 800);


		// Panel to hold our buttons
		JPanel startPanel = new JPanel();
		startFrame.add(startPanel);

		// Password and text field for username and password
		JTextField userName = new JTextField(15);
		JLabel txtUser = new JLabel("Username: ");
		JPasswordField passWord = new JPasswordField(15);
		JLabel txtPassword = new JLabel("Password: ");
		startPanel.add(userName);
		startPanel.add(txtUser);
		startPanel.add(passWord);
		startPanel.add(txtPassword);

		// Button to login
		JButton loginButton = new JButton("Login");
		startPanel.add(loginButton);

		// Make everything centered
		startFrame.setLayout( new GridBagLayout());
		startFrame.add(txtUser, new GridBagConstraints());
		startFrame.add(userName, new GridBagConstraints());
		startFrame.add(txtPassword, new GridBagConstraints());
		startFrame.add(passWord, new GridBagConstraints());
		startFrame.add(loginButton, new GridBagConstraints());

		//getContentPane().add(startPanel);
		startFrame.setVisible(true);
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Take out the border around the text
		loginButton.setFocusable(false);

	}
	public static void main(String[] args) {
		// Run the program
		new MainWindow().init();

	}

}
