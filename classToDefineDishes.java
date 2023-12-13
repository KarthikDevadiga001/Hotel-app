package com.Karthikdevadiga.udupihotel;

import androidx.annotation.NonNull;

public class Dishes {

    String name;
    String discription;
    int price;

    Dishes(String name, String discription, int price){

        this.name=name;
        this.discription=discription;
        this.price=price;
    }

    @NonNull
    @Override
    public String toString() {

        return this.name+ " :-   "+this.discription+ "        price :-  " + this.price;

    }
}

