package office;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee){
        if(employees.contains(employee))return;
        if(employee.workplace == this){
            employees.add(employee);
            return;
        }
        employee.workplace.removeEmployee(employee);
        employee.workplace = this;
        employees.add(employee);
    }
    void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
