/*****************************************************
*Alix Field
*StockFrame.java
*
*StockCalc Program using JFrame
*****************************************************/

//----------------------------------
//Imports
//----------------------------------
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StockFrame extends JFrame {
	private StockCalc calc;
	
	//-----------------------------------------------------
	// Class Variable Declarations
	//-----------------------------------------------------
	
	// Text Fields
	private JTextField jtfUserName;
	private JTextField jtfStockName;
	private JTextField jtfSharesBought;
	private JTextField jtfBuyPrice;
	private JTextField jtfSalePrice;
	private JTextField jtfBrokerFee;
	
	// Text Areas
	private JTextArea txtDisplayPurchaseCost;
	private JTextArea txtDisplayStockSummary;
	
	// Buttons
	private JButton	jbtDisplayPurchaseCost;
	private JButton	jbtDisplayStockSummary;
	private JButton	jbtNewCalculation;
	
	// Default Constructor Object Instantiation
	public StockFrame() {
		calc = new StockCalc();
		
		// Call Component Method
		initComponents();
		
		// ------------------------------------------
		// Register Event Listeners
		// ------------------------------------------
		
		// Purchase Cost Listener: Event Handler at End of File
		jbtDisplayPurchaseCost.addActionListener(new ButtonListener());
		
		// Stock Summary Listener: Event Handler at End of File
		jbtDisplayStockSummary.addActionListener(new ButtonListener());
		
		// New Calculation Listener w/ Anonymous Inner Class
		jbtNewCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfStockName.setText("");
				jtfBuyPrice.setText("");
				jtfSharesBought.setText("");
				jtfBrokerFee.setText("");
				jtfSalePrice.setText("");
			}
		});
	}
	
	// JLabel Color Get Method 
	JLabel newLabel(String text) {
		Color labelBackgroundColor = new Color(204, 218, 255);
		JLabel newLabel = new JLabel(text);
		newLabel.setForeground(labelBackgroundColor);
		return newLabel;
	}
	
	// Instantiate Components (Controls)
	private void initComponents() {
		
		// -----------------------------------------------------------------------
		// Panel One: JLabels & JTexFields
		// -----------------------------------------------------------------------
		
		// JTexFields Instantiation
		//-------------------------------------------------
		// JTextFields Color Instantiation
		Color color3 = new Color(235, 235, 245);
		Color color4 = new Color(0, 0, 0);
		
		// Class Header
		
		
		// User Name
		jtfUserName = new JTextField();
		jtfUserName.setBackground(color3);
		jtfUserName.setForeground(color4);
		
		// Stock Name
		jtfStockName = new JTextField();
		jtfStockName.setBackground(color3);
		jtfStockName.setForeground(color4);
		
		// Shares Bought
		jtfSharesBought = new JTextField();
		jtfStockName.setBackground(color3);
		jtfStockName.setForeground(color4);
		
		// Buy Price
		jtfBuyPrice = new JTextField();
		jtfStockName.setBackground(color3);
		jtfStockName.setForeground(color4);
		
		// Broker Fee 
		jtfBrokerFee = new JTextField();
		jtfStockName.setBackground(color3);
		jtfStockName.setForeground(color4);
		
		// Sale Price
		jtfSalePrice = new JTextField();
		jtfStockName.setBackground(color3);
		jtfStockName.setForeground(color4);
		
		

		// Adding: JLabels & JTexFields 
		// ----------------------------------------------------------------------------------
		// JPanel Instantiation
		JPanel panelOne = new JPanel(new GridLayout(6, 2));
		Color BackgroundBlueish = new Color(76, 90, 127);
		panelOne.setBackground(BackgroundBlueish);
		
		// Add JLabels and JTextFields
		panelOne.add(newLabel("User Name: "));
		panelOne.add(jtfUserName);
		panelOne.add(newLabel("Stock Name: "));
		panelOne.add(jtfStockName);
		panelOne.add(newLabel("Number of Shares Bought: "));
		panelOne.add(jtfSharesBought);
		panelOne.add(newLabel("Buy Price:"));
		panelOne.add(jtfBuyPrice);
		panelOne.add(newLabel("Broker Fee: "));
		panelOne.add(jtfBrokerFee);
		panelOne.add(newLabel("Sale Price: "));
		panelOne.add(jtfSalePrice);
		
		// --------------------------------------------------------------------
		// Panal Two: Buttons & Text Areas
		//              Instantiation & Color Initialization
		// --------------------------------------------------------------------
		
		// Panel Two Instantiation
		JPanel panelTwo = new JPanel(new GridLayout(5, 1));
		
		// Button Colors
		Color color5 = new Color(155, 155, 195);
		Color color6 = new Color(5, 5, 65);
		
		// Display Purchase Cost Button
		jbtDisplayPurchaseCost = new JButton("Display Purchase Cost");
		jbtDisplayPurchaseCost.setBackground(color5);
		jbtDisplayPurchaseCost.setForeground(color6);
		panelTwo.add(jbtDisplayPurchaseCost);
		
		// Purchase Cost Description Text Area
		txtDisplayPurchaseCost = new JTextArea("");
		txtDisplayPurchaseCost.getText();
		txtDisplayPurchaseCost.setEditable(false);
		txtDisplayPurchaseCost.setLineWrap(true);
		txtDisplayPurchaseCost.setWrapStyleWord(true);
		txtDisplayPurchaseCost.setBackground(color3);
		txtDisplayPurchaseCost.setForeground(color4);
		panelTwo.add(txtDisplayPurchaseCost);
		
		// Display Stock Summary Button
		jbtDisplayStockSummary = new JButton("Display Stock Summary");
		jbtDisplayStockSummary.setBackground(color5);
		jbtDisplayStockSummary.setForeground(color6);
		panelTwo.add(jbtDisplayStockSummary);
		
		// Stock Summary Description Text Area 
		txtDisplayStockSummary = new JTextArea("");
		txtDisplayStockSummary.getText();
		txtDisplayStockSummary.setEditable(false);
		txtDisplayStockSummary.setLineWrap(true);
		txtDisplayStockSummary.setWrapStyleWord(true);
		txtDisplayStockSummary.setBackground(color3);
		txtDisplayStockSummary.setForeground(color4);
		panelTwo.add(txtDisplayStockSummary);
		
		// New Calculation Button: Event Handler at Top of File
		jbtNewCalculation = new JButton("Alix Field     P3     StockCalc on JFrame Using JControls");
		jbtNewCalculation.setBackground(color5);
		jbtNewCalculation.setForeground(color6);
		panelTwo.add(jbtNewCalculation);
		
		// --------------------------------------
		// Add Panels to Frame
		// --------------------------------------
		add(panelOne);
		add(panelTwo);
	}// End initComponents();
	
	//-----------------------------------------------------------------------------------------------------------
	// Display Purchase Cost & Stock Summary Button Event Handler
	//-----------------------------------------------------------------------------------------------------------
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// If: Button Display Purchase Cost Clicked Statements
			if (e.getSource() == jbtDisplayPurchaseCost) {
				// Parse Input Text to Correct Value
				if (jtfSharesBought.getText().trim().length() == 0) {
					jtfSharesBought.setText("0");
				}
				if (jtfBuyPrice.getText().trim().length() == 0) {
					jtfBuyPrice.setText("0");
				}
				if (jtfBrokerFee.getText().trim().length() == 0) {
					jtfBrokerFee.setText("0");
				}
				if (jtfSalePrice.getText().trim().length() == 0) {
					jtfSalePrice.setText("0");
				}
				int sharesBought = Integer.parseInt(jtfSharesBought.getText());
				double buyPrice = Double.parseDouble(jtfBuyPrice.getText());
				double brokerFee = Double.parseDouble(jtfBrokerFee.getText());
				double salePrice = Double.parseDouble(jtfSalePrice.getText());
				String userName = jtfUserName.getText();
				String stockName = jtfStockName.getText();
				
				// Set User Input
				calc.setUserInput(userName, stockName, sharesBought, buyPrice, salePrice, brokerFee);
				
				// Display Purchase Summary
				String purchaseSummary = calc.getPurhcaseDesc();
				txtDisplayPurchaseCost.setText(purchaseSummary);
				
			   // Else If: Button Display Stock Summary Button Clicked Statements
			} else if (e.getSource() == jbtDisplayStockSummary) {
				
				// Display Stock Summary 
				String finalSummary = calc.getSaleDesc();
				txtDisplayStockSummary.setText(finalSummary);
				
			}// End If Else If			
		}// End Actions Performed
	}// End Listener
}// End StockFrame Class