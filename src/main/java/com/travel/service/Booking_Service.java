package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.model.Booking;
import com.travel.repository.Booking_Repository;

@Service
@org.springframework.transaction.annotation.Transactional
public class Booking_Service {

	@Autowired
	Booking_Repository booking_Repository;
	
	public void SaveBooking(Booking booking) {
		booking_Repository.save(booking);
	}
}

