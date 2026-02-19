package Lesson5;

public class ClassesAndObjects {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Roman";
    person1.age = 50;
    Person person2 = new Person();
    person2.name = "Ivan";
    person2.age = 45;
  int year1 = person1.calculateYearsToRetirement();
  int year2 = person2.calculateYearsToRetirement();
        System.out.println("Roman has");

    }
}

class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ma name is " + name + " and " + "i am " + age + " years old");
        }
    }
    void sayHello () {
        System.out.println("Helleeew");
    }

        int calculateYearsToRetirement() {
            int years = 65 - age;
        return years;
       }
    }
