package com.example.mylistview;

public class Fruit {
    private int  imageViewid;
    private String name;

    public Fruit(int imageView, String name) {
        this.imageViewid = imageView;
        this.name = name;
    }

    public int getImageView() {
        return imageViewid;
    }

    public void setImageView(int imageView) {
        this.imageViewid = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "imageViewid=" + imageViewid +
                ", name='" + name + '\'' +
                '}';
    }
}
