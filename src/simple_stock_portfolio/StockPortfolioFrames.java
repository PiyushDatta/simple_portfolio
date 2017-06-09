
package simple_stock_portfolio;

import javax.swing.*;
import java.awt.*;

public class StockPortfolioFrames {

	private JFrame appFrame;

	protected void createFrame(String frameName, int frameW, int frameH) {

		// Create JFrame with frame name, width, and height
		appFrame = new JFrame(frameName);
		appFrame.setSize(frameW, frameH);

		// Show the frame
		appFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		appFrame.setVisible(true);
	}

	// Add a panel, only used if not panel exists
	protected void addPanel(JPanel panel) {
		appFrame.getContentPane().add(panel);
	}

	// Change the current panel with a new panel
	protected void newCurrentPanel(JPanel hidePanel, JPanel showPanel) {
		appFrame.getContentPane().remove(hidePanel);
		appFrame.getContentPane().add(showPanel);
		appFrame.revalidate(); // For Java 1.7 or above.
		// frame.getContentPane().validate(); // For Java 1.6 or below.
		appFrame.repaint();

	}

	// Change the current frame name
	protected void changeFrameName(String name) {
		appFrame.setName(name);

	}
}
