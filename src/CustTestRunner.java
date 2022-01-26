/**
 * @author Cyrus Brucker - cbrucker1
 * CIS175 - Fourth Semester
 * January 26th, 2022
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class CustTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestAgeNumOfYears.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
