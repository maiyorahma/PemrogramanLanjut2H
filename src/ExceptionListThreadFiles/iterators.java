package ExceptionListThreadFiles;

import java.util.Iterator;
import java.util.LinkedList;

public class iterators {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();

        System.out.println(it.next());
    }
}
