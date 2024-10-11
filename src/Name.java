import java.util.ArrayList;
import java.util.List;

public class Name {
    private String firstName;
    private String surname = "";
    private String lastName = "";

    public Name(String firstName, String surname, String lastName) {
        this.firstName = firstName;
        this.surname = surname;
        this.lastName = lastName;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class NameBuilder{
        private String firstName,surname,lastName;

        public NameBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public NameBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public NameBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Name create(){
            List<String> names = new ArrayList<>(List.of(new String[]{firstName, surname, lastName}));
            if(names.stream().allMatch(x->x==null))throw new Stone("Name can't be empty");
            return new Name(firstName,surname,lastName);
        }
    }

    @Override
    public String toString() {
        return
                firstName + " " + surname + " " +lastName
                ;
    }
}
