package arraylist;

import java.util.Arrays;

public class myListTest<E> {
        private int size =0;
        private static final int DEFAULT_CAPACITY=0;
        private Object element[];

        public myListTest(){
            element = new Object[DEFAULT_CAPACITY];
        }
        private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
        }
        public void add(E e){

        }
}
