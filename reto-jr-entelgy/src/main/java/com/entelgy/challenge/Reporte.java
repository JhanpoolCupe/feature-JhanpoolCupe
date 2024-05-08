package com.entelgy.challenge;

public class Reporte {

    public static void main(String[] args) {
        Animal[] animales = cargarAnimales();
        
    }

        public static Animal[] cargarAnimales() {
        Perro perro1 = new Perro("Firulais", 5, "Labrador", 12, "Perro");

        Gato gato1 = new Gato("Garfield", 4, "Persa", 15, "Gato");

        Vaca vaca1 = new Vaca("Margarita", 8, "Holstein", 20, "Vaca");

        Animal[] animales = {perro1, gato1, vaca1};
        return animales;
    }
}
