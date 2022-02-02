import domain.Employee;
import domain.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

public class DistinctLimitSkip {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void testDistinct() {
        Stream<String> employeesNamesStream =
                employees
                        .stream()
                        .map(Employee::getName)
                        .distinct();
        employeesNamesStream.forEach(System.out::println);
    }

    private void testLimit() {
        Stream<String> employeesNamesStream =
                employees
                        .stream()
                        .map(Employee::getName)
                        .distinct()
                        .limit(100);
        employeesNamesStream.forEach(System.out::println);
    }

    private void testSkip() {
        Stream<String> employeesNamesStream =
                employees
                        .stream()
                        .skip(2)
                        .map(Employee::getName);
        employeesNamesStream.forEach(System.out::println);

    }

    public static void main(String[] args) {
        System.out.println("Distinct");
		new DistinctLimitSkip().testDistinct();
        System.out.println("Limit");
		new DistinctLimitSkip().testLimit();
        System.out.println("skip");
        new DistinctLimitSkip().testSkip();
    }

}
