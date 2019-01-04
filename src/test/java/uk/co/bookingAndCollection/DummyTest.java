package uk.co.bookingAndCollection;

import org.hamcrest.*;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class DummyTest {
	
	@Test
	public void isStringEmpty() {
		
		String stringToTest="ad";
		
		assertThat(stringToTest, Matchers.isEmptyString());
		
	}
	
	@Test 
	public void isStringEmptyOfNull() {
		String stringToTest = "";
		assertThat(stringToTest, Matchers.isEmptyOrNullString());
		
	}
	
}
