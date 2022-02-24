package petshop.store;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import petshop.store.cat.Breed;
import petshop.store.cat.Cat;

public class CatTest {
    @Test
    public void constructor01Test(){
        Cat cat = new Cat("Garfield",3, Breed.MUNCHKIN);
        String expected = "Garfield 3 ID: 0 Breed: MUNCHKIN";
        String actual = cat.toString();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void constructor02Test(){
        Cat cat = new Cat("Pers",5, Breed.PERSIAN);
        String expected = "Pers 5 ID: 0 Breed: PERSIAN";
        String actual = cat.toString();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getBreedTest(){
        Cat cat = new Cat("Pers",5, Breed.PERSIAN);
        Breed expected = Breed.PERSIAN;
        Breed actual = cat.getBreed();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makeNoiseTest(){
        Cat cat = new Cat("cat1",4,Breed.SIBERIAN);
        String expected = "Meow";
        String actual = cat.makeNoise();
        Assertions.assertEquals(expected,actual);
    }

}
