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
public class GoldAccountTest {

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
  /**
   * test overdraft if overdraft happen output return true
   */
	@Test
	public void testSetInOverdraft() {
		GoldAccount a = new GoldAccount();
		a.setBalance(5000.0);
		a.subtractFromBalance(6000);
		assertEquals(true, a.isInOverdraft() );
	}
	/**
	 * test overdraft if overdraft does not happen return false
	 */
	@Test
	public void testSetInOverdraftPositive() {
		GoldAccount a = new GoldAccount();
		a.setBalance(5000.0);
		a.subtractFromBalance(1000);
		assertEquals(false, a.isInOverdraft()); 
	}
	/**
	 * test that the balance when overdraft happen
	 */
    @Test
    public void tesStubtractFromBalance() {
    	GoldAccount account1=new GoldAccount();
		account1.setBalance(5000.0);
		account1.subtractFromBalance(6000);
		assertEquals(1000.0, account1.getBalance(),.01);
		
	}
    /**
	 * test that the balance when overdraft does not happen
	 */
    @Test
    public void tesStubtractFromBalancepositive() {
    	GoldAccount account1=new GoldAccount();
		account1.setBalance(5000.0);
		account1.subtractFromBalance(4000);
		assertEquals(2000.0, account1.getBalance(),.01);
		
	}
}
