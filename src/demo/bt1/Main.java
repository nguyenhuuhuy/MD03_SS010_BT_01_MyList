package demo.bt1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.ensureCapacity(2);
        System.out.println(myList.get(2));
        myList.clear();
    }
}
