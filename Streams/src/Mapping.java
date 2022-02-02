import domain.Employee;
import domain.EmployeeUtil;
import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testMapping() {
        Stream<String> empStream = employees
                .stream()
                .map(Employee::getName)
                .map(String::toUpperCase);

        empStream.forEach(System.out::println);
    }
    public static void main(String[] args) {
        new Mapping().testMapping();
    }

}
