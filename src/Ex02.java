public class Ex02 {
    public static void main(String[] args) {
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        //a) Imprima o valor da nota do primeiro elemento do terceiro array de notas.
        System.out.println(notas[2][0]); // 8

        //b) Imprima o valor da nota do segundo elemento do quarto array de notas.
        System.out.println(notas[3][1]); // 9.5

        //c) Imprima o valor da soma das quatro primeiras notas de cada array.
        for (int i=0; i<notas.length; i++) {
            double soma = 0;
            for (int j=0; j<notas[i].length; j++) {
                soma = soma + notas[i][j];
            }
            System.out.println("Soma do " + (i+1) + " ° array = " + soma);

        }
    }
}
