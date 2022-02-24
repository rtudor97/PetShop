package staff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void constructorTest01(){
        Employee employee = new Employee("Monica");
        String expected = "Monica 1";
        String actual = employee.toString();
        Assertions.assertEquals(expected,actual);

    }
}
