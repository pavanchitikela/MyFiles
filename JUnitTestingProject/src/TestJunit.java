import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
*/

public class TestJunit {
	   @Test
       public void testCase() {
    	   String msg = "Welcome";
    	   assertEquals("Welcome", msg);
       }
	   @Test
	   public void testCase2() {
    	   String msg = "Welcome";
    	   assertEquals("Welcome", msg);
       }
	   @Test
	   public void testCase3() {
    	   Greetings grt = new Greetings("Welcome to Junit");
    	   assertEquals("Welcome to Junit", grt.greetMsg);
       }
	   @Test
	   public void testAssertions() {
		   String empnameString="john";
		   String empjobString="MANAGER";
		   int empno = 7890;
		   assertEquals("MANAGER", empjobString);
		   System.out.println("Emp job passed..");
		   assertTrue(empno>7000);
		   System.out.println("Emp no passed..");
		   assertNotNull(empnameString);
		   System.out.println("Emp name passed..");
		   
	   }
	   @SuppressWarnings("deprecation")
	   @Test
	   public void withdrawTest() {
		   BankAccount ba = new BankAccount(85000);
		   double amnt=5000;
		   assertNotNull(ba);
           ba.withdraw(amnt);
           assertEquals("MSG",new Double(80000.0), new Double(ba.getBal()));
		   //assertEquals(85000,ba.getBal(),0.00001);
		   //assertEquals(85000, ba.getBal());
			   }
}
class BankAccount{
	private double bal;
	public BankAccount(double bal) {
		this.bal=bal;
	}
	public double getBal() {
		return bal;
	}
    public void withdraw(double amnt) {
		bal=bal-amnt;
		//bal=bal-100;
	}
}
