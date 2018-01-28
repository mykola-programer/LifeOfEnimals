import Animals.*;

public class LifeOfAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Tom");

        Dog dog1 = new Dog();
        dog1.setName("Jack");

        Animals cat2 = new Cat();
        //cat2.setName("Tomas");
        Animals dog2 = new Dog();
        //dog2.setName("Tyzik");

        animalIsRunning(cat1,5);
        animalIsEating(cat1);
        animalIsRunning(dog1,4);
        animalIsEating(dog1);

        ((Cat) cat2).setName("Jeck");
        System.out.println(cat2.getClass());  //?????????? Why class Cat ?
        cat2 = (Cat) cat2;
        System.out.println(cat2.getClass());
        ((Cat) cat2).setName("Jeck");

/*
        dog1.eat();
        dog1.run(5);

        cat1.eat();
        cat1.run(4);

        dog2.eat();
        dog2.run(15);

        cat2.eat();
        cat2.run(14);
*/



    }
    public static void animalIsRunning (Animals animal, int speed){
        animal.run(speed);
    }

    public static void animalIsEating (Animals animal){
        animal.eat();
    }

}
