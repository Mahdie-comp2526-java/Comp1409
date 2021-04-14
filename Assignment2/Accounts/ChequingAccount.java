package a01051162.asssignment.data.accounts;
/**
 * 
 */

/**
 * @author Mahdyeh
 *
 */
public class ChequingAccount extends Account {
	public static final double FEE=20.0;
	private int numberOfCheques;

	/**
	 * 
	 */
	public ChequingAccount() {
		super();
	}
	public ChequingAccount(String accountNumber,double balance,boolean active,int numberOfCheques) {
		super(accountNumber,balance,active);
		setNumberOfCheques(numberOfCheques);
	
	}
	//public void setAccountNumber(String accountNumber) {
		//if(accountNumber!=null&& !accountNumber.isEmpty())
	//	this.accountNumber="CH-"+accountNumber;}
	/**
	 * @return the numberOfCheques
	 */
	public int getNumberOfCheques() {
		return numberOfCheques;
	}
	/**
	 * @param numberOfCheques the numberOfCheques to set
	 */
	public void setNumberOfCheques(int numberOfCheques) {
		if(numberOfCheques>0)
		this.numberOfCheques = numberOfCheques;
	}
	/**
	 * @param withdrawing from checking account.
	 */
    public void subtractFromBalance(double  amount) {
		if(getBalance()>FEE+amount) {
			super.subtractFromBalance(FEE+amount);
			this.numberOfCheques++;
			}
		else 
			System.out.println("invalid number: withdraw should be less than your balance");
	}
    
	/**
	 * @override
	 */
	public String toString() {
			return "ChecquingAccount [number of chechecks"+numberOfCheques+" toString()=" + super.toString()+ "]";
	}

}
