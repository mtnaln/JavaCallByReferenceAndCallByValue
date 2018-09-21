package com.metin.pass.by.reference.and.pass.by.value;

public class TestSwap {

    public static void main(String[] args) {

        Person p1 = new Person("Metin");
        Person p2 = new Person("Yusuf");

        System.out.println("----------main----------");
        System.out.println(p1);
        System.out.println(p2);

        swap(p1, p2);

        System.out.println("----------main2----------");
        System.out.println(p1);
        System.out.println(p2);
    }

    private static void swap(Person p1, Person p2) {

        Person temp = p1;
        p1 = p2;
        p2 = temp;

        System.out.println("----------swap----------");
        System.out.println(p1);
        System.out.println(p2);
    }
}