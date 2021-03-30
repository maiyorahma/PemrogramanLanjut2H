package MoreOnClasses;
//inheritance
public class Animal {
    public void makeSound(){

        System.out.println("hi");
    }
}
class Dog extends Animal {
    Animal dog = new Animal();
}

class f {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}