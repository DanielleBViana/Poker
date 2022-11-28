package entities;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<Carta>();
    public Baralho(){
        for (int i = 0; i <= 3; i++){ //4 naipes
            for (int j = 0; j <= 12; j++){ //13 cartas
                cartas.add(new Carta(i,j));
            }
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void embaralharCartas(){
        int index_1,index_2;
        Random genarator = new Random();
        Carta temp;

        int tamanhoDoBaralho = cartas.size()-1;

        for(int i = 0; i <= 100; i++){
            index_1 = genarator.nextInt(tamanhoDoBaralho);
            index_2 = genarator.nextInt(tamanhoDoBaralho);

            temp = cartas.get(index_2);
            cartas.set(index_2, cartas.get(index_1));
            cartas.set(index_1,temp);
        }
    }

    public Carta darCartas(){
        return cartas.remove( cartas.size()-1);
    }
    public int totalDeCartas(){
        return cartas.size();
    }
    public void mostrarCartas(){
        for (Carta c: cartas
        ) {
            System.out.println(c);
        }
    }

}