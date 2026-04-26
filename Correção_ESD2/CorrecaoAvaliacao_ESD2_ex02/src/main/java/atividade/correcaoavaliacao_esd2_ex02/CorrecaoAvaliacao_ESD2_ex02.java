package atividade.correcaoavaliacao_esd2_ex02;

import java.util.Arrays;

public class CorrecaoAvaliacao_ESD2_ex02 {

    public static void main(String[] args) {
        int[] listaExemplo = {11, 4, 30, 22, 7, 26};

        System.out.println("Lista original: " + Arrays.toString(listaExemplo));

        selection_sort_inverse(listaExemplo);

        System.out.println("Lista ordenada decrescente: " + Arrays.toString(listaExemplo));
    }

    public static void selection_sort_inverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indiceMaior = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[indiceMaior]) {
                    indiceMaior = j;
                }
            }

            int temp = array[i];
            array[i] = array[indiceMaior];
            array[indiceMaior] = temp;
        }
    }
}