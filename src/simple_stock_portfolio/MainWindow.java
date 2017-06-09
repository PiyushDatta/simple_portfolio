
package simple_stock_portfolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow implements ActionListener {

	private JPanel mainPanel;
	private static MainWindow mainW;
	protected static JPanel mainWGUI = MainWindow.createAndShowMainWGUI();

	private JPanel prepareMainWGUI() {

		mainPanel = new JPanel(new GridBagLayout());

		// Button for logging in, with respective GridBagConstraint
		// setFocusable is set to false to take out the border around the text
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(this::actionPerformed);
		loginButton.setActionCommand("Open");
		GridBagConstraints lButtonC = new GridBagConstraints();
		loginButton.setFocusable(false);

		// Username text-field and JLabel with respective GridBagConstraints
		JTextField tfUsername = new JTextField(15);
		GridBagConstraints tfUserC = new GridBagConstraints();
		JLabel txtUser = new JLabel("Username: ");
		GridBagConstraints txtUserC = new GridBagConstraints();

		// Password text-field and JLabel with respective GridBagConstraints
		JPasswordField tfPassword = new JPasswordField(15);
		GridBagConstraints tfPassC = new GridBagConstraints();
		JLabel txtPassword = new JLabel("Password: ");
		GridBagConstraints txtPassC = new GridBagConstraints();

		// GridBagConstraints c = new GridBagConstraints();
		// c.anchor = GridBagConstraints.HORIZONTAL;
		// c.gridx = 0;
		// c.gridy = 0;
		// c.insets = new Insets(5, 5, 5, 5);

		// Add all components to the JFrame
		// Making sure to add the text before the text-fields
		mainPanel.add(txtUser, txtUserC);
		// mainPanel.add(tfUsername, tfUserC);
		// mainPanel.add(txtPassword, txtPassC);
		// mainPanel.add(tfPassword, tfPassC);
		// mainPanel.add(loginButton, lButtonC);

		return mainPanel;
	}

	// Instructions
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		// if (cmd.equals("Open")) {
		// new MainWindow();
		// MainWindow.createAndShowMainWGUI();
		// }
	}

	// Callable from Main class
	public static JPanel createAndShowMainWGUI() {
		mainW = new MainWindow();
		return mainW.prepareMainWGUI();
	}

}
