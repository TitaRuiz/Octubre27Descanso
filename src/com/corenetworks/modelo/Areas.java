package com.corenetworks.modelo;

public class Areas {

    public double calcularAreaRectangulo(double base, double altura){
        return base*altura;
    }

    public double calcularAreaCirculo(double radio){
        return Math.PI* Math.pow(radio,2);
        //return Math.PI *(radio * radio);
    }
}
