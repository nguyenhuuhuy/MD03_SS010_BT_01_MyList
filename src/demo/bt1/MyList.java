package demo.bt1;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {

    }
    public void add(int index) {
//        System.out.println(index);
    }
    public E remove(int index){

        return null;
    }

    public int size(){

        return 0;
    }
    public E clone(){

        return null;
    }
    public boolean contains(E o) {

        return true;
    }
    public int indexOf(E o) {

        return 0;
    }
    public boolean add(E o) {

        return true;
    }
    public void ensureCapacity(int minCapacity){
        System.out.println("ok");
    }
    public E get(int i){

        return null;
    }
    public void clear(){
        System.out.println("xong");
    }
}
