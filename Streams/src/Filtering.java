import domain.Employee;
import domain.EmployeeUtil;
import java.util.List;



public class Filtering {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testFiltering() {
        employees.stream()
                .filter(e -> e.getDepartment().equals("Marketing"))
                //.filter(Employee::isExecutive)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        new Filtering().testFiltering();
    }

}

