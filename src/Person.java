public class Person {
    private Name name;
    private Person father;
    private int height;

    public Person(Name name) {
        this(name,null,0);
    }

    public Person(Name name, int height) {
        this(name,null,height);
    }
    public Person(String name, int height){
        this(new Name.NameBuilder().setFirstName(name).create(),null,height);
    }

    public Person(Name name, Person father, int height) {
        this.name = name;
        this.father = father;
        this.height = height;
        if(father != null) {
            if (this.name.getSurname() == null) {
                this.name.setSurname(this.father.name.getSurname());
            }
            if (this.name.getLastName() == null) {
                this.name.setLastName(this.father.name.getFirstName() + "ovich");
            }
        }
    }

    public Person(String name, Person father, int height){
        this(new Name.NameBuilder().setFirstName(name).create(),father,height);
    }


    public void setName(Name name) {
        this.name = name;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
