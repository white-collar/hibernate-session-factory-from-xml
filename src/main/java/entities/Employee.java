package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = -1798070786993154676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idD", unique = true, nullable = false)
    private Integer employeeId;

    @Column(name = "email", unique = false, nullable = false, length = 100)
    private String email;

    @Column(name = "first_name", unique = false, nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", unique = false, nullable = false, length = 100)
    private String lastName;

    public Employee() {
    }


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
