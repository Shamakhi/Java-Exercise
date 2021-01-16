package com.company;

public class Main {

    public static void main(String[] args) {
	Car car=CarFactory.getCar(CarBrands.Benz);
	car.getSpecs();
    }
}
