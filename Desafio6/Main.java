package NivelIntermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);
        byte menuCursor = 0;


        ListaNinja lista = new ListaNinja();

        //Sete ninjas iniciais
        lista.adicionarNinjaInicio(new Ninja("Naruto Uzumaki", 17, "Aldeia da Folha"));
        lista.adicionarNinjaInicio(new Ninja("Sasuke Uchiha", 17, "Aldeia da Folha"));
        lista.adicionarNinjaInicio(new Ninja("Sakura Haruno", 17, "Aldeia da Folha"));
        lista.adicionarNinjaInicio(new Ninja("Kakashi Hatake", 31, "Aldeia da Folha"));
        lista.adicionarNinjaInicio(new Ninja("Gaara do Deserto", 17, "Aldeia da Areia"));
        lista.adicionarNinjaInicio(new Ninja("Itachi Uchiha", 23, "Vila da Oculta da Folha"));
        lista.adicionarNinjaInicio(new Ninja("Rock Lee", 17, "Vila da Oculta da Folha"));

        //Menu de usuario
        while (menuCursor != 5){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninjas");
            System.out.println("2. Remover Ninjas");
            System.out.println("3. Mostrar Ninjas");
            System.out.println("4. Ordenar Ninjas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            menuCursor = sc.nextByte();
            sc.nextLine();

            switch (menuCursor) {
                case 1: //CADASTRAR NINJAS
                    Ninja ninja = new Ninja();
                    System.out.println("=====Cadastrar Ninja=====");
                    System.out.print("Nome: ");
                    ninja.setNome(sc.nextLine());
                    System.out.print("Idade: ");
                    ninja.setIdade(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Aldeia: ");
                    ninja.setAldeia(sc.nextLine());
                    System.out.println("Em que posição será adicionado o ninja?");
                    System.out.println("1. Inicio da lista");
                    System.out.println("2. Fim da lista");
                    menuCursor = sc.nextByte();
                    sc.nextLine();
                    switch (menuCursor){
                        case 1:
                            lista.adicionarNinjaInicio(ninja);
                            break;
                        case 2:
                            lista.adicionarNinjaFim(ninja);
                            break;
                        default:
                            System.out.println("Comando Inválido");
                            break;
                    }
                    break;

                case 2: //REMOVER NINJAS
                    System.out.println("=====Remover Ninjas=====");
                    System.out.println("Deseja remover o ninja do inicio ou fim da lista?");
                    System.out.println("1. Inicio da lista");
                    System.out.println("2. Fim da lista");
                    menuCursor = sc.nextByte();
                    sc.nextLine();
                    switch (menuCursor){
                        case 1: //REMOVER DO INICIO
                            System.out.println("Você está removendo o ninja " + lista.mostrarPrimeiroNinja());
                            System.out.println("1. Confirmar");
                            System.out.println("2. Cancelar");
                            menuCursor = sc.nextByte();
                            sc.nextLine();
                            switch (menuCursor){
                                case 1:
                                    lista.removerNinjaInicio();
                                    System.out.println("Ninja removido com sucesso!");
                                    System.out.println("=====Lista atualizada=====");
                                    lista.mostrarNinjas();
                                    break;
                                case 2:
                                    System.out.println("Ação cancelada");
                                    break;
                                default:
                                    System.out.println("Comando Inválido");
                                    break;
                            }
                            break;
                        case 2: //REMOVER DO FINAL
                            System.out.println("Você está removendo o ninja " + lista.mostrarUltimoNinja());
                            System.out.println("1. Confirmar");
                            System.out.println("2. Cancelar");
                            menuCursor = sc.nextByte();
                            sc.nextLine();
                            switch (menuCursor) {
                                case 1:
                                    lista.removerNinjaFim();
                                    System.out.println("Ninja removido com sucesso!");
                                    System.out.println("=====Lista atualizada=====");
                                    lista.mostrarNinjas();
                                    break;
                                case 2:
                                    System.out.println("Ação cancelada");
                                    break;
                                default:
                                    System.out.println("Comando Inválido");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Comando Inválido");
                            break;
                    }
                    break;

                case 3: //MOSTRAR NINJAS
                    System.out.println("=====Mostrar Ninjas=====");
                    System.out.println("Deseja ver a lista completa ou procurar um ninja especifico?");
                    System.out.println("1. Lista Completa");
                    System.out.println("2. Buscar Ninja");
                    menuCursor = sc.nextByte();
                    sc.nextLine();
                    switch (menuCursor) {
                        case 1:
                            System.out.println("=====Lista Completa=====");
                            lista.mostrarNinjas();
                            break;
                        case 2:
                            System.out.print("Digite o nome do Ninja que está buscando: ");
                            String buscarnome = sc.nextLine();
                            if (lista.procurarNinja(buscarnome) != -1) {
                                System.out.println("Este ninja está no index: " + lista.procurarNinja(buscarnome));
                            }else {
                                System.out.println("Este ninja não consta na lista");
                            }
                            break;
                        default:
                            System.out.println("Comando Inválido");
                            break;
                    }
                    break;

                case 4: //ORDENAR NINJAS
                    System.out.println("=====Ordenar Ninjas=====");
                    System.out.println("Qual o parametro da ordenação?");
                    System.out.println("1. Nome");
                    System.out.println("2. Idade");
                    System.out.println("3. Aldeia");
                    menuCursor = sc.nextByte();
                    sc.nextLine();
                    switch (menuCursor) {
                        case 1:
                            System.out.println("Lista Ordenada com sucesso!");
                            lista.ordenarPorNome();
                            System.out.println("=====Lista atualizada=====");
                            lista.mostrarNinjas();
                            break;
                        case 2:
                            System.out.println("Lista Ordenada com sucesso!");
                            lista.ordenarPorIdade();
                            System.out.println("=====Lista atualizada=====");
                            lista.mostrarNinjas();
                            break;
                        case 3:
                            System.out.println("Lista Ordenada com sucesso!");
                            lista.ordenarPorAldeia();
                            System.out.println("=====Lista atualizada=====");
                            lista.mostrarNinjas();
                            break;
                        default:
                            System.out.println("Comando Inválido");
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
