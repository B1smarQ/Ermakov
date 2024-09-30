public class Person {
    String firstName;
    String surname = "";
    String lastName = "";

    public Person(String firstName, String surname, String lastName) {
        this.firstName = firstName;
        this.surname = surname;
        this.lastName = lastName;
    }

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person " +
                firstName + " " + surname + " " +lastName
                ;
    }
}
