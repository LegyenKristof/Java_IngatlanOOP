package com.company;

public class Main {

    public static void main(String[] args) {
        RealEstates realEstates = new RealEstates("realestatetransactions.csv");
        System.out.println(realEstates.getSalesNumber());
        System.out.println(realEstates.getBiggestRealEstate());
        System.out.println(realEstates.getBiggestRealEstateFt());
        System.out.println(realEstates.getSalesSummary());
        System.out.println(realEstates.getCountOfRealEstateWithoutSize());
        System.out.println(realEstates.isSaleRealEstateInCity("SACRAMENTO"));
    }
}
