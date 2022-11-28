package application;

import entities.Baralho;
import entities.Carta;
import entities.Jogador;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralho baralho = new Baralho();
        baralho.embaralharCartas();
        System.out.println("Quantos pessoas irão jogar: ");
        int qtdeJogadores = scanner.nextInt();
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

        for(int i = 0; i < qtdeJogadores; i++){
            jogadores.add(new Jogador(baralho.getCartas().get(52-1),baralho.getCartas().get(52-i-1)));
            int numeroDoJogador = i+1;

            System.out.println("Cartas do jogador " + numeroDoJogador +  " : ");
            System.out.println(jogadores.get(i).getCartas1());
            System.out.println(jogadores.get(i).getCartas2());
            System.out.println("-------------------------------");
        }


        String opcoesJogador = obterOpcaoJogador();
        while(opcoesJogador != "x") {
            switch (opcoesJogador) {
                case "1":
                    System.out.println("Qual Jogador deseja abandonar a mão?");
                    int covarde = scanner.nextInt();
                    scanner.nextLine();
                    jogadores.remove(covarde - 1);
                    for (Jogador c : jogadores
                    ) {
                        System.out.println(c.getCartas1());
                        System.out.println(c.getCartas2());
                    }
                    break;
                case "2":
                    System.out.println("Qual valor Deseja Apostar?");
                    int corajoso = scanner.nextInt();
                    

                default:
                    System.out.println("Opção inválida");

            }
            opcoesJogador = obterOpcaoJogador();
        }
    }
    public static String obterOpcaoJogador(){
        System.out.println("Digite a opcao desejada: ");
        System.out.println("Abandonar a mao-1: ");
        System.out.println("Apostar-2: ");
        System.out.println("Adcionar novo jogador-3: ");
        System.out.println("Encerrar jogo-x: ");
        Scanner sc = new Scanner(System.in);
        String opcaoJogador = sc.nextLine();

        return opcaoJogador;
    }

}
