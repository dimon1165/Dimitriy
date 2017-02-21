package learn.java.javacode.Patterns.Structural.Adapter;

/**
 * Created by dvorop on 21.02.2017.
 */
public class EmployeeDB implements Employee {
    private String Id;
    private String FirstName;
    private String LastName;
    private String Email;

    public EmployeeDB(String id, String firstName, String lastName, String email) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    @Override
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
