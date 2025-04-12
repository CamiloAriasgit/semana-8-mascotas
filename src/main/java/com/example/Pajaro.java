package com.example;

public class Pajaro extends Mascota {
    
    public Pajaro(String nombre, String raza, int edad, int tamano, String color, String estadoSalud){
        super(nombre, raza, edad, tamano, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro está cantando");
    }

    @Override
    public void alimentar() {
        System.out.println("El pajaro está comiendo");
    }

    @Override
    public void cuidar() {
        System.out.println("El pajaro está encerrado");
    }
}
