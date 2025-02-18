package OOP.GetterSetter;

public class Student {


    private final String SEX = "F"; // final -- to not make it writable ONLY readable
    private String first, last;
    private double GPA;

    Student(String first, String last, double gpa){
        this.first = first;
        this.last = last;
        this.GPA = gpa;
    }


    // GETTERS Methods
    String getFirstName(){
        return this.first;
    }

    String getLastName(){
        return this.last;
    }

    double getGPA(){
        return this.GPA;
    }
    // end of GETTERS


    // SETTERS Methods
    void setFirst(String first){
        this.first = first;
    }

    void setLast(String last){
        this.last = last;
    }

    void setGPA(double gpa){
        this.GPA = gpa;
    }
    // end of SETTERS

}
