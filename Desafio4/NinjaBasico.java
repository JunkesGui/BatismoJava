package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Nome: %s\nIdade: %d\nHabilidade: %s\n", nome,idade,habilidade);
    }
    @Override
    public void executarHabilidade() {
        System.out.printf("%s executou a habilidade %s sem especialidade.\n", nome,habilidade);
    }
}
