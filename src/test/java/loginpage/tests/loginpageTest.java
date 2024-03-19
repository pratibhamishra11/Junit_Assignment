package loginpage.tests;
import org.junit.Test;

import test.LoginAuth;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import static org.junit.Assert.assertFalse;

public class loginpageTest {
	
	@Test
	public void testEmail() {
		LoginAuth ob = new LoginAuth();
		Assert.assertFalse("Invalid email .",ob.validemail("p"));
		Assert.assertTrue("Valid email .",ob.validemail("p@gmail.com"));
		Assert.assertFalse("Invalid email .",ob.validemail("p@@.com"));
		Assert.assertFalse("Invalid email .",ob.validemail("p@.com"));
		Assert.assertFalse("Invalid email .",ob.validemail("p@.com"));
		Assert.assertTrue("Valid email .",ob.validemail("pratibha@gmail.com"));
		Assert.assertTrue("Valid email .",ob.validemail("p1234@gmail.com"));
		
	}
	
	@Test
	public void testpassword(){
		LoginAuth ob = new LoginAuth();
		Assert.assertFalse("Invalid password .",ob.validpw("12"));
		Assert.assertTrue("Valid password .",ob.validpw("1aB@ab"));
		Assert.assertFalse("Invalid password .",ob.validpw("1234567"));
		Assert.assertFalse("Invalid password .",ob.validpw("abcdef"));
		Assert.assertFalse("Invalid password .",ob.validpw("ABCD1@"));
	}
	
	@Test
	public void testEmailspace() {
		loginpageTest ob = new loginpageTest();
		String cleanedEmail = ob.cleanEmailspace("pratibha@gmail.com ");
		Assert.assertEquals("pratibha@gmail.com",cleanedEmail);
		String cleanedEmail1 = ob.cleanEmailspace(" pratibha@gmail.com ");
		Assert.assertEquals("pratibha@gmail.com",cleanedEmail1);
		
	}
	
	private String cleanEmailspace(String email) {
		return email.trim();
	}

}