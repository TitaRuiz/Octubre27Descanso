package com.corenetworks.modelo;

public class Campos {

    //1. Atributos
    private int x;
    //2. Métodos
    public int mostrar(){
        return x;
    }
    public void incrementa(){
        x++;
    }
    //3. Constructores

    public Campos() {
    }

    public Campos(int x) {
        this.x = x;
    }
    //4. Setters y Getters


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
