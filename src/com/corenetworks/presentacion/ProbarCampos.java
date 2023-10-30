package com.corenetworks.presentacion;

import com.corenetworks.modelo.Campos;

public class ProbarCampos {
    public static void main(String[] args) {
        Campos c1 = new Campos(5);
        c1.incrementa();
        c1.incrementa();
        System.out.println(c1.mostrar());

    }
}
