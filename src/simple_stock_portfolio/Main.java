
package simple_stock_portfolio;

import javax.swing.*;

public class Main {

    // Initialize a new frame using our StockPortfolioFrames template
    // Protected so the other panels can interact with it
    protected static StockPortfolioFrames applicationFrame = new StockPortfolioFrames();

    //	protected static String frameName = "Simple Stock Portfolio ";
    protected static String frameName = "PD";

    // Display Login Window
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                applicationFrame.createFrame(frameName, 1200, 800);
                applicationFrame.addPanel(LoginWindow.loginGUI);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }
}