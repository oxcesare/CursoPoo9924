package com.mx.curso.objetos;

public class Alumno {

    private int age;
    private String gender;

    //constructor por defecto
    public Alumno() {

    }


    //setters y getters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Alumno{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
