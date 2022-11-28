package entities;

import java.util.Arrays;

public class Carta {
    private int  naipe, numero;
    private String[] naipes = {"PAUS", "ESPADAS","OUROS","COPAS"};
    private String[] numeros = {"As", "Rei", "Rainha", "Valetes", "10", "9", "8", "7", "6", "5","4","3","2"};

    public Carta(int naipe, int numero) {
        this.naipe = naipe;
        this.numero = numero;
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "naipe=" + naipes[naipe] +
                ", numero=" + numeros[numero] +
                '}';
    }
}
