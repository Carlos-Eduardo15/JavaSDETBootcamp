package com.ti.sesionone.encapsulation;

class Person{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name="Pedro Picapiedra";
        person.setName("Pedro");
        person.setAge(34);

        System.out.println("Name: " + person.getName() + " with age: " + person.getAge());
    }
}
