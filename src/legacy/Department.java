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
        return "legacy.Department{" +
                "legacy.Boss=" + Boss.name +
                ", dptName='" + dptName + '\'' +
                '}';
    }


}
