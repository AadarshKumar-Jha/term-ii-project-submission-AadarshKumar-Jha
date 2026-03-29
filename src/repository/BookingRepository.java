package repository;

import model.Booking;
import java.util.*;

public class BookingRepository {
    private List<Booking> bookings = new ArrayList<>();

    public void saveBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }
}