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

    private static void changeValue(Person personParam) {
        System.out.println("-------changeValue-------");
        System.out.println(personParam);
        personParam.setName("Mustafa");
        personParam = new Person("Dilek");
        personParam.setName("Ahmet");
        System.out.println("-------changeValue2-------");
        System.out.println(personParam);
    }
}
