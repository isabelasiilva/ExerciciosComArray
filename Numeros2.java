package Java_curso.Arrays;

import org.w3c.dom.ls.LSOutput;

public class Numeros2 {
    /* Exercicios de arrays
        - Crie um array de inteiros com os valores {9, 2, 15, 3, 7}. Percorra o array e encontre o menor valor.
        - Dado o array {1, 4, 6, 7, 9, 10}, conte quantos valores pares existem no array e imprima esse total.
        - Calcule e imprima a média aritmética do array {5, 10, 15, 20, 25}
        - Dado o array {1, 2, 3, 4, 5}, imprima os valores na ordem inversa, sem alterar o array original.
        - Crie um array de nomes do tipo String com os valores {"Ana", "Carlos", "João", "Maria"}.
        Peça ao usuário um nome (simulado com uma variável) e verifique se ele está presente no array.
        - Crie um array {7, 2, 10, 4, 8}. Encontre o segundo maior número dentro do array.
     */

    byte[] arrayDoMenor = new byte[]{9, 2, 15, 3, 7};
    byte[] arrayComPares = new byte[]{1, 4, 6, 7, 9, 10};
    byte[] arrayMedia = new byte[]{5, 10, 15, 20, 25};
    int[] arrayInverso = new int[]{1, 2, 3, 4, 5};
    String[] arrayNomes = new String[]{"Ana", "Carlos", "João", "Maria"};

    public byte imprimeMenor() {
        byte menor = arrayDoMenor[0];

        for (byte num : arrayDoMenor) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public void imprimePares() {
        byte quantidade = 0;
        for (byte par : arrayComPares) {
            if (par % 2 == 0) {
                quantidade++;
                System.out.println(par);
            }
        }
        System.out.println("Existem " + quantidade + " elementos pares nesse array");
    }

    public void imprimeMedia() {
        byte soma = 0;
        byte quantidade = 0;
        int media;

        for (byte num : arrayMedia) {
            quantidade++;
            soma += num;
        }

        media = soma / quantidade;
        System.out.println("A média aritmética é: " + media);
    }    

    public void imprimeArrayInverso() {
        for (int i = arrayInverso.length - 1; i >= 0; i--) {
            System.out.print(arrayInverso[i] + " ");
        }
    }

    public void imprimeArrayNomes() {
        String nome = "Maria";

        for (String nom : arrayNomes) {
            if (nom.equals(nome)) {
                System.out.println("verdadeiro");
            } else {
                continue;
            }
        }
    }
}
