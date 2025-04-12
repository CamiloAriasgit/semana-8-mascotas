package com.example;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Pogi", "Angor Nord", 3, 34, "Blanco", "Bien");
        gato.mostrarInformacion();
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar(); 
        System.out.println(" ");

        Perro perro = new Perro("Tony", "Belga Malinois", 5, 120, "Oscuro", "Bien");
        perro.mostrarInformacion();
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar(); 
        System.out.println(" ");

        Pajaro pajaro = new Pajaro("Lorenxo", "Canarius R32", 1, 10, "Verde", "Bien");
        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar(); 
        System.out.println(" ");

        Tortuga tortuga = new Tortuga ("Chaparro", "Africain Turtle", 1, 22, "Café", "Bien");
        tortuga.mostrarInformacion();
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar(); 
        System.out.println(" ");
    }
}