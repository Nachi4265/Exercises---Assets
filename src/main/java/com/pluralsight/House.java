package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;  // (1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;


    //CONSTRUCTOR
    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }



    //todo
    @Override
    public double getValue(){

        int condition = getCondition();
        double pricePerSquareFoot = 0.00;

        switch (condition){
            case 1:
                pricePerSquareFoot = 180.00;
                break;
            case 2:
                pricePerSquareFoot = 130.00;
                break;
            case 3:
                pricePerSquareFoot = 90.00;
                break;
            case 4:
                pricePerSquareFoot = 80.00;
                break;
            default:
                pricePerSquareFoot = 0.00;
        }
        return (pricePerSquareFoot * getSquareFoot()) + 0.25 * getLotSize();

        // A house's value is determined as
        // $180.00 per square foot (excellent)
        // $130.00 per square foot (good)
        // $90.00 per square foot (fair)
        // $80.00 per square foot (poor)
        // PLUS  25 cents per square foot of lot size
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Address: %-19s | Condition: %-12s | Square Foot: %-17d | Lot Size: %-13d" ,address,condition,squareFoot,lotSize);


    }
}
