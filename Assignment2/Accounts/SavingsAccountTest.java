package a01051162.asssignment.data.accounts;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Mahdyeh
 *
 */
public class SavingsAccountTest {

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * test Negative balance after withdrawing - the balance should not be less than
	 * 20.0
	 */
	@Test

	public void testSubtractFromBalanceNegativeResult() {
		SavingsAccount account1 = new SavingsAccount();
		account1.setBalance(100.0);
		account1.subtractFromBalance(90.0);
		assertEquals(10.0, account1.getBalance(), 0.01);
		/**
		 * test account is active when the balance is more than MIN-AMOUNT after
		 * subtaction.
		 */

	}

	@Test
	public void testActiveAccountPositive() {
		Account account1 = new Account();
		account1.setBalance(100.0);
		account1.subtractFromBalance(50.0);
		assertEquals(false, account1.isActive());
	}

	/**
	 * test the account gets deactive when subtraction is more than balance.
	 */
	@Test
	public void testActiveAccountNegative() {
		Account account1 = new Account();
		account1.setBalance(100.0);
		account1.subtractFromBalance(9.0);
		assertEquals(false, account1.isActive());
	}

	/**
	 * test negative balance when the account is deactive
	 */
	@Test
	public void tesAddToBalanceNegativeResult() {
		SavingsAccount account1 = new SavingsAccount();
		account1.setBalance(10.0);
		account1.addToBalance(5.0);
		assertEquals(15.0, account1.getBalance(), 0.01);

	}
}