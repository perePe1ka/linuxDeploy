package ru.vladuss.adminka_linux.models;

import java.time.LocalDateTime;

public class Car extends BaseEntity{

    private Long milleage;
    private Double price;


    public Car() {

    }

    public Car(Long milleage, Double price) {
        this.milleage = milleage;
        this.price = price;
    }

    public Long getMilleage() {
        return milleage;
    }

    public void setMilleage(Long milleage) {
        this.milleage = milleage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
