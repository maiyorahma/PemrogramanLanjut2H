package MoreOnClasses;

public class MethodOverloading {
    class A{
        public void doSomething(){

            System.out.println("A");
        }
        public void doSomething(String str){
            System.out.println(str);
        }
    }
    class B{
        public void main(String[] args){
            A object = new A();
            object.doSomething("B");
        }
    }
}
