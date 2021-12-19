package com.geektech.dz34;

public class PersonModel {
    private int image, phone;
    private String name;

    public PersonModel(int image, String name, int phone) {
        this.image = image;
        this.phone = phone;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
