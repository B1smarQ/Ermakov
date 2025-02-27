package random;

import reflexive.ValidationException;

public class HumanTests {

    public void test1(Human human){
        if(human == null || human.getAge() <=0 || human.getAge() >100){
            throw new ValidationException("Age must be between 0 and 100.");
        }
    }

    public void test2(Human human){
        if(human == null || human.getName() == null || human.getName().isBlank()){
            throw new ValidationException("Invalid name.");
        }
    }

    public void test3(Human human){
        if(human == null || human.getGender() == 0){
            throw new ValidationException("Woman moment");
        }
    }

}
