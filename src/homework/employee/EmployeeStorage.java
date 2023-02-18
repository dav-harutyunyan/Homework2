package homework.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = value;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public Employee getEmployeeById(String Id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeID().equals(Id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchByCompanyName(String company) {
        for (int i = 0; i < size; i++) {
            Employee emp = employees[i];
            if (emp.getCompany().contains(company)) {
                System.out.println(emp);
            } else {
                System.out.println("there is no employee in this company");
            }
        }
    }

    public void searchEmployeeBySalaryRang(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (minSalary <= employee.getSalary() && maxSalary >= employee.getSalary()) {
                System.out.println(employee);
            } else {
                System.out.println("the employee salary does not belong to this range");
            }
        }
    }

    public void printByStatus(boolean active) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == true) {
                System.out.println(employees[i] + " ");
            }
        }
    }
}
