/**
 * @author Cyrus Brucker - cbrucker1
 * CIS175 - Fourth Semester
 * January 26th, 2022
 */
package model;

public class CustBusinessLogic {

	public int DiscountAvaliablity(Customer customer) {
		int discountAvaliablity = 0; 
		
		if(customer.getNumOfYearsSignedUp() >= 5) {
			discountAvaliablity = 300;
		}else {
			discountAvaliablity = 0;
		}
		return discountAvaliablity; 
	}
	
	public boolean tooYoungToSignUp(Customer customer) {
		if(customer.getAge() <= 15) {
			return true;
		} else {
			return false; 
		}
	}
	
	public int NumberOfTransactions(Customer customer) {
	int numberOfTrans = 0; 
		if(customer.getNumOfTransactions() >= 15) {
			numberOfTrans = 15;		
		} else {
			numberOfTrans = 0;
		}
		return numberOfTrans;
	}
}