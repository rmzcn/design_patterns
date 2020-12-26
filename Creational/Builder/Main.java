package Creational.Builder;
/*
 *************************
 * Ramazan Can Gölgen
 * github/rmzncn
 *************************
 * */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder().age(39).gender(1).identityNumber("12345").build();
        Person person2 = new Person.Builder().name("ramazan can").surname("gölgen").gender(1).build();

        System.out.println(person1.getIdentityNumber());
        System.out.println(person2.getSurname());

    }
}
