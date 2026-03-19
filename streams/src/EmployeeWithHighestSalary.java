import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeWithHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", "IT", 5000));
        employees.add(new Employee("B", "IT", 7000));
        employees.add(new Employee("C", "HR", 4000));
        employees.add(new Employee("D", "HR", 6000));

        Map<String, Optional<Employee>> map = employees.stream().collect(Collectors.groupingBy(e-> e.department, Collectors.maxBy((emp1, emp2) -> (int)(emp1.salary- emp2.salary))));
        for(String key : map.keySet()){
            System.out.println(key +" "+ map.get(key).get().name);
        }
    }
}
