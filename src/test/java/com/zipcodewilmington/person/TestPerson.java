package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
       int expectedAge = 45;

        // When
        Person person = new Person();

        // Then
        int actualAge = person.getAge();

        Assert.assertEquals(expectedAge,actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 210;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 67;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPet() {
        // Given
        Person person = new Person();
        String expected = "dog";

        // When
        person.setPet(expected);

        // Then
        String actual = person.getPet();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "green";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavortieColor() {
        // Given
        Person person = new Person();
        String expected = "orange";

        // When
        person.setFavoriteColor(expected);

        // Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testgetweight() {
        // Given
        Person person = new Person("Ricky", 64,643,54,"Dog","Blue","Red");
        int expected = 643;

        // When


        // Then
        int actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
}
