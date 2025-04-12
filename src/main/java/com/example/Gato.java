package com.example;

public class Gato extends Mascota {
    
    public Gato(String nombre, String raza, int edad, int tamano, String color, String estadoSalud){
        super(nombre, raza, edad, tamano, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato está maullando");
    }

    @Override
    public void alimentar() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void cuidar() {
        System.out.println("El gato está encerrado");
    }
}
