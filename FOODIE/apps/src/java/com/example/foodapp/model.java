package com.example.foodapp;

public class model
{
  String name,price,discription,purl;
    model()
    {

    }
    public model(String name, String price, String discription, String purl) {
        this.name = name;
        this.price = price;
        this.discription = discription;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
