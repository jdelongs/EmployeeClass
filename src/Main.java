import java.time.LocalDate;
import java.time.Month;

/**
 * Created by John on 2017-01-24.
 */
public class Main{


    public static void main(String[] args){
        Employee employee = new Employee("John" , "Rex", "200339389", LocalDate.of(1997, Month.FEBRUARY, 14));
        System.out.println("the Employee is:" + employee.toString());

        System.out.printf("%s was born on %s%n:", employee.getFirstname(), employee.getDateOfBirth().getDayOfWeek());
    }
}
