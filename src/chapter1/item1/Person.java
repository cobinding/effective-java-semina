package chapter1.item1;

public class Person {
    private String name;
    private int age;

    // public 생성자 정의
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
