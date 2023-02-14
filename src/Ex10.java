public class Ex10 {
    //Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
    public static void main(String[] args) {
        String teste = "Anna";
        System.out.println(verificaPalindromo((teste)));
    }

    public static boolean verificaPalindromo(String palavra){
        palavra = palavra.toLowerCase();

        int i = 0;
        int j = palavra.length() - 1;

        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }

    return true;
    }
}
