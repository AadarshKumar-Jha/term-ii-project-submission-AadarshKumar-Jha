package model;

public class Booking {
    private int userId;
    private String spot;
    private String slot;

    public Booking(int userId, String spot, String slot) {
        this.userId = userId;
        this.spot = spot;
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "UserID: " + userId + ", Spot: " + spot + ", Slot: " + slot;
    }
}