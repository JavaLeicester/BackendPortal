package uk.co.bookingAndCollection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import uk.co.bookingAndCollection.models.Booking;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BookingAndCollectionApplicationTests {

	@Autowired
	private Booking booking;
	
	@Test
	public void contextLoads() {
		
		 assertThat(booking).isNotNull();
		
	}

}
