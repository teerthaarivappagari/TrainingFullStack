import java.util.*;

class Flight {
    private int flightNumber;
    private String destination;
    private double price;

    public Flight(int flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flight{Number=" + flightNumber + ", Destination='" + destination + "', Price=" + price + "}";
    }
}

class PriceComparator implements Comparator<Flight> {
    public int compare(Flight f1, Flight f2) {
        return Double.compare(f1.getPrice(), f2.getPrice());
    }
}

public class FlightBookingSystem {
    public static void main(String[] args) {
        Queue<Flight> bookingQueue = new LinkedList<>();
        bookingQueue.add(new Flight(101, "New York", 500.00));
        bookingQueue.add(new Flight(102, "Los Angeles", 450.00));
        bookingQueue.add(new Flight(103, "Chicago", 600.00));

        System.out.println("Booking Queue:");
        while (!bookingQueue.isEmpty()) {
            System.out.println(bookingQueue.poll());
        }

        PriorityQueue<Flight> pricePriorityQueue = new PriorityQueue<>(new PriceComparator());
        pricePriorityQueue.add(new Flight(101, "New York", 500.00));
        pricePriorityQueue.add(new Flight(102, "Los Angeles", 450.00));
        pricePriorityQueue.add(new Flight(103, "Chicago", 600.00));

        System.out.println("\nFlights sorted by price:");
        while (!pricePriorityQueue.isEmpty()) {
            System.out.println(pricePriorityQueue.poll());
        }
    }
}
