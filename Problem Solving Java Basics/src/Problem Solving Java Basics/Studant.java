package javaapp;

public class Studant extends Person {

    int study_level;
    String specialization;
    double GPA;


    public Studant() {
        System.out.println("###########Studant############");
    }

    public Studant(double a, String n, String ad, String nat, Integer sl, String sp, Double gpa) {
        // name = n;
        // age = a;
        // address = ad;
        // nationality = nat;
        super(a, n, ad, nat);
        study_level = sl;
        specialization = sp;
        GPA = gpa;
    }

    public void setGPA (double gpa) {
        GPA = gpa;
    }
    
    public double getGPA() {
        return GPA;
    }

    public void setstudy_level(int sl) {
        study_level = sl;
    }

    public int getstudy_level() {
        return study_level;
    }

    public void setspecialization(String sp) {
        specialization = sp;
    }

    public String getspecialization() {
        return specialization;
    }

}
