package com.example.foodapp.Model;

public class Products {

    private String name, discription, price, purl;

    public Products(){

    }

    public Products(String name, String discription, String price, String purl) {
        this.name = name;
        this.discription = discription;
        this.price = price;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDescription(String description) {
        this.discription = discription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}

