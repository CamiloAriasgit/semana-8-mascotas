package com.example;

public class Tortuga extends Mascota {
    
    public Tortuga (String nombre, String raza, int edad, int tamano, String color, String estadoSalud){
        super(nombre, raza, edad, tamano, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La tortuga está gimiendo");
    }

    @Override
    public void alimentar() {
        System.out.println("La tortuga está comiendo");
    }

    @Override
    public void cuidar() {
        System.out.println("La tortuga está encerrada");
    }
}
