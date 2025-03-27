package NivelIntermediario.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class ListaNinja {

    private LinkedList<Ninja> lista;

    public ListaNinja() {
        this.lista = new LinkedList<>();
    }

    public void adicionarNinjaInicio(Ninja ninja) {
        this.lista.addFirst(ninja);
    }

    public void adicionarNinjaFim(Ninja ninja) {
        this.lista.addLast(ninja);
    }

    public void removerNinjaInicio() {
        this.lista.removeFirst();
    }

    public void removerNinjaFim() {
        this.lista.removeLast();
    }

    public int procurarNinja(String buscarnome) {
        for (int i = 0; i < lista.size(); i++) {
            if (this.lista.get(i).getNome().equalsIgnoreCase(buscarnome)) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarNinjas() {
        for (Ninja ninja : this.lista) {
            System.out.println(ninja);
        }
    }

    public String mostrarPrimeiroNinja() {
        return this.lista.getFirst().getNome();
    }

    public String mostrarUltimoNinja() {
        return this.lista.getLast().getNome();
    }

    public void ordenarPorNome(){
        this.lista.sort((Ninja a, Ninja b) -> a.getNome().compareToIgnoreCase(b.getNome()));
    }

    public void ordenarPorIdade(){
        this.lista.sort(Comparator.comparing(Ninja::getIdade));
    }

    public void ordenarPorAldeia(){
        this.lista.sort((Ninja a, Ninja b) -> a.getAldeia().compareToIgnoreCase(b.getAldeia()));
    }
}
