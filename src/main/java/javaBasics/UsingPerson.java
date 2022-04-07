package javaBasics;

public class UsingPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setMyAge("50");
        person.setIq("10");
        System.out.println(person.getMyAge());

        System.out.println(person.getIq());


    }
}
