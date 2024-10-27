package legacy;

public abstract class Employee {
    protected EmployeeRoles role;

    protected Name name;
    protected Department workplace;

    void setRole(EmployeeRoles role) {
        this.role = role;
    }

    public Employee(Name name, Department workplace) {
        this(EmployeeRoles.Worker, name, workplace);
    }

    public Employee(EmployeeRoles role, Name name, Department workplace) {
        this.role = role;
        this.name = name;
        this.workplace = workplace;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return String.format("legacy.Employee %s working in %s under %s",name,workplace.getDptName(), workplace.getBoss().name);
    }
}
