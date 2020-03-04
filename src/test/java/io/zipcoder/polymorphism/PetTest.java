package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PetTest{

    @Test
    public void getNameTest(){

        String name = "Minky";
        Cat minky = new Cat(name);

        String expected = "Minky";
        String actual = minky.getName();
        Assert.assertEquals((expected), actual);
    }
    @Test
    public void SetNameTest(){
        Cat noName = new Cat();
        noName.setName("Joker");
        String expected = "Joker";
        String actual = noName.getName();
        Assert.assertEquals((expected), actual);
    }
    @Test
    public void comparePetsTest(){
        Cat cat3 = new Cat("A");
        Cat cat2 = new Cat("B");
        Cat cat1 = new Cat("C");

        Pet[] petsToSort = {cat1,cat2,cat3};

        Arrays.sort(petsToSort);

        Pet[] expected =  {cat3,cat2,cat1};
        Pet[] actual = petsToSort;
        Assert.assertEquals(expected,actual);

    }

}
