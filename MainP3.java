
/*****************************************************
*Alix Field
*MainP3.java
*
*This program calculates stock transactions
*****************************************************/

import java.awt.GridLayout;
import javax.swing.JFrame;

public class MainP3 {
	
	// Variable Decelerations
	private StockFrame frame;
	
	public static void main(String[] args) {
		MainP3 app = new MainP3();
	}
	
	// Default Constructor
	public MainP3() {
		
		//StockFrame Object Instantiation
		frame = new StockFrame();
		
		// JFrame Intialization
		frame.setTitle("Stock Calculator");
		frame.setSize(800, 650);
		frame.setLayout(new GridLayout(1, 2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}// End MainP3 Default Constructor
}// End MainP3