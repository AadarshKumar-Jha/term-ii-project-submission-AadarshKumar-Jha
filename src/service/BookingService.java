package service;

import model.Booking;
import repository.BookingRepository;
import java.util.*;

public class BookingService {
    private BookingRepository repo = new BookingRepository();
    private Map<String, Integer> slotCount = new HashMap<>();
    private final int MAX_CAPACITY = 2;

    public void bookTicket(int userId, String spot, String slot) {
        String key = spot + "-" + slot;

        int count = slotCount.getOrDefault(key, 0);

        if (count >= MAX_CAPACITY) {
            System.out.println("Slot Full!");
            return;
        }

        Booking booking = new Booking(userId, spot, slot);
        repo.saveBooking(booking);

        slotCount.put(key, count + 1);

        System.out.println("Booking Successful!");
    }

    public void viewBookings() {
        List<Booking> bookings = repo.getAllBookings();

        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
}