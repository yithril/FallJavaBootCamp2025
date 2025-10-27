package org.example;

public class Drink {
    private String name;
    private DrinkSize size;
    private boolean hasWhippedCream;

    public Drink(String name){
        this.name = name;
        this.size = DrinkSize.MEDIUM;
        this.hasWhippedCream = false;
    }

    public Drink(String name, DrinkSize size){
        this.name = name;
        this.size = size;
        this.hasWhippedCream = false;
    }

    public Drink(String name, DrinkSize size, boolean hasWhippedCream) {
        this.name = name;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    public boolean isHasWhippedCream() {
        return hasWhippedCream;
    }

    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }

    public double getPrice(){
        double price;
        switch(size){
            case SMALL:
                price = 3;
                break;
            case MEDIUM:
                price = 3.5;
                break;
            case LARGE:
                price = 4;
                break;
            default:
                price = 3;
                break;
        }

        if(hasWhippedCream){
            price += .5;
        }

        return price;
    }
}
