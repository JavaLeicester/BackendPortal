package uk.co.bookingAndCollection.routes;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.bookingAndCollection.models.*;
import uk.co.bookingAndCollection.repository.BookingsRepository;
import uk.co.bookingAndCollection.service.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bookings")
public class Bookings {
	
	 private final BookingsService bookingService;
	 
	 @Autowired
	 public Bookings(BookingsRepository bookingRepository, BookingsService customersService){
	   this.bookingService = customersService;
	 }
	 
	 @PostMapping
	 public @ResponseBody List<Booking> add(@RequestHeader String auth, @RequestBody List<Booking> bookings){
	   return this.bookingService.addBookings(bookings);
	 }
	 
	 @GetMapping
	 public @ResponseBody List<Booking> list(@RequestHeader String auth) {
	   return this.bookingService.getAllBookings();
	 }

}