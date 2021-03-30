package MoreOnClasses;

public interface Animal2 {
    public void eat();
}
class Cat implements Animal2{
    public void eat() {
        System.out.println("Cat eats");
    }
}
