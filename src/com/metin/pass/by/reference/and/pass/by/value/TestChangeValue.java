package com.metin.pass.by.reference.and.pass.by.value;

public class TestChangeValue {

    public static void main(String[] args) {

        Person p1 = new Person("Metin");
        Person p2 = new Person("Yusuf");

        System.out.println("-------main-------");
        System.out.println(p1);
        System.out.println(p2);

        changeValue(p1);

        System.out.println("-------main2-------");
        System.out.println(p1);
        System.out.println(p2);
    }

    private static void changeValue(Person person) {
        System.out.println("-------changeValue-------");
        System.out.println(person);
        person = new Person("Dilek");
        person.setName("Ahmet");
        System.out.println("-------changeValue2-------");
        System.out.println(person);
    }
}
