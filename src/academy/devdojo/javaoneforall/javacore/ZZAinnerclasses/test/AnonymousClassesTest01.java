package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

class Animal {
    public void walk() {
        System.out.println("animal walking");
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("dog walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("something is walking");
            }
        };

        animal.walk();
    }
}
