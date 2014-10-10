package net.dongdiemthuy.examples;

/**
 * This class represent a car owned by a Person
 * @see Person
 * @author DiemThuy Dong
 */
public class Car {
    
    private String brand;
    private int maxVelocity;
    
    /**
     * this method accelerates the car by the
     * factor specific by the parameter factor
     * @param factor The factor for acceleration.
     */
    public void accelerate (int factor){
        maxVelocity += factor;
    }
    
    /**
     * return the brand of the car
     * @return A string containing the brand.
     */
    public String getBrand(){
        return brand;
    }
}
