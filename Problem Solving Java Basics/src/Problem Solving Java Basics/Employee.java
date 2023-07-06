package javaapp;

public class Employee extends Person{
    
    double salary;
    String rank, job;

    public Employee() {

    }

    public Employee(double a, String n, String ad, String nat, double s, String r, String j) {

        super(a, n, ad, nat);
        salary = s;
        rank = r;
        job = j;
    }

    public void set_salary(double s) {
        salary = s;
    }

    public double get_salary() {
        return salary;
    }

    @Override
    public void print_all_details(){
        super.print_all_details();
        System.out.println("Salary : " + salary + "\n Rank : " + rank + "\n Job : " + job);
    }


}
