
package simple_stock_portfolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginWindow implements ActionListener {

    private JPanel loginPanel;
    private static LoginWindow logWin;
    protected static JPanel loginGUI = LoginWindow.createAndShowLoginGUI();

    private JPanel prepareLoginGUI() {

        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(Color.BLACK);

        // Button for logging in, with respective GridBagConstraint
        // setFocusable is set to false to take out the border around the text
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this::actionPerformed);
        loginButton.setActionCommand("Open");
        GridBagConstraints lButtonC = new GridBagConstraints();
        loginButton.setFocusable(false);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));


        // Username text-field and JLabel with respective GridBagConstraints
        JTextField tfUsername = new JTextField(15);
        GridBagConstraints tfUserC = new GridBagConstraints();
        JLabel txtUser = new JLabel("Username: ");
        txtUser.setForeground(Color.WHITE);
        GridBagConstraints txtUserC = new GridBagConstraints();


        // Password text-field and JLabel with respective GridBagConstraints
        JPasswordField tfPassword = new JPasswordField(15);
        GridBagConstraints tfPassC = new GridBagConstraints();
        JLabel txtPassword = new JLabel("Password: ");
        txtPassword.setForeground(Color.WHITE);
        GridBagConstraints txtPassC = new GridBagConstraints();

        // GridBagConstraints c = new GridBagConstraints();
        // c.anchor = GridBagConstraints.HORIZONTAL;
        // c.gridx = 0;
        // c.gridy = 0;
        // c.insets = new Insets(5, 5, 5, 5);

        // Add all components to the JFrame
        // Making sure to add the text before the text-fields

        loginPanel.add(txtUser);
        loginPanel.add(tfUsername);
        loginPanel.add(txtPassword);
        loginPanel.add(tfPassword);
        loginPanel.add(loginButton);

//        loginPanel.add(txtUser, txtUserC);
//        loginPanel.add(tfUsername, tfUserC);
//        loginPanel.add(txtPassword, txtPassC);
//        loginPanel.add(tfPassword, tfPassC);
//        loginPanel.add(loginButton, lButtonC);


        loginPanel.setVisible(true);

        return loginPanel;
    }

    // Instructions for when the login button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Open")) {
            Main.applicationFrame.newCurrentPanel(LoginWindow.loginGUI,
                    MainWindow.mainWGUI);
        }
    }

    // Create the panel. Callable from Main class
    public static JPanel createAndShowLoginGUI() {
        logWin = new LoginWindow();
        return logWin.prepareLoginGUI();
    }

}
