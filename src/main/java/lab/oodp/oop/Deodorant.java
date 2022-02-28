package lab.oodp.oop;

public class Deodorant {

    private String brand;
    private String fragrance;
    private double price;

    public Deodorant(String brand, String fragrance, double price) {

        this.brand = brand;
        this.fragrance = fragrance;
        this.price = price;
    }

    public String toString() {
        String info = brand + " " + fragrance;
        info +=  " Deodorant, \n$" + price;
        return info;
    }

  
    //TODO: implement this
    public double getPrice() {
        return price;
    }
    
  //TODO: implement this
    public String getBrand() {
        return "";
    }
    
    
    //TODO: implement this
    public String getFragrance() {
        return "";
    }
    
    //TODO: implement this
    public void setPrice(double price) {
        this.price = 0;
    }

    //TODO: implement this
    public void setBrand(String brand) {
        this.brand = "";
    }
    
    //TODO: implement this
    public void setFragrance(String fragrance) {
        this.fragrance = "";
    }
    
  //TODO: implement this
    public boolean isMoreExpensiveThan(Deodorant other) {
        return false;
    }
    
    
}