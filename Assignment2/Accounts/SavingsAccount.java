package a01051162.asssignment.data.accounts;
/**
 * 
 */

/**
 * @author Mahdyeh
 *
 */
public class SavingsAccount extends Account {
	public static final double MIN_AMOUNT = 20.0;

	/**
	 * 
	 */
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountNumber, double balance, boolean active) {
		super(accountNumber, balance, active);

	}

	// public void setAccountNumber(String accountNumber) {
	// this.accountNumber = "SA-" + accountNumber;
	// }

	/**
	 * 
	 * @override
	 */
	public void addToBalance(double amount) {

		if (super.getBalance() > MIN_AMOUNT && amount > 0) {
			super.setActive(true);
			super.addToBalance(amount);
		}
		if (super.getBalance() < MIN_AMOUNT && amount + getBalance() > MIN_AMOUNT) {
			super.setActive(true);
			super.addToBalance(amount);
		} else
			System.out.println("error");

	}

	/**
	 * 
	 * @Overrid amount a double to subtract from the balance field.\
	 * 
	 */
	public void subTractFromBalance(double amount) {

		if (super.isActive()) {
			if (super.getBalance() > MIN_AMOUNT + amount) {
				super.subtractFromBalance(amount);
			} else if (super.getBalance() <= amount + MIN_AMOUNT && super.getBalance() >= amount) {
				super.subtractFromBalance(amount);
				super.setActive(false);
			}
		} else
			System.out.println("invalid number: your balance is less than your chioce");
	}

	/**
	 * @override.
	 */
	public String toString() {
		return "SavingsAccount [toString()=" + super.toString();
	}
}