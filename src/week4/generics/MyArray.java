package week4.generics;

/**
 * Created by macaque on 15.07.2016.
 */
public class MyArray<T> {

    private T[] mas;
    private int size;

    public MyArray(int size){
        mas =(T[]) new Object[size];
    }

    private void test(){
       // T el = new T();
        Object o = mas[0];
    }


    public void add(T el){
        if (size == mas.length){
            throw new ArrayStoreException("array is full");
        }
        mas[size++] = el;
    }
    public void set(int index, T el){

    }
    public int indexOf(T el){
        return -1;
    }

}
