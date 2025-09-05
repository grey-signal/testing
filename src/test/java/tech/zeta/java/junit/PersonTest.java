package tech.zeta.java.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void testEquals() {
        Person person1= new Person("Archie",25);
        Person person2= new Person("Archie",25);
        assertEquals(person1,person2,"Person objects should be equal");
    }

    @Test
    void testHashCode() {
    }
}