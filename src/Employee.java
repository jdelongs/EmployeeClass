import java.time.LocalDate;
import java.time.Period;

/**
 * Created by John on 2017-01-24.
 */
public class Employee {
    private String firstname, lastName, sin;
    private LocalDate dateOfBirth;
   public Employee(String firstN, String lastN, String social, LocalDate dob)
    {
        firstname = firstN;
        lastName = lastN;
        sin = social;
        setBirthday(dob);
    }

    /**
     * this method will return an employees fname and lnames as a string
     * @return
     */
    public String toString()
    {
        return firstname + " " + lastName;
    }
    /*
    this method will validate the new employee is 15-90 years old
     */
    private void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();

        if (age >= 15 && age <= 90)
            dateOfBirth = dob;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years old");

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSin() {
        return sin;
    }
}
