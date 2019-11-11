package oopuebung1;

import java.util.Scanner;

public class StringOops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.next();
        process(name);
    }

    public static void process(String name) {
        if (name.equals("Duck") ) {
            System.out.println("Hello Donald!");
        }
            name.toUpperCase();
            name.substring(1, 3);
            System.out.println(name + " has " + name.length() + " letters");

    }
}
