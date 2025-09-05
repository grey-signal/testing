package tech.zeta.java.junit;

public class PersonTest {
    public static void main(String[] args) {
        Person person1= new Person("Archie",22);
        Person person2= new Person("Archie",22);
        Person person3=person1;
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3==person1);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
