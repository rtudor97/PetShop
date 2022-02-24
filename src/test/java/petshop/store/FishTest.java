package petshop.store;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import petshop.store.fish.Fish;
import petshop.store.fish.FishType;

public class FishTest {
    @Test
    public void constructor01Test(){
        Fish fish = new Fish("gold",2, FishType.GOLDFISH);
        String expected = "gold 2 ID: 0 Type: GOLDFISH";
        String actual = fish.toString();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void constructor02Test(){
        Fish fish = new Fish("beta",2, FishType.BETA);
        String expected = "beta 2 ID: 0 Type: BETA";
        String actual = fish.toString();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void swimTest(){
        Fish fish = new Fish("beta",2,FishType.BETA);
        String expected = "Swimming";
        String actual = fish.swim();
        Assertions.assertEquals(expected,actual);
    }

}
