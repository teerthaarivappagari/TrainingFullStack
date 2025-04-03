import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private final int id;
    private final String name;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void checkIn() {
        this.checkInTime = LocalDateTime.now();
        System.out.println(name + " checked in at " + formatDateTime(checkInTime));
    }

    public void checkOut() {
        this.checkOutTime = LocalDateTime.now();
        System.out.println(name + " checked out at " + formatDateTime(checkOutTime));
    }

    public Optional<LocalDateTime> getCheckInTime() {
        return Optional.ofNullable(checkInTime);
    }

    public Optional<LocalDateTime> getCheckOutTime() {
        return Optional.ofNullable(checkOutTime);
    }

    public String getName() {
        return name;
    }

    private String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}

public class AttendanceTracker {
    private final Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(int id, String name) {
        employees.put(id, new Employee(id, name));
    }

    public void checkIn(int id) {
        Optional.ofNullable(employees.get(id)).ifPresentOrElse(
                Employee::checkIn,
                () -> System.out.println("Employee not found."));
    }

    public void checkOut(int id) {
        Optional.ofNullable(employees.get(id)).ifPresentOrElse(
                Employee::checkOut,
                () -> System.out.println("Employee not found."));
    }

    public void displayAttendance() {
        System.out.println("\nEmployee Attendance Records:");
        employees.values().stream()
                .forEach(employee -> {
                    String checkIn = employee.getCheckInTime()
                            .map(time -> time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                            .orElse("Not Checked In");
                    String checkOut = employee.getCheckOutTime()
                            .map(time -> time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                            .orElse("Not Checked Out");
                    System.out.println(employee.getName() + " - Check-In: " + checkIn + " | Check-Out: " + checkOut);
                });
    }

    public static void main(String[] args) {
        AttendanceTracker tracker = new AttendanceTracker();
        tracker.addEmployee(1, "Alice");
        tracker.addEmployee(2, "Bob");
        
        tracker.checkIn(1);
        tracker.checkIn(2);
        
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        
        tracker.checkOut(1);
        tracker.checkOut(2);
        
        tracker.displayAttendance();
    }
}
