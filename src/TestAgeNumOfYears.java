import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.CustBusinessLogic;
import model.Customer;

public class TestAgeNumOfYears {

	CustBusinessLogic custBL = new CustBusinessLogic();
	Customer customer = new Customer("Cyrus");

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAvaliablityDiscountOver() {
		customer.setNumOfYearsSignedUp(5);
		int discountAvaliablity = custBL.DiscountAvaliablity(customer);
		assertEquals(300, discountAvaliablity, 0.0); 
	}
	@Test
	public void testAvaliablityDiscountUnder() {
		customer.setNumOfYearsSignedUp(0);
		int discountAvaliablity = custBL.DiscountAvaliablity(customer);
		assertEquals(0, discountAvaliablity, 0.0);
	}
	
	@Test
	public void testTooYoungToSingUp() {
		customer.setAge(14);
		assertTrue(custBL.tooYoungToSignUp(customer));
	}
	
	@Test
	public void testYouCanSignUp() {
		customer.setAge(16);
		assertFalse(custBL.tooYoungToSignUp(customer));
	}
}