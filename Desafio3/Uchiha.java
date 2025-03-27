package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidade() {
        System.out.println("\nHabilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.printf("Nome: %s\nIdade: %d\nMissao atual: %s\nNivel de Dificuldade: %s\nStatus da Missao: %s", nome, idade, missao, nivelDificuldade, statusMissao);
        mostrarHabilidade();
        System.out.println("============");
    }
}

