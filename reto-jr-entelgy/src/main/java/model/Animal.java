package model;

import lombok.Data;

@Data
/**
 *
 * @author cupej
 */
public abstract class Animal{

    private String nombre;
    private int edad;
    private String raza;
    private int tiempoDeVida;
    private String tipo;
}

 public abstract void realizarSonido();

    public void describir() {
        System.out.println(nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " años. Siempre ");
        realizarSonido();
        System.out.println("cuando está feliz" + tiempoDeVida + " años.");
    }
}

public class Perro extends Animal {

    public Perro(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Perro");
    }

    @Override
    public void realizarSonido() {
        System.out.println("Ladrar");
    }
}

public class Gato extends Animal {

    public Gato(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Gato");
    }

    @Override
    public void realizarSonido() {
        System.out.println("Maullar");
    }
}
