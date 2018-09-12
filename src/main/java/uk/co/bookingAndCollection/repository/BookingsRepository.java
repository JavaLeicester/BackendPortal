package uk.co.bookingAndCollection.repository;

import uk.co.bookingAndCollection.models.Booking;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface BookingsRepository extends CrudRepository<Booking, Integer> {
	
	
	@Query(
		value = "INSERT INTO "	
	)
	void InsertBookingAndPieceType();

}
