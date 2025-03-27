package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Ninja {
    Scanner scanner = new Scanner(System.in);
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.printf("Nome: %s\nIdade: %d\nMissao atual: %s\nNivel de Dificuldade: %s\nStatus da Missao: %s\n", nome, idade,missao,nivelDificuldade,statusMissao);
        System.out.println("============");
    }
}
