package atividade.correcaoavaliacao_esd2_ex01;

import java.util.Arrays;

public class CorrecaoAvaliacao_ESD2_ex01 {

    public static void main(String[] args) {
        int[] caso1 = {};
        System.out.println("Lista vazia + 5: " + Arrays.toString(inserir_ordenado(caso1, 5)));

        int[] caso2 = {10, 20, 30};
        System.out.println("Inserindo 5: " + Arrays.toString(inserir_ordenado(caso2, 5)));

        int[] caso3 = {10, 20, 30};
        System.out.println("Inserindo 40: " + Arrays.toString(inserir_ordenado(caso3, 40)));

        int[] caso4 = {10, 20, 30};
        System.out.println("Inserindo 20: " + Arrays.toString(inserir_ordenado(caso4, 20)));

        int[] caso5 = {10, 20, 40, 50};
        System.out.println("Inserindo 30: " + Arrays.toString(inserir_ordenado(caso5, 30)));
    }

    public static int[] inserir_ordenado(int[] array, int x) {
        int[] novoArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];
        }

        novoArray[array.length] = x;

        for (int i = 0; i < novoArray.length - 1; i++) {
            for (int j = 0; j < novoArray.length - 1 - i; j++) {
                if (novoArray[j] > novoArray[j + 1]) {
                    int temp = novoArray[j];
                    novoArray[j] = novoArray[j + 1];
                    novoArray[j + 1] = temp;
                }
            }
        }

        return novoArray;
    }
}