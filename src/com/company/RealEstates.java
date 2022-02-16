package com.company;

import jdk.dynalink.linker.LinkerServices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
}
