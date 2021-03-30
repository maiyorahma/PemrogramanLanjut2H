package MoreOnClasses;
// the equals method 2
public class D {
    private  int x;
    public boolean equals(Object o){

        return ((D)o).x == this.x;
    }
    public static void main(String[] args) {
        D d = new D();
        d.x = 9;
        D c = new D();
        c.x =5;
        System.out.println(d.equals(c));
    }
}
