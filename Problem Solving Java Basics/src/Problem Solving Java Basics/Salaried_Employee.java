package javaapp;

public class Salaried_Employee extends Employee{

    double bonas, deduction;

    public Salaried_Employee() {

    }

    public Salaried_Employee(double a, String n, String ad, String nat, double s, String r, String j, double b, double d) {
        super(a, n, ad, nat, s, r, j);
        bonas = b;
        deduction = d;
    }

    @Override
    public double get_salary() {
        return salary + bonas - deduction;
    }
}
