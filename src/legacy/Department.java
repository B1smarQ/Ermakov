package legacy;

public class Department {
    private Employee Boss;
    private final String dptName;
    public void setBoss(Employee boss) {
        this.Boss = boss;
    }

    public Department(String dptName) {
        this.dptName = dptName;
    }

    public String getDptName() {
        return dptName;
    }

    public Employee getBoss() {
        return Boss;
    }

    @Override
    public String toString() {
        return "ru.makeev.legacy.Department{" +
                "ru.makeev.legacy.Boss=" + Boss.name +
                ", dptName='" + dptName + '\'' +
                '}';
    }


}
