package NivelIntermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public NinjaAvancado(int idade, String nome, String habilidade, String especialidade) {
        super(nome,idade,habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Nome: %s\nIdade: %d\nHabilidade: %s\nEspecialidade: %s\n", nome,idade,habilidade,especialidade);
    }
    @Override
    public void executarHabilidade() {
        System.out.printf("%s executou a habilidade %s com a especialidade %s!\n", nome,habilidade,especialidade);
    }
}
