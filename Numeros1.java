package Java_curso.Arrays;

/* Exercicios de arrays
    - Crie um array de inteiros com os valores {10, 20, 30, 40, 50} e imprima cada elemento com System.out.println
    - Some todos os valores de um array {5, 10, 15, 20} e imprima o total.
    - Crie um array de 4 posições. Preencha com zeros. Depois, altere cada posição para conter o número da posição multiplicado por 2. Imprima o resultado.
    - Crie um array com os números {3, 11, 7, 25, 4} e encontre o maior número dentro dele.
 */

public class Numeros1 {
   int[] valores = new int[] {10, 20,30,40,50};
   int[] arrayComNulos = new int[4];
   int[] maiorNumArray = new int[] {3, 11, 7, 25, 4};


   public void imprimirArray() { // duas formas de imprimir valores de um array
       for (int num : valores) {
           System.out.print(num + " ");
       }

       System.out.println("");

       for (int i = 0; i < valores.length ; i++) {
           System.out.print(valores[i] + " ");
       }
   }

   public void somaArray() {
       int soma = 0;

       for (int valor : valores) {
           soma += valor;
       }
       System.out.println("A soma final é " + soma);
   }

   public void imprimirArrayComNulos() {
       // mostrando os valores default
       for (int num : arrayComNulos) {
           System.out.print(num + " ");
       }

       System.out.println("");

       // alterando os valores para a regra pos * 2
       for ( int pos = 0; pos < arrayComNulos.length; pos++) {
           arrayComNulos[pos] = pos*2;
           System.out.print(arrayComNulos[pos] + " ");
       }
   }

    public void imprimirMaiorNumArray() {
        int maior = 0;
        int menor = 0;

        for (int num : maiorNumArray) {
            menor = num;

            if (menor > maior) {
                maior = menor;
                System.out.println("O maior: " + maior);
            }
        }
        System.out.println("O maior final é: " + maior);
    }
}
