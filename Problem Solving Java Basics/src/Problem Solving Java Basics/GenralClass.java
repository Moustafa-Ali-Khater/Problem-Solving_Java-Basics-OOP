package javaapp;

public class GenralClass {
    private double width;
    private double length;
    private String wid;
    private String leng;
    
    /*private int Emp_ID;
    private String Name, Depart;
    private double Salary, Bonus;
    private boolean Resident;*/

    /*private String maker;
    private int model;
    private static int no_of_objects;*/


    /*public GenralClass() {
        Emp_ID = 100;
        Name = "No Name";
        Depart = "No Assigned yet";
        Salary = 3000;
        Bonus = 500;
        Resident = true;
    }

    public GenralClass(int idno,String n) {
        Emp_ID = idno;
        Name = n;
    }

    public GenralClass(int idno,String n,boolean r) {
        // Emp_ID = idno;
        // Name = n;
        this(idno, n);
        Resident = r;
    }

    public GenralClass(int idno, String n, String d, double s, double b, boolean r) {
        // Emp_ID = idno;
        // Name = n;
        // Resident = r;
        this(idno , n, r);
        Depart = d;
        Salary = s;
        Bonus = b;
    }*/

    public GenralClass(){
        length = 15;
        width = 10;
        leng = "Mostafa";
        wid = "Ali";
    }

    public GenralClass(double l, double w) {
        length = l;
        width = w;
    }
    
    public GenralClass(String l, String w){
        leng = l;
        wid = w;
    }


    /*public GenralClass() {
        maker = "Honda";
        model = 2023;
        no_of_objects ++;
    }

    public GenralClass(String m, int mo) {
        maker = m; 
        model = mo;
        no_of_objects ++;
    }*/



    public void setlength(double l) {
        //l = 70;
        length = l;
    }

    public double getlength() {
        return length;
    }

    public void setwidth(double w) {
        width = w;
    }

    public double getwidth() {
        return width;
    }

    public void setwid(String w) {
        wid = w;
    }

    public String getwid() {
        return wid;
    }
    
    public void setleng(String l) {
        leng = l;
    }

    public String getleng() {
        return leng;
    }

    public double getarea() {
        return length * width ;
    }

    public void modifyobject(GenralClass r) {
        r.length = 98;
        r.width = 67;
    }


    public GenralClass add(GenralClass k) {
        GenralClass i = new GenralClass();
        // i.length = k.length + j.length;
        // i.width = k.width + j.width;
        i.length = this.length + k.length;
        i.length = this.width + k.width;
        return i;
    }

    public boolean isequal(GenralClass obj2) {
        if (this.length == obj2.length && this.width == obj2.width) {
            return true;
        } else {
            return false;
        }
    }

    public GenralClass(GenralClass sourceobject) {
        length = sourceobject.length;
        width = sourceobject.width;
    }
    

    /*public void setmaker(String m) {
        if (m == "Toyota" || m == "Honda" || m == "Merceds") {
            maker = m;
        }
        else{
            System.out.println("Invalid Maker");
        }

    }

    public void setmodel(int year) {
        if (year >= 0) {
            model = year;
        }
        else{
            System.out.println("Please enter a positive integer year");
        }
    }

    public String getmaker() {
        return maker;
    }

    public int getmodel() {
        return model;
    }

    public static int get_no_of_objects() {
        return no_of_objects;
    }*/


    /*public void Set_Salary(double ) {
        
    }
    public void Set_Salary(double ,double) {

    }
    public void Depart(double ) {

    }
    public void Set_Emp_ID(String ) {

    }*/
    /*public void Print_Emp_Data() {
        System.out.println("ID \t" + Emp_ID);
        System.out.println("Name \t" + Name);
        System.out.println("Depart \t" + Depart);
        System.out.println("Salary \t" + Salary);
        System.out.println("Bonus \t" + Bonus);
        System.out.println("Resident \t" + Resident);
    }*/


    /*public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }*/

}