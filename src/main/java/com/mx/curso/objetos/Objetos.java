package com.mx.curso.objetos;

public class Objetos {

    private String propiedad1;
    private String propiedad2;
    private String propiedad3;


    public Objetos(String propiedad1, String propiedad2, String propiedad3) {
        this.propiedad1 = propiedad1;
        this.propiedad2 = propiedad2;
        this.propiedad3 = propiedad3;
    }


    public String getPropiedad1() {
        return propiedad1;
    }

    public void setPropiedad1(String propiedad1) {
        this.propiedad1 = propiedad1;
    }

    public String getPropiedad2() {
        return propiedad2;
    }

    public void setPropiedad2(String propiedad2) {
        this.propiedad2 = propiedad2;
    }

    public String getPropiedad3() {
        return propiedad3;
    }

    public void setPropiedad3(String propiedad3) {
        this.propiedad3 = propiedad3;
    }

    @Override
    public String toString() {
        return "Objetos{" +
                "propiedad1='" + propiedad1 + '\'' +
                ", propiedad2='" + propiedad2 + '\'' +
                ", propiedad3='" + propiedad3 + '\'' +
                '}';
    }
}
