package uk.co.bookingAndCollection.routes;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.bookingAndCollection.models.*;
import uk.co.bookingAndCollection.repository.BookingsRepository;
import uk.co.bookingAndCollection.service.*;

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
	 public @ResponseBody List<Booking> list(@RequestHeader String auth) {
		 
	   return this.bookingService.getAllBookings();
	 }

}
