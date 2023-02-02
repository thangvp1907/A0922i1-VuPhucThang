package arraylist;

import java.util.Arrays;

public class myList<E> {
    private int size =0;
    static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    //Tăng chiều dài cuủa mảng
    private void enSureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    //Phần tử dúng độ dài mảng
    public myList(){
        elements= new Object[DEFAULT_CAPACITY];
    }

    //Lấy phần tử
    public myList(Object[] elements) {
        this.elements = elements;
    }

    //thêm phần tử vào mảng không cần chỉ định
    public boolean add(E element) {
        if (size == elements.length) {
            enSureCapacity();
        }
        //tăng kích thước và thêm phần tử
        elements[size++] = element;
        //trả về mảng sau khi thêm
        return true;
    }

    //thêm phần tử vào mảng chỉ định
    public void add(int index,E element){
        //Chuyển các phần tử sang phải bằng đúng index
        for ( int i = size; i >=index ; i--) {
            elements[i+1]=elements[i];
        }
        //chèn phần tử vào đúng index chọn
        elements[index] = element;
        //tăng kích thước lên 1
        size++;
    }

    //Xóa phần tử vào mảng
    public Object remove(int index){
        //Truy cập đúng index muốn xóa phần tử
        Object element =elements[index];
        //chuyển các phần tử sang trái
        for (int i = index; i <size-1 ; i++) {
            elements[i]= elements[i+1];
        }
        //xóa phaafn tử thành rỗng
        elements[index]=null;
        //giảm kích thuwosc mảng sau khi xóa
        size--;
        //Trả về mảng sau khi xóa phần tử
        return element;
    }
    //    Lấy ra phần tử
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    //Sao chép mảng
    public E clone(){
        return null;
    }
    //Kểm tra phn tử có trong mảng
    public boolean contains(Object e){
        //Kiểm tra trong mảng
        for (int i = 0; i < size ; i++) {
            //Lấy mảng e so sánh(hàm equals) với các phần tử trong mảng
            if(e.equals(elements[i]))
                return true;
        }
        return false;
    }
}
