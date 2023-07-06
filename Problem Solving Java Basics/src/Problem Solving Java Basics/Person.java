package javaapp;

public class Person {
    double age;
    String name, address, nationality;


    public Person() {
        System.out.println("**********Person***********");
    }

    public Person(double a, String n, String ad, String nat){
        name = n;
        age = a;
        address = ad;
        nationality = nat;
    }

    public void setname(String n){
        name = n;
    }

    public String getname() {
        return name;
    }

    public void setage(double a){
        age = a;
    }

    public Double getage() {
        return age;
    }

    public void setaddress(String ad){
        address = ad;
    }

    public String getaddress() {
        return address;
    }

    public void setnationality(String nat){
        nationality = nat;
    }

    public String getnationality() {
        return nationality;
    }

    public void print_all_details(){
        System.out.println("Name : " + name + "\n Age : " + age + "\n Address : " + address + "\n Nationality : " + nationality);
    }

    
}
