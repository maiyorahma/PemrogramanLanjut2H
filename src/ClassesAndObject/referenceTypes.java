package ClassesAndObject;

import MoreOnClasses.Person;

public class referenceTypes {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }
    static void change(Person p) {
        p.setAge(10);
    }
    static class Person {
        private int age;
        void setAge(int age) {
            this.age = age;
        }
        int getAge() {
            return this.age;
        }
    }
}
