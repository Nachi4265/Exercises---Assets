package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Asset>myAssets = new ArrayList<>();

//    Asset goldBar = new Asset("Solid Gold Bar","2020-10-10",10_000);

        //Houses
        House myHouse = new House("Hignacio Home","2002-10-16",10_000,"123 WizardDude dr",2,2_422, 500);
        House vacationHome = new House("Da Crib","2025-10-28",100_000,"425 SomeStreet",3,4_000,600);

        //Vehicle
        Vehicle myVehicle = new Vehicle("Coupe","2022-01-20",12_000,"Infiniti G37",2009);
        Vehicle oldVehicle = new Vehicle("Truck","1999-04-23",2_000,"Toyota",1996);


        myAssets.add(myHouse);
        myAssets.add(vacationHome);
        myAssets.add(myVehicle);
        myAssets.add(oldVehicle);

        for(Asset asset : myAssets){

            if(asset instanceof House h){
                System.out.println(h);
            }

            if(asset instanceof Vehicle v){
                System.out.println(v);
            }
        }
    }



}