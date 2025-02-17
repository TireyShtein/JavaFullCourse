package OOP.Polymorphism.Runtime;

import OOP.Abstraction.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Profession profession;
        String choice;

        System.out.print("Choose, who do you want to be? (Artist or Worker): ");
        choice = scanner.nextLine().toLowerCase();

        if (choice.equals("artist"))
            profession = new Artist();
        else
            profession = new Worker();

        profession.choice();

        scanner.close();
    }
}
