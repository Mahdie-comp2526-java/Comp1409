/**
 * 
 */
package a01051162.asssignment.data.accounts;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * @author Mahdyeh
 *
 */
public class ChequingAccountTest {

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Negative test withdraw - balance and number of Cheques should not change 
	 */
		@Test

		public void testSubtractFromBalanceNegativeAmount() {
			ChequingAccount account1=new ChequingAccount();
			account1.setBalance(100.0);
			account1.subtractFromBalance(90.0);
			assertEquals(100.0, account1.getBalance(), 0.01);
			assertEquals(1, account1.getNumberOfCheques());
		}

		/**
		 * positive test withdraw - balance and number of Cheques will change 
		 */
			@Test
		public void testSubtractFromBalancePositiveAmount() {
			ChequingAccount account1=new ChequingAccount();
			account1.setBalance(100.0);
			account1.subtractFromBalance(10.0);
			assertEquals(70.0, account1.getBalance(), 0.01);
			assertEquals(1, account1.getNumberOfCheques());
			}
			
}
