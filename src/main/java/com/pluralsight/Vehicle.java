package com.pluralsight;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int constructor;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int constructor) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.constructor = constructor;
    }


    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getConstructor() {
        return constructor;
    }

    public void setConstructor(int constructor) {
        this.constructor = constructor;
    }


    @Override
    public double getValue(){
        // A car's value is determined as
        // 0-3 years old  - 3% reduced value of cost per year
        // 4-6 years old  - 6% reduced value of cost per year
        // 7-10 years old - 8% reduced value of cost per year
        // over 10 years old - $1000.00
        // MINUS  reduce final value by 25% if over 100,000 miles
        //unless makeModel contains word Honda or Toyota
    }






}
