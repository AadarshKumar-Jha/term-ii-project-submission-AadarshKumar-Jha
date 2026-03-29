package main;

import java.util.Scanner;
import service.BookingService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookingService service = new BookingService();

        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. View Bookings");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Spot Name: ");
                    String spot = sc.nextLine();

                    System.out.print("Enter Time Slot: ");
                    String slot = sc.nextLine();

                    service.bookTicket(userId, spot, slot);
                    break;

                case 2:
                    service.viewBookings();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}