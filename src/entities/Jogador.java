package entities;

public class Jogador {
    private Carta cartas1;
    private Carta cartas2;

    public Jogador(Carta cartas1, Carta cartas2) {
        this.cartas1 = cartas1;
        this.cartas2 = cartas2;
    }

    public Carta getCartas1() {
        return cartas1;
    }

    public void setCartas1(Carta cartas1) {
        this.cartas1 = cartas1;
    }

    public Carta getCartas2() {
        return cartas2;
    }

    public void setCartas2(Carta cartas2) {
        this.cartas2 = cartas2;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "cartas1=" + cartas1 +
                ", cartas2=" + cartas2 +
                '}';
    }
}
