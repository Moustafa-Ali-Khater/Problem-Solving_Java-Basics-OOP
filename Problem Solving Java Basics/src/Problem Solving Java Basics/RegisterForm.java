package javaapp;

enum Gender{Male, Female};
enum Course{Database, Programming, Math, ERP};
enum Semester{Summer, Winter, Fali, Spring};

public class RegisterForm {
    String stuname;
    Gender stugender;
    Course crs;
    Semester sem;

    public RegisterForm() {
        stuname = "No Name";
        stugender = Gender.Male;
        crs = Course.Math;
        sem = Semester.Spring;
    }
}
