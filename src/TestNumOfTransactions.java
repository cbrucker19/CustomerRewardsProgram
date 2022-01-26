import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.CustBusinessLogic;
import model.Customer;

public class TestNumOfTransactions {

	CustBusinessLogic custBL = new CustBusinessLogic();
	Customer customer = new Customer("Cyrus");
	protected int value1, value2; 
	@Before
	public void setUp() throws Exception {
		value1 = 3;
		value2 = 3;
	}
	//Playing around with setUp method
	@Test
	public void test() {
		double result = value1 + value2;
		assertTrue(result ==6);
	}
	@Test
	public void testAbove15TransactionsIs15Discount(){
	 customer.setNumOfTransactions(16);
	 int numOfTransActions = custBL.NumberOfTransactions(customer);
	 assertEquals(15, numOfTransActions, 0.0);
	}
	@Test
	public void testBelow15TransactionsIs15Discount(){
	 customer.setNumOfTransactions(8);
	 int numOfTransActions = custBL.NumberOfTransactions(customer);
	 assertEquals(0, numOfTransActions, 0.0);
	}
	
}
