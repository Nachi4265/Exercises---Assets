package com.pluralsight;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;
    private int constructor;



    //CONSTRUCTOR
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.constructor = constructor;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
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


        int carYearOld = getYear();
        double finalValue = 0.00;

        switch (carYearOld){
            case 1,2,3:
                finalValue = getOriginalCost() - (getOriginalCost()* 0.03);
                break;
            case 4,5,6:
                finalValue = getOriginalCost() - (getOriginalCost() * 0.06);
            case 7,8,9,10:
                finalValue = getOriginalCost() - (getOriginalCost() * 0.08);

            case 11:
                finalValue = getOriginalCost()-1000.00;

            default:finalValue = getOriginalCost();

        }

        if(getOdometer() <100_000  && !(makeModel.toLowerCase().contains("honda") ||  makeModel.toLowerCase().contains("toyota"))){
            finalValue = finalValue - (finalValue * 0.25);
            return finalValue;
        }else {
            return finalValue;
        }


        // A car's value is determined as
        // 0-3 years old  - 3% reduced value of cost per year
        // 4-6 years old  - 6% reduced value of cost per year
        // 7-10 years old - 8% reduced value of cost per year
        // over 10 years old - $1000.00
        // MINUS reduce final value by 25% if over 100,000 miles
        //unless makeModel contains word Honda or Toyota
    }
    @Override
    public String toString() {
        return super.toString() + String.format("| %-15s | %-10d | %-10d",makeModel,year,odometer);

    }
}
