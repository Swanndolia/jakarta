package net.swanndolia.jakarta.entity;

import java.util.Random;

public class Person {
    String firstname;
    String lastname;
    int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = new Random().nextInt(100);
    }
    public Person(String firstname, String lastname,int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

}
