package com.example;

public class Perro extends Mascota {
    
    public Perro(String nombre, String raza, int edad, int tamano, String color, String estadoSalud){
        super(nombre, raza, edad, tamano, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro está ladrando");
    }

    @Override
    public void alimentar() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void cuidar() {
        System.out.println("El perro está encerrado");
    }
}
