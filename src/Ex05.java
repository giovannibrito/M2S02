public class Ex05 {
    public static void main(String[] args) {
        double[] arrayNumerico = {20,10,30};
        calcular(arrayNumerico);
    }

    public static void calcular(double[] arr) {
        try {
            double maior = arr[0];
            double menor = arr[0];
            for(int i = 0; i< arr.length; i++) {
                if (arr[i] < menor) menor = arr[i];
                if (arr[i] > maior) maior = arr[i];
            }
            System.out.println("Menor: " + menor);
            System.out.println("Maior: " + maior);
        } catch(Exception e) {
            System.out.println("Não foi possível calcular");
        }
    }
}
