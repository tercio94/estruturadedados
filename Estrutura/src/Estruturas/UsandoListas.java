package Estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class UsandoListas {

    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Cinza");

        imprimirEstatisticas(cores);

        cores.remove(1);
        imprimir("Removendo o segundo", cores);
        cores.add(1, "Branco");
        imprimir("Cores Favoritas:", cores);

        Collections.sort(cores);
        imprimir("Cores Favoritas em Ordem Alfabetica:", cores);

        cores.remove("Cinza");
        imprimir("Cores Favoritas Removendo Uma Delas:", cores);

        cores.add(1, "Cinza");
        Collections.reverse(cores);
        imprimir("Cores Favoritas em Ordem Descrecente:", cores);
    }

    private static void imprimir(String titulo, List<String> cores) {
        System.out.println(titulo);
        System.out.println(cores);
        separar();
    }

    private static void separar() {
        System.out.println("------------------");
    }

    private static void imprimirEstatisticas(List<String> cores) {
        System.out.println("Quantidade de Cores " + cores.size());
        separar();
    }

}












