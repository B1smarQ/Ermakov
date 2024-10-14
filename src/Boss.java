public class Boss extends Employee {

    public Boss(Name name, Department workplace) {
        this.name = name;
        this.workplace = workplace;
        workplace.setBoss(this);
    }

    @Override
    public String toString() {
        return String.format("%s, boss of %s",name,workplace.getDptName());
    }
}
