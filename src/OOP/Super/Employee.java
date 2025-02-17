package OOP.Super;

public class Employee extends Person{

    double salary;

    Employee(String first, String last, double salary){
        super(first, last); // invoking constructor of the parent with
                            // required parameters from parent constructor
                            // in this case: first, last as of Person(String first, String last)
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary " + this.salary);
    }
}
