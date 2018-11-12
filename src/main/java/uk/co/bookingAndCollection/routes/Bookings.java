package uk.co.bookingAndCollection.routes;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.bookingAndCollection.models.*;
import uk.co.bookingAndCollection.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.bookingAndCollection.repository.BookingsRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bookings")
public class Bookings {
	
	 private final BookingsService bookingService;
	 
	 private static Logger debugLogger = LoggerFactory.getLogger(Bookings.class);
	 
	 @Autowired
	 public Bookings(BookingsRepository bookingRepository, BookingsService customersService){
	   this.bookingService = customersService;
	 }
	 
	 @PostMapping
	 public @ResponseBody Booking add(@RequestBody Booking bookings) {
	 	
	  debugLogger.debug("Get all bookings");
	  debugLogger.debug("The name is ");
	   
	   return this.bookingService.addBooking(bookings);

	 }
	 
	 @GetMapping
	 public @ResponseBody List<Booking> list() {
	  
		// return this.bookingService.getAllBookings();
		 List<Booking> temp = new ArrayList<Booking>();
		 
		 return temp;
		 
	 }

}
