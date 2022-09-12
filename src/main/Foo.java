package main;

public class Foo {
    public static void main(String[] args) {
        int baseNumber = 10;
        //익명 내부 클래스
        RunSomething runSomething = (number) -> number + baseNumber;

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
    }
}
