package com.company;

import jdk.dynalink.linker.LinkerServices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RealEstates {

    private List<RealEstate> realEstateList;

    public RealEstates(String fileName){
        try {
            realEstateList = new ArrayList<>();
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            String line = br.readLine();
            while (line != null){
                realEstateList.add(new RealEstate(line));
                line = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public List<RealEstate> getRealEstateList() {
        return realEstateList;
    }

    public void setRealEstateList(List<RealEstate> realEstateList) {
        this.realEstateList = realEstateList;
    }

    public long getSalesNumber() {
        return realEstateList.stream().count();
    }

    public RealEstate getBiggestRealEstate() {
        return realEstateList.stream()
                .max(Comparator.comparingInt(ingatlan -> ingatlan.getSqFt()))
                .get();
    }

    public int getBiggestRealEstateFt(){
        return realEstateList.stream()
                .map(ingatlan -> ingatlan.getSqFt())
                .max(Integer::compareTo)
                .get();
    }

    public long getSalesSummary(){
        return realEstateList.stream()
                .mapToInt(R -> R.getPrice())
                .sum();
    }

    public long getCountOfRealEstateWithoutSize(){
        return realEstateList.stream()
                .filter(i -> i.getSqFt() == 0)
                .count();
    }

    public boolean isSaleRealEstateInCity(String c){
        return realEstateList.stream()
                .anyMatch(i -> i.getCity().equals(c));
    }

    public long getCountOfSalesInCity(String c){
        return realEstateList.stream()
                .filter(i -> i.getSqFt() == 0)
                .count();
    }
}
