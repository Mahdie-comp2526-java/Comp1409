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
public class AccountTest {

	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
/**
 * Negative test withdraw - balance should not change
 */
	@Test
	public void testSubtractFromBalanceNegativeAmount () {
		Account account1=new Account();
		account1.setBalance(100.0);
		account1.subtractFromBalance(300.0);
		assertEquals(100.0, account1.getBalance(), 0.01);
		 
	}
	/**
	 *  test positive withdraw - the balance  change
	 */
		@Test
		public void testSubtractFromBalancePositiveamount () {
			Account account1=new Account();
			account1.setBalance(1000.0);
			account1.subtractFromBalance(200.0); 
			assertEquals(800.0, account1.getBalance(), 0.01);
			
		}
	/**
	 * Negative test addBalance- balance should not change
	 */
	@Test

	public void testNegativeAddToBalance() {
		Account account1 = new Account();
		account1.setBalance(100.00);
		account1.addToBalance(-100.00);
		assertEquals(100, account1.getBalance(), 0.01);

}
	public void testPositiveAddToBalance() {
		Account account1 = new Account();
		account1.setBalance(100.00);
		account1.addToBalance(200.00);
		assertEquals(300, account1.getBalance(), 0.01);

}}