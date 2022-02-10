package ru.geekbrains.java.hw1;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> box;

    public Box(){
        this.box=new ArrayList<>();
    }

    public boolean addFruit(T fruit){
        if(this.box.size() != 0) {
            if(!this.box.get(0).getClass().getName().equals(fruit.getClass().getName())){
                System.out.println("Не стоит перемешивать фрукты в коробках.");
                return false;
            } else {
                this.box.add(fruit);
                System.out.println("В коробку положили "+fruit.getClass().getName());
                return true;
            }
        } else {
            this.box.add(fruit);
            System.out.println("В коробку положили "+fruit.getClass().getName());
            return true;
        }
    }

    public float getWeight(){
        if(box.size()!=0) {
            return (float) box.size() * box.get(0).getWeight();
        }
        else return 0;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void pourFruitsIn(Box<T> another){
        for (int i=box.size()-1;i>=0;i--) {
            if(another.addFruit(box.get(i))) {
                box.remove(i);
            } else return;
        }
    }

}
