package legacy;

public class Worker extends Employee{

    public Worker(Name name, Department workplace) {
        super(name, workplace);
    }

    public void promoteToBoss(){
        if(this.workplace.getBoss()!=null) throw new Stone("ru.makeev.legacy.Boss already exists");

        this.workplace.setBoss(this);
        this.role = EmployeeRoles.Boss;
    }
    @Override
    public String toString() {
        return "ru.makeev.legacy.Worker{" +
                "role=" + role +
                ", name=" + name +
                ", workplace=" + workplace +
                '}';
    }
}
