package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente NarutoCorrente = new ContaCorrente(135.10, "Naruto");
        ContaPoupanca NarutoPoupanca = new ContaPoupanca(10, "Naruto");
        ContaCorrente SasukeCorrente = new ContaCorrente(43.15, "Sasuke");

        //Transferencia para conta corrente
        System.out.println("Narutinho está devendo um PIX de cemzão pro Sasuke...");
        NarutoCorrente.transferir(100,SasukeCorrente);
        System.out.println("=============================");

        //Consulta saldo
        System.out.println("Agora ao consultar seu saldo se depara com");
        NarutoCorrente.consultarSaldo();
        System.out.println("=============================");

        //Transferencia para conta poupança
        System.out.println("Então narutinho decide colocar esse dinheiro para render na poupança de Konoha");
        NarutoCorrente.transferir(35.10,NarutoPoupanca);
        System.out.println("Fazendo um total de: " + NarutoPoupanca.saldo);

        NarutoPoupanca.rendimento();


    }
}
