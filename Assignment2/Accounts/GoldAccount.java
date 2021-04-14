package a01051162.asssignment.data.accounts;
/**
 * 
 */

/**
 * @author Mahdyeh:)
 *
 */
public class GoldAccount extends Account {
	private double interestRate;
	private boolean inOverdraft;
	public static final double FEE = .05;
	public static final double OVERDRAFT_AMT = -2000.0;

	/**
	 * 
	 */
	public GoldAccount() {
		super();
	}

	public GoldAccount(String accountNumber, double balance, boolean active, double interestRate, boolean inOverdraf) {

		super(accountNumber, balance, active);
		setInterestRate(interestRate);
		setInOverdraft(inOverdraft);

	}

	/**
	 * @overload
	 */
//	public void setAccountNumber(String accountNumber) {
	// this.accountNumber = "GL-" + accountNumber;
	// }

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		if (interestRate > 0)
			this.interestRate = interestRate;
	}

	/**
	 * @return the inOverdraf
	 */
	public boolean isInOverdraft() {
		return inOverdraft;
	}

	/**
	 * @param inOverdraf the inOverdraf to set
	 */
	public void setInOverdraft(boolean inOverdraf) {
		if (getBalance() > 0) {
			this.inOverdraft = false;
		} else {
			this.inOverdraft = true;
		}
	}

	/**
	 * @param Adds interest to the account balance.
	 */
	public void applyInterest() {
		setBalance(getBalance() * interestRate + getBalance());
	}

	/**
	 * @override
	 */
	public void subtractFromBalance(double amount) {
		if (amount < getBalance()) {
			super.subtractFromBalance(amount);
			inOverdraft = false;
		}
		if (getBalance() - amount < 0 && getBalance() - amount >= OVERDRAFT_AMT) {
			inOverdraft = true;
			// super.addTransactionInfo(" withdrawel: $" + String.format("%.2f",amount));

			setBalance(getBalance() - amount - (getBalance() - amount) * FEE);
		}
		if (getBalance() - amount < -2000)
			System.out.println("invalid number");

	}

	public void addToBalance(double amount) {
		if (amount > 0)
			super.addToBalance(amount);

	}

	public String toString() {
		return "GoldAccount[interestRate:" + interestRate + " overdraft=" + inOverdraft + " toString()="
				+ super.toString();
	}

}
