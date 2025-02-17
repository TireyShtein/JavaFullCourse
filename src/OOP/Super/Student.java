package OOP.Super;

public class Student extends Person {

    double GPA;


    Student(String first, String last, double gpa) {
        super(first, last); // == Person(first, last)
        this.GPA = gpa;
    }

    void showFullInfo(){
        System.out.println(this.first + " " + this.last);
        System.out.println("GPA: " + this.GPA);
    }
}
