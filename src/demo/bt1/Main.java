package demo.bt1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(5);
        myList.add(0,15);
        myList.add(55);
        myList.add(2);
        myList.add(3);
        myList.add(4); // vị trí thứ 4
        myList.add(5);
        System.out.println("mảng ban đầu");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i)+ " ");
        }
        System.out.println("\nĐộ dài của mảng hiện tại: "+myList.size);
        // xóa ở vị trí thứ 4
        myList.remove(4);
        System.out.println("sau khi xóa bỏ 1 phần tử độ dài mảng thay đổi: "+myList.size);
        // kiểm tra xem có phần tử ở trong mảng không true/false
        System.out.println("kiểm tra sự tồn tại của phần tử trong mảng: "+myList.contains(4));
        System.out.println("vị trí: " +myList.indexOf(55) );
    }
}
