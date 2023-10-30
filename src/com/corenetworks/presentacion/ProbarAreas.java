package com.corenetworks.presentacion;

import com.corenetworks.modelo.Areas;

public class ProbarAreas {
    public static void main(String[] args) {
        Areas a1 = new Areas();
        System.out.println(a1.calcularAreaCirculo(1.5));
        System.out.println(a1.calcularAreaRectangulo(3,5));
    }
}
