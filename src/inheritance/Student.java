package inheritance;

import legacy.Stone;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
    Checker rule;
    public Student(String name, List<Integer> grades, Checker rule) {
        this.name = name;
        if(rule == null) throw new Stone();
        if(grades.stream().allMatch(rule::check))
            this.grades = new ArrayList<>(grades);
        else{
            throw new Stone();
        }
    }
    public Student(String name, Checker rule, Integer... grades){
        this(name, List.of(grades),rule);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", rule=" + rule +
                '}';
    }
}

abstract class Rule implements Checker{
    public abstract boolean check(int x);
}

class Rule1 extends  Rule{
    public boolean check(int x) {
        return x>=2;
    }

}
abstract class RangeRule implements Checker{
    int min;
    int max;

    public RangeRule(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public boolean check(int mark){
        return mark>=min&& mark<=max;
    };
}
class RangeRuleRU extends RangeRule{

    public RangeRuleRU(int min, int max) {
        super(min, max);
    }
}
