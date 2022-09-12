package main;

@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

     default void printName() {
        System.out.println("Keesun");
    }

    default void printAge() {
        System.out.println("27");
    }
}
