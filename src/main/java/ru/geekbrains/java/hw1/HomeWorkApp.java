package ru.geekbrains.java.hw1;

public class HomeWorkApp {

    public static void main(String[] args) {
        SomeKindOfArray<Integer> arr1=new SomeKindOfArray<>(1,2,3,4,5);
        arr1.printArray();
        arr1.changeElements(2,3);
        arr1.printArray();
        System.out.println(arr1.turnItIntoArrayList());

        Box<Fruit> box1=new Box();
        Box<Fruit> box2=new Box();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println("Weight: "+box1.getWeight());
        System.out.println("Weight: "+box2.getWeight());
        compareWeights(box1, box2);
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        compareWeights(box1, box2);
        box1.pourFruitsIn(box2);
        Box<Fruit> box3=new Box<>();
        box1.pourFruitsIn(box3);
        System.out.println("Weight3: "+box3.getWeight());
        System.out.println("Weight1: "+box1.getWeight());
    }

    static public void compareWeights(Box<?> box1, Box<?> box2){
        if (box1.compare(box2)) {
            System.out.println("Веса коробок равны.");
        } else {
            System.out.println("Веса коробок отличаются.");
        }
    }

}
