package demo.bt1;
import java.util.ArrayList;
import java.util.Arrays;
public class MyList<E>  {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    // kích thước mặc định khi được khởi tạo
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    // tạo mảng có kích thước định trc
    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }
    // thêm phần tử vào vị trí trong mảng
    public void add(int index,E element) {
        //Kiểm tra tính hợp lệ của giá trị index truyền vào, thông báo lỗi nếu sai,
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            //Mở rộng mảng dữ liệu hiện tại thành mảng mới, nếu cần thiết
            //Dùng biến "temp" để lưu trữ tạm thời, đồng thời gán dữ liệu vào phần từ thứ index của mảng
            //Duyệt mảng từ phần tử index + 1(do index đã gán dữ liệu rồi) và tiến hành hoán đổi biến "temp" với các vị trí kế tiếp
            //đồng thời tăng kích thước mảng thực tế 1 đơn vị
            ensureCapacity();
            Object temp = elements[index];
            elements[index] = element;
            for (int i = index + 1; i < size + 1; i++) {
                elements[i] = temp;
                temp = elements[i + 1];
            }
            size++;
        }
    }
    E remove(int index){
        //Kiểm tra tính hợp lệ của giá trị index truyền vào, thông báo lỗi nếu sai,
        //nếu index hợp lệ thì duyệt mảng từ vị trí index, dùng hoán đổi để dịch dữ liệu qua phải
        //giảm giá trị mảng thực tế 1 đơn vị
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Actual size: " + size);
        } else {
            Object deletedElements = elements[index];
            for (int i = index; i < size; i++) {
                Object temp = elements[i];
                elements[i] = elements[i + 1];
                elements[i + 1] = temp;
            }
//            elements[size - 1] = null;
            size--;
            return (E) deletedElements;
        }
    }
    // kích thước mảng
    public int size(){
        return this.size;
    }
    // sao chép mảng
    public E clone(){
        Object cloneArray = Arrays.copyOf(this.elements, size);
        return (E) cloneArray;
    }
    // kiểm tra sự tồn tại phần tử trong mảng trả về true/false
    public boolean contains(E o) {

        return indexOf(o)>0;
    }
    // tìm vị trí phần tử trong mảng
    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
     boolean add(E o) {
         //Mở rộng mảng dữ liệu hiện tại thành mảng mới, nếu cần thiết
         //Gán dữ liệu vào phần từ cuối của mảng
         //đồng thời tăng kích thước mảng thực tế 1 đơn vị
         ensureCapacity();
         elements[size++] = o;
         return true;
    }
    // mở rộng mảng dữ liệu
    private void ensureCapacity(){
        if (size == elements.length) {
            //Nhân đôi kích thước mảng khai báo và copy dữ liệu sang mảng mới
            int newSize = elements.length * 2;
            this.elements = (Object[]) Arrays.copyOf(elements, newSize);
        }
    }
    // trả ra phần tử
    public E get(int index){

        //Kiểm tra tính hợp lệ của giá trị index truyền vào, thông báo lỗi nếu sai,
        // trả ra kết quả nếu giá trị hợp lệ
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Actual size: " + size);
        } else {
            return (E) elements[index];
        }
    }
    // xóa all các phần tử trong mảng kích thước trở về 0
    public void clear(){
       this.size = 0;
    }
}
