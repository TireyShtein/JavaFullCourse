package OOP.Super;

public class Person {

        String first, last;

        Person(String first, String last){
            this.first = first;
            this.last = last;
        }

        void printName(){
            System.out.printf("First name: %s\nLast name: %s\n", this.first, this.last);
        }
}
