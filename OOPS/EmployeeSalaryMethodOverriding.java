public class EmployeeSalaryMethodOverriding {
   double getSalary() {
     return 30000; 
    } 
} 
class Manager extends EmployeeSalaryMethodOverriding {
     double getSalary() {
         return 50000;
         }
     public static void main(String[] args) {
         EmployeeSalaryMethodOverriding e = new Manager();
          System.out.println("Salary: " + e.getSalary()); 
        }
     }


