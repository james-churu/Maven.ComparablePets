package io.zipcoder.polymorphism;

public abstract class Pet implements Comparable<Pet>{

    String name;

    public Pet(){

    }
    public Pet(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String makeSound(){
        return null;
    }

    public int compareTo(Pet o) {
        int comparing = this.name.compareTo(o.name);
        return comparing;
    }
}
