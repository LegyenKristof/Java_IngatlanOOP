package com.company;

public class Main {

    public static void main(String[] args) {
        RealEstates realEstates = new RealEstates("realestatetransactions.csv");
        for (RealEstate r : realEstates.getRealEstateList()){
            System.out.println(r);
        }
    }
}
