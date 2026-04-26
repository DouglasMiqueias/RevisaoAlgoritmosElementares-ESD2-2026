package atividade.correcaoavaliacao_esd2_ex03;

public class CorrecaoAvaliacao_ESD2_ex03 {

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Fernanda", "João", "Carlos", "Beatriz", "Lu"};

        insertionSortPorTamanho(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void insertionSortPorTamanho(String[] lista) {
        for (int i = 1; i < lista.length; i++) {
            String key = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j].length() > key.length()) {
                lista[j + 1] = lista[j];
                j--;
            }

            lista[j + 1] = key;
        }
    }
}