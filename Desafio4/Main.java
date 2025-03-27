package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Narutinho = new NinjaBasico("Narutinho",15,"Basica");
        NinjaAvancado Kakashi = new NinjaAvancado(30, "Kakashao","Avançada","Estilo Avançado");

        Narutinho.mostrarInfo();
        Narutinho.executarHabilidade();

        Kakashi.mostrarInfo();
        Kakashi.executarHabilidade();
    }
}
