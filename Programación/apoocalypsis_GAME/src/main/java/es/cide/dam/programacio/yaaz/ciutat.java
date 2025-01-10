package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class ciutat {
    private String nom;
    private int tamany;
    private zombie[] ruta;
    private Random rand = new Random();

    public ciutat(String nom, int tamany) {
        // Constructor donde le doy un valor inicial a las variables
        this.nom = nom;
        this.tamany = tamany;
        this.ruta = new zombie[tamany];

        for (int i = 0; i < tamany; i++) { // Creo un array de zombies
            if (rand.nextInt(10) == 0) { // 1 de cada 10 zombies será un superZombie
                this.ruta[i] = new superZombie(60, 10, 5); // Le doy valores iniciales al superZombie
            } else {
                this.ruta[i] = new zombie(20, 5, 5); // Le doy valores iniciales a los zombies normales
            }
        }
    }

    // Metodo para mostrar nombre
    public String getNom() {
        return nom;
    }

    // Metodo para mostrar tamaño
    public int getTamany() {
        return tamany;
    }

    // Metodo para ingresar el nombre
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Metodo para ingresar el tamaño
    public void setTamany(int tamany) {
        this.tamany = tamany;
    }

    // Metodo que devuelve la posición del zombie
    public zombie posicio(int numZombies) {
        return ruta[numZombies];
    }
}