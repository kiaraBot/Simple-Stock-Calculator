/*****************************************************
*Alix Field
*FieldP3	Stock Calculation 
*
*This program calculates stock transactions
*****************************************************/

//StockCalc Class
//Library Imports

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StockCalc {
	
	/************************ Instance Variable Declarations: Private ***********************/
	
	// Instance Variable Declaration
	private StockCalc calc;
	private String	 userName;
	private String	 stockName;
	private int sharesBought;
	private double buyPrice;
	private double salePrice;
	private double listCost;
	private double netCost;
	private double saleListIncome;
	private double saleNetIncome;
	private double brokerFee;
	private double totalBrokerFee;
	private double gainLoss;
	private float fGainLoss;

	
	NumberFormat  moneyFormatter   = NumberFormat.getCurrencyInstance();
	DecimalFormat decimalFormatter = new DecimalFormat("0.00%");
	
	// -----------------------------------
	// Default Constructor
	// -----------------------------------
	public StockCalc() {
		// Default Broker Fee
		brokerFee = 0;
	}
	
	// -----------------------------------
	// Individual Setters
	// -----------------------------------
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public void setSharesBought(int sharesBought) {
		this.sharesBought = sharesBought;
	}
	
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
		saleCalculation();
	}
	
	public void setBrokerFee(double brokerFee) {
		this.brokerFee = brokerFee;
	}
	
	// ------------------------------------
	// Setter w/ Arguments
	// ------------------------------------
	public void setUserInput(String userName, String stockName,
	int sharesBought, double buyPrice, double salePrice,
			double brokerFee) {
		// Set values into class variables
		setStockName(stockName);
		setSharesBought(sharesBought);
		setBuyPrice(buyPrice);
		setUserName(userName);
		setSalePrice(salePrice);
		setBrokerFee(brokerFee);
		
		// Call Buy Calc Method
		buyCalculation();
		
		// Calling Sale Calc Method
		saleCalculation();
	}
	
	// ----------------
	// Getters
	// ----------------
	public double getPurchaseNetCost(double netCost) {
		// Returns the Net Cost of the Purchase Including Broker Fee
		buyCalculation();
		return netCost;
	}
	
	public double getSaleNetIncome(double saleNetIncome) {
		// Returns the Net Income of the Sale with Broker Fee Deducted
		saleCalculation();
		return saleNetIncome;
	}
	
	public String getPurhcaseDesc() 
		// Purchase Summary String
		String desc = "Stock Name: " + stockName + "\nNumber of Shares: " + sharesBought + "\nList Cost: "
				+ moneyFormatter.format(listCost) + "\nBroker Fee: " + decimalFormatter.format(brokerFee / 100.0)
				+ "\nTotal Broker Fee Deducted: " + moneyFormatter.format(totalBrokerFee) + "\nTotal Purchase Amount: "
				+ moneyFormatter.format(netCost);
		return desc;
	}
	
	public String getSaleDesc() {
		
		// String Deceleration
		String desc = "Selling Price: " + moneyFormatter.format(salePrice) + "\nTotal Sticker Price: "
				+ moneyFormatter.format(saleListIncome) + "\nBroker Fee: " + decimalFormatter.format(brokerFee / 100)
				+ "\nTotal Broker Fee Deducted: " + moneyFormatter.format(totalBrokerFee) + "\nNet Income: "
				+ moneyFormatter.format(saleNetIncome) + "\nGain /(Loss) Total: " + moneyFormatter.format(fGainLoss);
		return desc;
	}
	
	// -------------------------------------
	// Calculation Methods
	// -------------------------------------
	private void buyCalculation() {
		listCost = sharesBought * buyPrice;
		totalBrokerFee = listCost * (brokerFee / 100);
		netCost = listCost + totalBrokerFee;
	}
	
	private void saleCalculation() {
		// Selling Calculations
		saleListIncome = salePrice * sharesBought;
		totalBrokerFee = saleListIncome * (brokerFee / 100);
		saleNetIncome = saleListIncome - totalBrokerFee;
		gainLoss = saleNetIncome - netCost;
		fGainLoss = (float) gainLoss;
	}
}