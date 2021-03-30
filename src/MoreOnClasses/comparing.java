package MoreOnClasses;

public class comparing {
    static class Animal {
        private int age;

        public static void main(String[] args) {
            comparing.Animal Dog = new comparing.Animal();
            Dog.age = 5;

            comparing.Animal Cat = new Animal();
            Cat.age = 5;
            System.out.println(Dog == Cat);
        }
    }
}
