package com.ks.example.spring.utilities;

public class Utilities {

    public int onlyPositiveValues(String value) {

        int valor;

        try{
            valor = Integer.parseInt(value);
            return valor;
        }
        catch(NumberFormatException e){
            return -1;
        }

    }
}
