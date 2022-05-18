package javatest;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Object> data = new ArrayList<>();
        data.add("3");
        data.add(5);

        List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats;
//        animals.add(new Cat());
    }


}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}



