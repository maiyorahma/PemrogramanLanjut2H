package MoreOnClasses;
//annonymous 2
public class x {
    public void print(){
        System.out.println("x");
    }
}
class z{
    public static void main(String[] args) {
       x object = new x(){
            @Override public void print() {
                System.out.println("hello");
            }
        };
        object.print();
    }
}

