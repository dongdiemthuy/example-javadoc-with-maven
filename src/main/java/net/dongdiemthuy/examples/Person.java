package net.dongdiemthuy.examples;
/**
 * A person
 * @author Dong Diem Thuy 
 */
public class Person {
    private String name;
    private Car car;
    public Person (String name){
        this.name = name;
    }
    /**
     * Sets the a {@link Car} for this person
     * @param car An instancialized car.
     */
    public void setCar(Car car){
        this.car = car;
    }
    /**
     * Say hello.
     */
    public void sayHello(){
        System.out.println("Hello! My name is"+ name);
    }
}
