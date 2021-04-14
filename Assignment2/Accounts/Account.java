package a01051162.asssignment.data.accounts;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Mahdyeh:)
 *
 */
public class Account {
	private double balance;
	private String accountNumber;
	private boolean active;
	private ArrayList<String> transactionInfo;

	/**
	 * @param Default constructor to create Account objects.
	 */
	public Account() {
	}

	/**
	 * @param Overloaded      Account constructor
	 * @param accountNumberto set the accountNumber field
	 * @param balance         to set the balance field
	 */

	public Account(String accountNumber, double balance, boolean active) {

		setAccountNumber(accountNumber);
		setBalance(balance);
		setActive(active);
		transactionInfo = new ArrayList<String>();
	}

	/**
	 * @return the balance as a double
	 */
	public double getBalance() {

		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		if (balance > 0)
			this.balance = balance;
	}

	/**
	 * @return the acountNumber as a String
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if (accountNumber != null && !accountNumber.trim().isEmpty()) {
			this.accountNumber = accountNumber;
		}
	}

	/**
	 * @return the active as a boolean
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * 
	 * @override the amount to be added to the existing balance field
	 */
	public void addToBalance(double amount) {

		if (amount > 0) {
			balance += amount;
			addTransactionInfo(" deposit: $" + String.format("%.2f", amount));
		} else
			System.out.println("Error: deposit must be a positive number");
	}

	/**
	 * @override the amount to be subtracted from the balance field.
	 * 
	 */
	public void subtractFromBalance(double amount) {

		if (amount <= balance) {
			balance -= amount;
			addTransactionInfo(" withdrawel: $" + String.format("%.2f", amount));

		} else
			System.out.println("invalid number: withdraw should be less than your balance");
	}

	/**
	 * @param theString the transaction and dates to be added
	 */
	public void addTransactionInfo(String theString) {
		if (transactionInfo != null && theString != null) {
			SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date today = new Date();
			System.out.println(SDF.format(today));
			transactionInfo.add(SDF.format(today) + theString);
			// transactionInfo.add(SDF.format(today));
		}
	}

	/**
	 * @param the account details to be shown.
	 */
	public void displayAccountRecords() {
		System.out.println("ACCOUNT Activity:");
		if (transactionInfo != null) {

			for (String record : transactionInfo)
				System.out.println(record);

		}
	}

	/**
	 * @override
	 */
	public String toString() {
		return "Account [balance=" + balance + ", accountNumber=" + accountNumber + ", active=" + active + "]";
	}

}
