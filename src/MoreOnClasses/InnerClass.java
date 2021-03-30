package MoreOnClasses;

public class InnerClass {
    static class Hand{
        public void shake(){
            System.out.println("Hi");
        }
    }

    public static void main(String[] args) {
        Hand b= new Hand();
        b.shake();
    }
}
