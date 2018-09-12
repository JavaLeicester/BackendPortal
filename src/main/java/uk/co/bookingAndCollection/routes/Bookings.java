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
	 private static final Logger logger = LoggerFactory.getLogger(Bookings.class);
	 
	 @Autowired
	 public Bookings(BookingsRepository bookingRepository, BookingsService customersService){
	   this.bookingService = customersService;
	 }
	 
	 @PostMapping
	 public @ResponseBody Booking add(@RequestBody Booking booking) {
		
	   logger.debug("Get all bookings");

	   return this.bookingService.addBooking(booking);
	 }
	 
	 @GetMapping
	 public @ResponseBody List<Booking> list(@RequestHeader String auth) {
		 
	   return this.bookingService.getAllBookings();
	 }

}
