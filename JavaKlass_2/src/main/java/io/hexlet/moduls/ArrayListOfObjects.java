package io.hexlet.moduls;
import java.util.ArrayList;



public class ArrayListOfObjects {
    private Object[] data;
    private int size;
    
    public ArrayListOfObjects() {
        data = new Object[10];
        size = 0;
    }
    
    public void add(Object value) {
        ArrayList<Integer> l = new ArrayList<>();
        l.ensureCapacity(5);

        // Увеличивает размер внутреннего массива если место закончилось
//        ensureCapacity();
        data[size++] = value;
    }


    public Object get(int index) {
        return data[index];
    }


}
