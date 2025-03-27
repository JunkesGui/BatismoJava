package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Definição do tamanho que será o array para armazenar os cadastros
        System.out.println("Quantos ninjas serão cadastrados?");
        int qntdCadastros = scanner.nextInt();
        scanner.nextLine();

        //Inicialização dos arrays com as informações dos cadastros
        String [] nomes = new String[qntdCadastros];
        int [] idades = new int[qntdCadastros];
        String [] missoes = new String[qntdCadastros];
        String [] nivelDificuldades = new String[qntdCadastros];
        String [] statusMissoes = new String[qntdCadastros];
        String [] habilidadesUchihas = new String[qntdCadastros];

        //Objetos que irão receber os atributos do cadastro
        Ninja ninja = new Ninja();
        Uchiha uchiha = new Uchiha();

        //Variaveis de controle
        byte menuCursor = 0;
        int cadastrosFeitos = 0;

        //Menu
        while (menuCursor != 4) {
            //Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Mudar Habilidade Uchiha");
            System.out.print("Escolha uma opção: ");
            menuCursor = scanner.nextByte();
            scanner.nextLine();

            switch (menuCursor) {
                //1. Cadastrar Ninja
                case 1:
                    if (cadastrosFeitos == qntdCadastros) {
                        System.out.println("Opa, parece que voce atingiu o numero maximo de cadastros!");
                    } else {
                        //CadastroArray
                        System.out.println("Cadastrando um Ninja...");
                        System.out.print("Digite o nome do ninja: ");
                        nomes[cadastrosFeitos] = scanner.nextLine();
                        System.out.printf("Digite a idade de %s: ",nomes[cadastrosFeitos]);
                        idades[cadastrosFeitos] = scanner.nextInt();
                        scanner.nextLine();
                        System.out.printf("Digite a missao de %s: ",nomes[cadastrosFeitos]);
                        missoes[cadastrosFeitos] = scanner.nextLine();
                        System.out.printf("Digite a dificuldade de %s: ",missoes[cadastrosFeitos]);
                        nivelDificuldades[cadastrosFeitos] = scanner.nextLine();
                        System.out.print("Digite o status atual desta missao: ");
                        statusMissoes[cadastrosFeitos] = scanner.nextLine();

                        //Selecionando Uchiha ou ninja genérico
                        System.out.println("O ninja terá uma habilidade especial?");
                        System.out.println("[1] Sim [2] Não");
                        while (menuCursor != 3) {
                            menuCursor = scanner.nextByte();
                            scanner.nextLine();
                            switch (menuCursor) {
                                case 1: //Cadastro Uchiha
                                    System.out.println("Qual será a habilidade deste ninja?");
                                    habilidadesUchihas[cadastrosFeitos] = scanner.nextLine();

                                    //Salvando o ultimo cadastro no objeto uchiha
                                    uchiha.nome = nomes[cadastrosFeitos];
                                    uchiha.idade = idades[cadastrosFeitos];
                                    uchiha.missao = missoes[cadastrosFeitos];
                                    uchiha.nivelDificuldade = nivelDificuldades[cadastrosFeitos];
                                    uchiha.statusMissao = statusMissoes[cadastrosFeitos];
                                    uchiha.habilidadeEspecial = habilidadesUchihas[cadastrosFeitos];

                                    //Mostrando infos com o metodo mostrarInformacoes
                                    System.out.println("O ninja cadastrado foi: ");
                                    uchiha.mostrarInformacoes();
                                    cadastrosFeitos++;
                                    menuCursor = 3;
                                    break;
                                case 2: //Cadastro Ninja
                                    //Salvando o ultimo cadastro no objeto ninja
                                    ninja.nome = nomes[cadastrosFeitos];
                                    ninja.idade = idades[cadastrosFeitos];
                                    ninja.missao = missoes[cadastrosFeitos];
                                    ninja.nivelDificuldade = nivelDificuldades[cadastrosFeitos];
                                    ninja.statusMissao = statusMissoes[cadastrosFeitos];

                                    //Mostrando infos com o metodo mostrarInformacoes
                                    System.out.println("O ninja cadastrado foi: ");
                                    ninja.mostrarInformacoes();
                                    cadastrosFeitos++;
                                    menuCursor = 3;
                                    break;
                            }
                        }
                    }
                    break;

                //2. Listar Ninjas
                case 2:
                    if (cadastrosFeitos==0){
                        System.out.println("Opa, parece que ainda não há cadastros para exibir");
                    }else {
                        for (int i = 0; i < cadastrosFeitos; i++) {
                            System.out.println("Nome: "+nomes[i]);
                            System.out.println("Idade: "+idades[i]);
                            System.out.println("Missao: "+missoes[i]);
                            System.out.println("Dificuldade: "+nivelDificuldades[i]);
                            System.out.println("Status: "+statusMissoes[i]);
                            if (habilidadesUchihas[i]!=null) {
                                System.out.println("Habilidade: " + habilidadesUchihas[i]);
                            }
                            System.out.println("================");
                        }
                    }
                    break;

                //3. Mudar Habilidade Uchiha
                case 3:
                    System.out.println("Qual habilidade deseja alterar?");
                    for (int i = 0; i < habilidadesUchihas.length; i++) {
                        if (habilidadesUchihas[i]!=null) {
                            System.out.printf("Habilidade: %s [%d]\n", habilidadesUchihas[i], i);
                        }
                    }
                    menuCursor = scanner.nextByte();
                    scanner.nextLine();
                    System.out.println("Qual será a nova habilidade que irá substituir "+habilidadesUchihas[menuCursor]);
                    habilidadesUchihas[menuCursor] = scanner.nextLine();
                    System.out.println("Habilidade alterada com sucesso!");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente!");
                    break;
            }
        }
        scanner.close();
    }
}
