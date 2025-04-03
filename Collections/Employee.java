import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

class SortBySalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Set<Employee> employeeSet = new HashSet<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        Employee e1 = new Employee(101, "Alice", 50000);
        Employee e2 = new Employee(102, "Bob", 60000);
        Employee e3 = new Employee(103, "Charlie", 55000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);

        employeeMap.put(e1.getId(), e1);
        employeeMap.put(e2.getId(), e2);
        employeeMap.put(e3.getId(), e3);

        System.out.println("\nEmployee List:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        System.out.println("\nEmployee Set:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }

        System.out.println("\nEmployee Map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        employeeList.sort(new SortBySalary());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
