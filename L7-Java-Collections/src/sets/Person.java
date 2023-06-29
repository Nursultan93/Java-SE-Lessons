package sets;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;


    public Person() {

    }

    public Person(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {

        int result = getId().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        Person p = (Person) obj;

        if (p.getId() == null)
            return false;

        if (this.getId() == p.getId() && this.getFirstName() == p.getFirstName() && this.getLastName() == p.getLastName())
            return true;

        return false;

    }
}
