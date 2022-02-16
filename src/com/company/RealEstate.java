package com.company;

import java.time.LocalDateTime;

public class RealEstate {
    private String street, city, state, type;
    private int zip, beds, baths, sqFt, price;
    private double latitude, longitude;
    private LocalDateTime saleDate;

    public RealEstate(String s){
        String[] datas = s.split(",");
        this.street = datas[0];
        this.city = datas[1];
        this.zip = Integer.parseInt(datas[2]);
        this.state = datas[3];
        this.beds = Integer.parseInt(datas[4]);
        this.baths = Integer.parseInt(datas[5]);
        this.sqFt = Integer.parseInt(datas[6]);
        this.type = datas[7];
//        this.saleDate = datas[8];
        this.price = Integer.parseInt(datas[9]);
        this.latitude = Double.parseDouble(datas[10]);
        this.longitude = Double.parseDouble(datas[11]);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return String.format("%-55s %-12s %8s db %11d nm %12d$", String.format("%d %s %s", zip, city, street), type, beds, sqFt, price);
    }
}
