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
            checkValidity();
            return new Name(firstName,surname,lastName);
        }
        private  void checkValidity(){
            if(firstName == null && surname == null && lastName == null) throw new Stone("Name can't be empty");
            assert firstName != null;
            if(firstName.isBlank()) {
                assert surname != null;
                if (surname.isBlank()) {
                    assert  lastName !=null;
                    if(lastName.isBlank())
                        throw new Stone("Name can't be empty");

                }
            }
        }
    }

    @Override
    public String toString() {
        return
                firstName + " " + surname + " " +lastName
                ;
    }
}
