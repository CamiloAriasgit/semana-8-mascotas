package com.example;

public abstract class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private int tamano;
    private String color;
    private String estadoSalud;

    public Mascota(String nombre, String raza, int edad, int tamano, String color, String estadoSalud) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.color = color;
        this.estadoSalud = estadoSalud;
    }

    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }
    public int getTamano(){
        return tamano;
    }
    public String getColor(){
        return color;
    }
    public String getEstadoSalud(){
        return estadoSalud;
    }

    public abstract void hacerSonido();

    public abstract void alimentar();
    
    public abstract void cuidar();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Color: " + color);
        System.out.println("Estado de salud: " + estadoSalud);
    }

}
