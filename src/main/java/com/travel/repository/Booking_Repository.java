package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.model.Booking;

@Repository
public interface Booking_Repository extends JpaRepository<Booking , Integer>{
	
//	booking saveBooking(booking booking);

}
