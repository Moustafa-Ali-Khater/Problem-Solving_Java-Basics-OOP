package javaapp;

public class CD implements RetalItem, Displyable{
    
    double price;
    String title, artist;



    public CD() {

    }


    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }
    
    public double getitemprice() {
        return price;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getartist() {
        return artist;
    }

    public void display() {
        System.out.println("Price : " + price + "\n Title : " + title + "\n Artist : " + artist);
    }
}
