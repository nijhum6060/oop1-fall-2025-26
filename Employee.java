public class Employee {

    abstract class Employee {
    String name;
    Employee(String name) {
    this.name = name;
    }

        abstract double calculateSalary();

        void showDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Type: " + this.getClass().getSimpleName());
        }
    }

    class FullTimeEmployee extends Employee {
        private double monthlySalary;

        FullTimeEmployee(String name, double monthlySalary) {
            super(name);
            this.monthlySalary = monthlySalary;
        }

        @Override
        double calculateSalary() {
            return monthlySalary;
        }
    }

    public class Main {
        public static void main(String[] args) {
            FullTimeEmployee emp = new FullTimeEmployee("Alice Johnson", 5000.00);

            emp.showDetails();
            System.out.println("Monthly Salary: $" + emp.calculateSalary());
        }
    }

}
