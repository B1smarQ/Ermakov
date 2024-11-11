package office;

public class Employee {
    Department workplace;
    String name;

    public Employee(Department workplace, String name) {
        this.workplace = workplace;
        workplace.addEmployee(this);
        this.name = name;
    }

    public void setWorkplace(Department dpt){
        if(dpt == workplace) return;
        if(dpt == null){
            this.workplace = null;
            return;
        }
        workplace.removeEmployee(this);
        workplace = dpt;
        dpt.addEmployee(this);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "workplace=" + workplace.name +
                ", name='" + name + '\'' +
                '}';
    }
}
