import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void constructor01Test(){
        Customer customer = new Customer<>("Peter");
        String expected = "Peter";
        String actual = customer.getName();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void greetingTest01(){
        Customer customer = new Customer<>("Bob");
        String expected = "Hello, I'm fine thank you for asking";

    }

    @Test
    public void makePurchaseTest01(){

    }
}
