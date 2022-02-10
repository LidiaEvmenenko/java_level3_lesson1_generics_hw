package ru.geekbrains.java.hw1;

import java.util.ArrayList;

public class SomeKindOfArray<T> {

    private T[] array;

    public SomeKindOfArray(T... values) {
        this.array = values;
    }

    public void showType() {
        System.out.println("Тип T: " + array.getClass().getName());
    }

    public void printArray() {
        System.out.print("[");
        for (T a: array) {
            System.out.print(" "+a+" ");
        }
        System.out.println("]");
    }

    public void changeElements(int pos1, int pos2){
        T tmp=array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=tmp;
    }

    public ArrayList<T> turnItIntoArrayList(){
        ArrayList<T> arrayList = new ArrayList<>();
        for(int i=0; i< array.length; i++){
            arrayList.add(array[i]);
        }
        return arrayList;
    }

}
